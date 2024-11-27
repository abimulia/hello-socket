/**
 * HelloMessage.java
 * 27-Nov-2024
 */
package com.abimulia.hellosocket.message;

/**
 * 
 * @author abimu
 *
 * @version 1.0 (27-Nov-2024)
 * @since 27-Nov-2024 11:37:42 PM
 * 
 * 
 *        Copyright(c) 2024 Abi Mulia
 */
public class HelloMessage {
	private String name;

	public HelloMessage() {
	}

	public HelloMessage(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
