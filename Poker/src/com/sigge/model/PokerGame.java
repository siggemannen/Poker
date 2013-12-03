package com.sigge.model;

import java.util.List;

/**
 * @author sergey
 */
public class PokerGame implements IGame
{

	private ITable table;
	private IDeck deck;
	
	public PokerGame(List<IPlayer> players)
	{
		table = new HoldEmPokerTable(players, 0);
		deck = new HoldEmDeck();
	}

}
