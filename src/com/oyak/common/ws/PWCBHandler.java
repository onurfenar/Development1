package com.oyak.common.ws;

/*
 * Copyright 2009 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.ws.security.WSPasswordCallback;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import java.io.IOException;

/**
 * Simple password callback handler. This just checks for Username Token information, and
 * if found checks that the supplied username and password match the hardcoded values. For
 * a real service implementation, this would be written to verify the username and
 * password against a database or external security mechanism.
 */

public class PWCBHandler implements CallbackHandler
{
    @SuppressWarnings("deprecation")
	public void handle(Callback[] callbacks)
        throws IOException, UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pwcb = (WSPasswordCallback)callbacks[i];
            String id = pwcb.getIdentifier();
            if (pwcb.getUsage() == WSPasswordCallback.USERNAME_TOKEN_UNKNOWN) {
                // used when plaintext password in message
                if (!"libuser".equals(id) || !"books".equals(pwcb.getPassword())) {
                    throw new UnsupportedCallbackException(callbacks[i], "check failed");
                }
                
            } else if (pwcb.getUsage() == WSPasswordCallback.USERNAME_TOKEN) {
                
                // used when hashed password in message
                if ("libuser".equals(id)) {
                    pwcb.setPassword("books");
                }
            }
        }
    }
}
