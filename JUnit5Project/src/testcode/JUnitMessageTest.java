package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import businesscode.JUnitMessage;

class JUnitMessageTest {

	
	String message="java";
	
	JUnitMessage jm=new JUnitMessage(message);
	@Test
	void testPrintMessage() {
System.out.println("JUnit message is printing");
	jm.printHiMessage();
	}

	@Test
	void testPrintHiMessage() {
		message = "Hi " + message;
		System.out.println("Junit Hi Message is printing ");
		assertEquals(message, jm.printHiMessage());
		System.out.println("Suite Test 1 is successful " + message);
	
	}

}