package com.oyak.common.ws;
import java.io.Serializable;
public class InputMessage implements Serializable{
	private String messageType;
	private String messageVersion;
	private String businessData;
	
	
	
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageVersion() {
		return messageVersion;
	}
	public void setMessageVersion(String messageVersion) {
		this.messageVersion = messageVersion;
	}
	public String getBusinessData() {
		return businessData;
	}
	public void setBusinessData(String businessData) {
		this.businessData = businessData;
	}
}