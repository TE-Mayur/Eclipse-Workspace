package com.te.javalogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggerTest {

	final static Logger LOGGER = Logger.getLogger(LoggerTest.class.getName());
	
	public static void main(String[] args) {
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.CONFIG);
		
//		consoleHandler.setFormatter(new XMLFormatter());
		
		LOGGER.addHandler(consoleHandler);
		LOGGER.setLevel(Level.CONFIG);
		
		LOGGER.severe("Severe msg");
		LOGGER.warning("warning msg");
		LOGGER.info("info msg");
		LOGGER.config("config msg");
		LOGGER.fine("fine msg");
		LOGGER.finer("finer msg");
		LOGGER.finest("Finest msg");
	
	}
}
