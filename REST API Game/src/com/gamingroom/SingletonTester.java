/*
 * Adrianne Perrodin
 * Module 3 Project 1
 * CS-230-R1975
 * 09/19/2021
 */

package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
			
		/*
		 * The only available GameService Object instance is referenced
		 */
		GameService service = GameService.getInstance(); 
		
		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
