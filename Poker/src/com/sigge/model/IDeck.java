package com.sigge.model;

/**
 * @author sergey
 */
public interface IDeck
{
	/**
	 * Shuffles the deck to initial state...
	 */
	void shuffle();
	
	/**
	 * Deals one card at a time.
	 * @return
	 * @throws OutOfCards if all cards are out
	 */
	int deal() throws OutOfCards;
	
}
