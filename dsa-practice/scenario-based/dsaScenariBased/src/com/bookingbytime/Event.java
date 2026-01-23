package com.bookingbytime;

//class representing event

public class Event {
	int eventId;
	String eventName;
	String eventTime;
	
	public Event(int eventId, String eventName, String eventTime) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventTime = eventTime;
	}
}
