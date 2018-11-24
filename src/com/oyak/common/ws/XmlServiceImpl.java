package com.oyak.common.ws;

import java.io.StringReader;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.oyak.xml.GolfCountryClub;
import com.oyak.xml.test.MainTest_Encoded;


public class XmlServiceImpl implements XmlService {

	@Override
	public OutputMessage processXML(InputMessage in)
	{
		
		OutputMessage outputMsg = new OutputMessage();
		try {
			// -------------------- HERE IS THE BUSINESS OPERATIONS --------------------
			//String encodedXML = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHRuczpHb2xmQ291bnRyeUNsdWIgeG1sbnM6dG5zPSJodHRwOi8vd3d3LmV4YW1wbGUub3JnL0dvbGZDb3VudHJ5Q2x1YiIgeG1sbnM6eHNpPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYS1pbnN0YW5jZSIgeHNpOnNjaGVtYUxvY2F0aW9uPSJodHRwOi8vd3d3LmV4YW1wbGUub3JnL0dvbGZDb3VudHJ5Q2x1YiBHb2xmQ291bnRyeUNsdWIueHNkICI+CgogIDxHb2xmQ291cnNlIE51bWJlck9mSG9sZXM9IjE4Ij4KICAgIDxOYW1lPkJpcmQncyBOZXN0IENvdXJzZTwvTmFtZT4KICAgIDxZYXJkYWdlPjcxMjU8L1lhcmRhZ2U+CiAgICA8UGFyPjcyPC9QYXI+CiAgICA8SGFuZGljYXA+NzQuNjwvSGFuZGljYXA+CiAgICA8U2xvcGU+MTM4PC9TbG9wZT4KICA8L0dvbGZDb3Vyc2U+CiAgCiAgPEdvbGZDb3Vyc2UgTnVtYmVyT2ZIb2xlcz0iMTgiPgogICAgPE5hbWU+RWFnbGUncyBOZXN0IENvdXJzZTwvTmFtZT4KICAgIDxZYXJkYWdlPjcxOTg8L1lhcmRhZ2U+CiAgICA8UGFyPjcyPC9QYXI+CiAgICA8SGFuZGljYXA+NzMuNTwvSGFuZGljYXA+CiAgICA8U2xvcGU+MTM2PC9TbG9wZT4KICA8L0dvbGZDb3Vyc2U+CiAgCiAgPE1lbWJlciBoYW5kaWNhcD0iMjAiPgogICAgPFJlZ3VsYXJNZW1iZXI+CiAgICAgIDxGaXJzdE5hbWU+S2VpdGg8L0ZpcnN0TmFtZT4KICAgICAgPExhc3ROYW1lPkNob25nPC9MYXN0TmFtZT4KICAgICAgPE1lbWJlcnNoaXBFeHBpcnk+MjAxMC0xMC0zMTwvTWVtYmVyc2hpcEV4cGlyeT4KICAgIDwvUmVndWxhck1lbWJlcj4KICA8L01lbWJlcj4KCiAgPE1lbWJlciBoYW5kaWNhcD0iMCI+CiAgICA8RXhjbHVzaXZlTWVtYmVyPgogICAgICA8Rmlyc3ROYW1lPkphbWVzPC9GaXJzdE5hbWU+CiAgICAgIDxNaWRkbGVOYW1lPkxpb248L01pZGRsZU5hbWU+CiAgICAgIDxMYXN0TmFtZT5DaGFuPC9MYXN0TmFtZT4KICAgICAgPFZhbGV0UGFya2luZ0lEPjEyNDwvVmFsZXRQYXJraW5nSUQ+CiAgICAgIDxMb2NrZXJOdW1iZXI+MTA8L0xvY2tlck51bWJlcj4KICAgIDwvRXhjbHVzaXZlTWVtYmVyPgogIDwvTWVtYmVyPgoKICA8TWVtYmVyIGhhbmRpY2FwPSIyNSI+CiAgICA8UmVzdHJpY3RlZE1lbWJlcj4KICAgICAgPEZpcnN0TmFtZT5BbGxhbjwvRmlyc3ROYW1lPgogICAgICA8TGFzdE5hbWU+Q2hvbmc8L0xhc3ROYW1lPgogICAgICA8TWVtYmVyc2hpcEV4cGlyeT4yMDEwLTEwLTMxPC9NZW1iZXJzaGlwRXhwaXJ5PgogICAgICA8TGltaXRlZFBsYXk+V2Vla2VuZCBPbmx5PC9MaW1pdGVkUGxheT4KICAgIDwvUmVzdHJpY3RlZE1lbWJlcj4KICA8L01lbWJlcj4KICAKICA8TWVtYmVyIGhhbmRpY2FwPSIxMCI+CiAgICA8UmVndWxhck1lbWJlcj4KICAgICAgPEZpcnN0TmFtZT5NdXJyYXk8L0ZpcnN0TmFtZT4KICAgICAgPE1pZGRsZU5hbWU+SXp6dW48L01pZGRsZU5hbWU+CiAgICAgIDxMYXN0TmFtZT5CZWF0b248L0xhc3ROYW1lPgogICAgICA8TWVtYmVyc2hpcEV4cGlyeT4yMDEwLTA5LTMwPC9NZW1iZXJzaGlwRXhwaXJ5PgogICAgPC9SZWd1bGFyTWVtYmVyPgogIDwvTWVtYmVyPgoKICA8RW1wbG95ZWU+CiAgICA8Rmlyc3ROYW1lPkNyYWlnPC9GaXJzdE5hbWU+CiAgICA8TGFzdE5hbWU+U2FsdGVyPC9MYXN0TmFtZT4KICAgIDxFbXBsb3llZU51bWJlcj4xMjQ2MzwvRW1wbG95ZWVOdW1iZXI+CiAgPC9FbXBsb3llZT4KICAKICA8RW1wbG95ZWU+CiAgICA8Rmlyc3ROYW1lPkVybmVzdDwvRmlyc3ROYW1lPgogICAgPExhc3ROYW1lPk1haDwvTGFzdE5hbWU+CiAgICA8RW1wbG95ZWVOdW1iZXI+MTUyMzQ8L0VtcGxveWVlTnVtYmVyPgogIDwvRW1wbG95ZWU+CgogIDxQcm9TaG9wPgogICAgPEdvbGZDbHViPgogICAgICA8TWFudWZhY3R1cmVyTmFtZT5UYWlsb3IgQnVpbHQ8L01hbnVmYWN0dXJlck5hbWU+CiAgICAgIDxRdWFudGl0eT4yMDwvUXVhbnRpdHk+CiAgICAgIDxDbHViS2luZD5Ecml2ZXI8L0NsdWJLaW5kPgogICAgICA8TG9mdD4xMC41IERlZ3JlZXM8L0xvZnQ+CiAgICAgIDxTaGFmdD5TdGlmZjwvU2hhZnQ+CiAgICA8L0dvbGZDbHViPgogICAgPEdvbGZDbHViPgogICAgICA8TWFudWZhY3R1cmVyTmFtZT5DbGV2ZXIgUGxhaW5zPC9NYW51ZmFjdHVyZXJOYW1lPgogICAgICA8UXVhbnRpdHk+NTwvUXVhbnRpdHk+CiAgICAgIDxDbHViS2luZD5XZWRnZTwvQ2x1YktpbmQ+CiAgICAgIDxMb2Z0PjYwIERlZ3JlZXM8L0xvZnQ+CiAgICAgIDxTaGFmdD5SZWd1bGFyPC9TaGFmdD4KICAgIDwvR29sZkNsdWI+CiAgICA8Qm94T2ZCYWxscz4KICAgICAgPE1hbnVmYWN0dXJlck5hbWU+QS1TdWJqZWN0PC9NYW51ZmFjdHVyZXJOYW1lPgogICAgICA8UXVhbnRpdHk+MjA8L1F1YW50aXR5PgogICAgICA8UHJvZHVjdERldGFpbHM+UG9zLiBBIEhpZ2ggU3Bpbi8xMjwvUHJvZHVjdERldGFpbHM+CiAgICA8L0JveE9mQmFsbHM+CiAgPC9Qcm9TaG9wPgoKPC90bnM6R29sZkNvdW50cnlDbHViPgo=";
			
			String encodedXML = in.getBusinessData().trim();
			String decodedXML = MainTest_Encoded.DecodeXML(encodedXML);
			JAXBContext jaxbContext = JAXBContext.newInstance(GolfCountryClub.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			StringReader reader = new StringReader(decodedXML);
			GolfCountryClub element = (GolfCountryClub) jaxbUnmarshaller.unmarshal(reader);
			
			System.out.println("----myOutput----");
			System.out.println(element.getEmployee().get(0).getFirstName());
			System.out.println(element.getEmployee().get(1).getFirstName());
			
			System.out.println(element.getGolfCourse().get(0).getYardage());
			System.out.println(element.getGolfCourse().get(1).getYardage());
			
		
			outputMsg.setCode("200");
			outputMsg.setDescription("Success"+element.getEmployee().get(0).getFirstName());
			
			UUID uuid = UUID.randomUUID();
			
			outputMsg.setReferenceKey(uuid.toString());
			
			
			return outputMsg;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outputMsg;
	}
	
	@Override
	public OutputMessage getSystemStatus()
	{
		OutputMessage outputMsg = new OutputMessage();
		outputMsg.setCode("200");
		outputMsg.setDescription("Success");
		outputMsg.setReferenceKey("reference123456789");
		return outputMsg;
	}

}