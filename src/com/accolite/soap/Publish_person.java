package com.accolite.soap;

import javax.xml.ws.Endpoint;

public class Publish_person {

	
	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:8897/ws/person", new PersonImpl());  
	}
	
}
