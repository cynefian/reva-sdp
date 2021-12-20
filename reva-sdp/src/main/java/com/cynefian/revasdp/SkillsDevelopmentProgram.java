package com.cynefian.revasdp;

import org.apache.log4j.Logger;

public class SkillsDevelopmentProgram {

	static Logger log = Logger.getLogger(SkillsDevelopmentProgram.class.getName());
	
	public static void main(String[] args) {
		System.out.println("DevOps SDP");
		//logMessage();
	}
	
	public static void logMessage() {
		log.debug("This is a logged message");
	}
	
}
