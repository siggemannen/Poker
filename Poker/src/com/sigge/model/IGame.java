package com.sigge.model;

/**
 * Represents one game of cards
 * @author sergey
 */
public interface IGame
{
	/**
	 * Join the game as a new player on a random seat
	 * @param player
	 */
	void join (IPlayer player, double buyIn) throws PlayerAlredyJoined, SeatTaken, NoSeatsAvailable;

	/**
	 * Join a table with a specific seat in mind...
	 * @param player
	 * @param seat
	 * @throws PlayerAlredyJoined
	 */
	void join(IPlayer player, double buyIn, int seat) throws PlayerAlredyJoined, SeatTaken, NoSeatsAvailable;
	

}
