package com.sigge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a deck in HoldEmPoker, 52 cards
 * @author sergey
 */
public class HoldEmDeck implements IDeck
{

	private List<Integer> cards = getDefaultCardList();
	/**
	 * Where are we in the deck?
	 */
	private int mark;
	/**
	 * Creates and shuffles a deck to be ready
	 */
	public HoldEmDeck()
	{
		shuffle();
	}
	
	private List<Integer> getDefaultCardList()
	{
		List<Integer> l = new ArrayList<>();
		for (int i = 0;i<=51;i++)
		{
			l.add(i);
		}
		return l;
	}

	/**
	 * @see com.sigge.model.IDeck#shuffle()
	 */
	@Override
	public void shuffle()
	{
		for (int i = 0; i<= 100; i++)
		{
			java.util.Collections.shuffle(cards);
		}

	}

	/**
	 * @see com.sigge.model.IDeck#deal()
	 */
	@Override
	public int deal() throws OutOfCards
	{
		if (mark >= cards.size())
		{
			throw new OutOfCards("Out of cards");
		}
		
		return cards.get(++mark);
	}

}
