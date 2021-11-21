/*
 * Adrianne Perrodin
 * Module 3 Project 1
 * CS-230-R1975
 * 09/19/2021
 */

package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */

//class inherits Entity class
public class Team extends Entity {
	
	private static List<Player> players = new ArrayList<Player>();

	/**
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
		
	}
	// method to add player if name not in list
	public Player addPlayer(String name) {

		// a local player instance
		Player player = null;
		
		/* 
		 * iterator to search for existing player by name
		 * for loop searches in Player array list for player saved name
		 * if the player name is found, it returns that existing player 
		 */
		for (Player existingPlayer : players)
			if (existingPlayer.getName().equals(name)) {
				return existingPlayer;
			}

		// if not found, make a new player instance and add to list of player
		if (player == null) {
			players.add(player);
		}

		// return the new/existing player instance to the caller
		return player;

	}

	@Override
	public String toString() {
		
		return "Team [id=" + super.getId() + ", name=" + super.getName()+ "]";
	}

}

