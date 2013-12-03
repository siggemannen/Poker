package com.sigge.model;

import java.util.List;
import java.util.Random;

/**
 * Represents a poker table
 * @author sergey
 */
public class HoldEmPokerTable implements ITable
{

	private List<IPlayer> players;
	private int dealer;

	Random r = new Random();

	public HoldEmPokerTable(List<IPlayer> players, int dealer)
	{
		setupTable(players, dealer);
	}

	/**
	 * @see com.sigge.model.ITable#setupTable(java.util.List, boolean)
	 */
	@Override
	public void setupTable(List<IPlayer> players, int dealer)
	{
		assert players != null;
		assert players.size() > 1;

		this.players = players;
		this.dealer = dealer;

	}

	public int howManyPlayers()
	{
		return players.size();
	}

	public void nextGame()
	{
		if (this.dealer >= players.size() - 1)
		{
			dealer = 0;
		}
		else
		{
			dealer++;
		}
	}

	@Override
	public int getDealer()
	{
		return this.dealer;
	}

}
