package com.sigge.model;

/**
 * Special handler that allows to make a move and view game state, but without actually being able to access the main game class...
 * @author sergey
 */
public interface IGameHandle
{
	/**
	 * Make a move by a player
	 * @param move
	 * @throws IllegalMove
	 * @throws NotYourTurn
	 */
	void makeAMove(IPlayer player, IMove move) throws IllegalMove, NotYourTurn;
}
