package com.family.ames.sayhello;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    
	private App(){
		
	}
	
	public static void main( String[] args ){
    	LOGGER.info("NOW LOGGING");   
    	LOGGER.warning("Testing");
    }
    
}
