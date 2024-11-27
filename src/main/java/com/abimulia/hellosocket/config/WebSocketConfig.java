/**
 * WebSocketConfig.java
 * 27-Nov-2024
 */
package com.abimulia.hellosocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author abimu
 *
 * @version 1.0 (27-Nov-2024)
 * @since 27-Nov-2024 11:43:22 PM
 * 
 * 
 *        Copyright(c) 2024 Abi Mulia
 */

@Configuration
@EnableWebSocketMessageBroker
@Slf4j
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		log.debug("registerStompEndpoints() registry: " + registry);
		registry.addEndpoint("/gs-guide-websocket");
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		log.debug("configureMessageBroker() registry: " + registry);
		registry.enableSimpleBroker("/topic");
		registry.setApplicationDestinationPrefixes("/app");
	}

}
