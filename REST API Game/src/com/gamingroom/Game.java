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
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */

//class inherits Entity class
public class Game extends Entity {
	
	private static List<Team> teams = new ArrayList<Team>();

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
		
	}

	/*
	 * method that adds team to list if team not in list
	 */
	public Team addTeam(String name) {

		// a local team instance
		Team team = null;
		
		/* 
		 * iterator to search for existing team by name
		 * for loop searches in Team array list for team saved name
		 * if the team name is found, it returns that existing team 
		 */
		for (Team existingTeam : teams)
			if (existingTeam.getName().equals(name)) {
				return existingTeam;
			}

		// if not found, make a new team instance and add to list of teams
		if (team == null) {
			teams.add(team);
		}

		// return the new/existing team instance to the caller
		return team;

	}

	@Override
	public String toString() {
		
		return "Game [id=" + super.getId() + ", name=" + super.getName()+ "]";
	}

}
