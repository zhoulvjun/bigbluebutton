package org.bigbluebutton.conference.service.messaging;

public class EndMeetingMessage implements IMessage {
	public static final String END_MEETING_REQUEST_EVENT  = "end_meeting_request_event";
	public static final String VERSION = "0.0.1";

	public final String meetingId;
	
	public EndMeetingMessage(String meetingId) {
		this.meetingId = meetingId;
	}
}
