package com.sigge.model;


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
	public void setupTable(int maxPlayers);
	
	/**
	 * Return number of players
	 * @return
	 */
	public int getMaxPlayers();
	
	/**
	 * Return registered players
	 * @return
	 */
	public IPlayer[] getPlayers();
	
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
	
	public void join (IPlayer player) throws NoSeatsAvailable, SeatTaken;
	
	public void join (IPlayer player, int seat) throws SeatTaken, NoSeatsAvailable;
	
	public int getHowManyPlayersAreIn();
}
