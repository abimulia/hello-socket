/**
 * GreetingResource.java
 * 27-Nov-2024
 */
package com.abimulia.hellosocket.resource;

import java.util.Random;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.abimulia.hellosocket.message.Greeting;
import com.abimulia.hellosocket.message.HelloMessage;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author abimu
 *
 * @version 1.0 (27-Nov-2024)
 * @since 27-Nov-2024 11:39:59 PM
 * 
 * 
 *        Copyright(c) 2024 Abi Mulia
 */

@Controller
@Slf4j
public class GreetingResource {
	private String[] greetingTemplates = { "Hello %s ! How are you today?",
			"Good morning %s! Have a fantastic day ahead.", "Good afternoon %s! Hope everything’s going well.",
			"Good evening %s! Relax and unwind, you deserve it.", "Hi %s! Long time no see.",
			"Welcome %s! It’s great to see you here.", "Hey %s! What’s up?", "Hi %s! How’s your day going?",
			"Yo %s! Hope you’re doing great.", "Hi there! Missed you %s." };

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception {
		log.debug("greeting() message: " + message);
		Thread.sleep(1000); // simulated delay
		int greetingIndex = new Random().nextInt(greetingTemplates.length);// this is just addition so the greeting is
																			// random
		String greet = String.format(greetingTemplates[greetingIndex], HtmlUtils.htmlEscape(message.getName()));
		return new Greeting(greet);
	}

}
