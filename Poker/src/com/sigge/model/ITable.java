package com.sigge.model;

import java.util.List;

/**
 * Represents a poker table with all of it's glory...
 * @author sergey
 */
public interface ITable
{
	/**
	 * Sets up a table with a list of players
	 * 
	 * @param players list of players to setup
	 * @param dealer the index of dealing player
	 */
	public void setupTable(List<IPlayer> players, int dealer);
	
	/**
	 * Creates a new game from existing players
	 * It rotates the necessary information like dealer etc...
	 */
	public void nextGame();
	
	/**
	 * Returns which player is the dealer
	 * @return
	 */
	public int getDealer();
}
