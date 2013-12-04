package com.sigge.model;

import java.util.Random;

/**
 * Represents a poker table
 * @author sergey
 */
public class HoldEmPokerTable implements ITable
{

	private IPlayer[] players;
	private int dealer;
	private int maxPlayers;
	private int numPlayers = 0;

	Random r = new Random();

	/**
	 * Creates an empty table to be used later...
	 */
	public HoldEmPokerTable(int maxPlayers)
	{
		setupTable(maxPlayers);
	}
	
	@Override
	public void join (IPlayer player) throws NoSeatsAvailable, SeatTaken
	{
		synchronized(players)
		{
			for (int i=0;i<maxPlayers;i++)
			{
				if (players[i] == null)
				{
					join(player, i);
					return;
				}
			}
			
			throw new NoSeatsAvailable("No seats available, sorry!");
		}
	}
	
	@Override
	public void join (IPlayer player, int seat) throws SeatTaken, NoSeatsAvailable
	{
		synchronized(players)
		{
			if (players[seat] != null)
			{
				throw new SeatTaken("Seat already taken!");
			}
	
			players[seat] = player;
			numPlayers ++;
		}

	}
	
	public void nextGame()
	{
		if (this.dealer >= players.length - 1)
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

	@Override
	public void setupTable(int maxPlayers)
	{
		this.maxPlayers = maxPlayers;
		players = new IPlayer[this.maxPlayers];
		
	}

	@Override
	public int getMaxPlayers()
	{
		return maxPlayers;
	}

	/**
	 * Returns a copy of player array...
	 * @see com.sigge.model.ITable#getPlayers()
	 */
	@Override
	public IPlayer[] getPlayers()
	{
		return players.clone();
	}

	@Override
	public int getHowManyPlayersAreIn()
	{
		// TODO Auto-generated method stub
		return numPlayers;
	}
	

}
