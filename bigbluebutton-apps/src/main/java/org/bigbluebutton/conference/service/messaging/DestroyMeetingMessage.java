package org.bigbluebutton.conference.service.messaging;

public class DestroyMeetingMessage implements IMessage {
	public static final String DESTROY_MEETING_REQUEST_EVENT  = "destroy_meeting_request_event";
	public static final String VERSION = "0.0.1";
	
	public final String meetingId;
	
	public DestroyMeetingMessage(String meetingId) {
		this.meetingId = meetingId;
	}	
}
