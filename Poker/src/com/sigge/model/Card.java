package com.sigge.model;

/**
 * @author sergey
 *
 */
public class Card
{
	final private Suit suit;
	final private Rank rank;
	
	public Card(Suit suit, Rank rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public Card(int suit, int rank)
	{
		this.suit = Suit.getValueOf(suit);
		this.rank = Rank.getValueOf(rank);
	}

	public Suit getSuit()
	{
		return suit;
	}

	public Rank getRank()
	{
		return rank;
	}
}
