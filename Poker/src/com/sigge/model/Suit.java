package com.sigge.model;

/**
 * @author sergey
 */
public enum Suit
{
	CLUBS, SPADES, HEARTS, DIAMONDS;


	public static Suit getValueOf(int suit)
	{
		return suit == 0 ? CLUBS : suit == 1 ? SPADES : suit == 2 ? HEARTS : suit == 3 ? DIAMONDS : null;
	}
}
