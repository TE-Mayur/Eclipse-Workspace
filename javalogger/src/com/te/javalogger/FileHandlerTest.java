package com.te.javalogger;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileHandlerTest {
	

	final static Logger LOGGER = Logger.getLogger(FileHandlerTest.class.getName());
	
	public static void main(String[] args) {
		
		FileHandler fileHandler;
		try {
			fileHandler = new FileHandler("myLogs.logs",true);
			fileHandler.setLevel(Level.ALL);
	//		fileHandler.setFilter(new MyFilter());
			fileHandler.setFormatter(new CustomFormatter());
			
			LOGGER.addHandler(fileHandler);
			LOGGER.setLevel(Level.ALL);
			
			LOGGER.severe("Severe msg");
			LOGGER.warning("warning msg");
			LOGGER.info("info msg");
			LOGGER.config("config msg");
			LOGGER.fine("fine msg");
			LOGGER.finer("finer msg");
			LOGGER.finest("Finest msg");
		
			LOGGER.setUseParentHandlers(false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
