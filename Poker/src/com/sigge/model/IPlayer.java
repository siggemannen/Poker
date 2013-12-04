package com.sigge.model;

/**
 * @author sergey
 */
public interface IPlayer
{
	/**
	 * @return name of the player
	 */
	String getName();
	
	void createNewGame(IGameHandle handle);
	/**
	 * Broadcasts a game even to a player
	 * @param e
	 */
	void publishGameEvent(IEvent e);
	
	void publishGameState(IGameState s);
}
