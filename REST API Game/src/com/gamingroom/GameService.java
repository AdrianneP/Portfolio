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
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	/*
	 * Holds the next player identifier
	 */
	private static long nextPlayerId = 1;
	
	/*
	 * Holds the next team identifier
	 */
	private static long nextTeamId = 1;

	
	/*
	 * creates one private object of GameService
	 */
	private static GameService instance = new GameService();
	
	/*
	 * private constructor so only one object(game) can be created at a time
	 */
	private GameService(){};
	
	/*
	 * gets instance of GameService for public access
	 */
	public static GameService getInstance() {
		return instance;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;
		
		/* 
		 * iterator to search for existing game by name
		 * for loop searches in Game array list for game saved name
		 * if the game name is found, it returns that existing instance game 
		 */
		for (Game existingGame : games)
			if (existingGame.getName().equals(name)) {
				return existingGame;
			}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		
		/* 
		 * iterator to search for existing game with same id number
		 * for loop searches in Game array list for game name id
		 * if the game saved id is equal to a existing game id then 
		 * the existing game will become the current game
		 */
		
		for (Game existingGame : games)
			if (existingGame.getId() == id) {
				game = existingGame;
			}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;
		
		/*
		 * iterator to search for existing game by name
		 * for loop searches in Game array list for game name
		 * if the game name is found then it becomes current game
		 */
		for (Game existingGame : games)
			if (existingGame.getName().equals(name)) {
				game = existingGame;
			}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	/**
	 * @return the next player ID
	 */
	public long getNextPlayerId() {
		return nextPlayerId;
	}

	/**
	 * @return the next Team Id
	 */
	public long getNextTeamId() {
		return nextTeamId;
	}
}
