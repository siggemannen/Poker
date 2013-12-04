package com.sigge.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sergey
 */
public class PokerGame implements IGame, IGameHandle
{

	private ITable table;
	private IDeck deck;
	private List<PokerPlayer> players = new ArrayList<>();
	private double bigBlind = 1;
	private double smallBlind = bigBlind / 2;
	private boolean gameStarted;
	
	private IGameState gameState;

	private Thread gameThread;

	private List<PokerPlayer> waitingPlayers = new ArrayList<>();

	public PokerGame(int maxPlayers, double bigBlind)
	{
		table = new HoldEmPokerTable(maxPlayers);
		this.bigBlind = bigBlind;
		this.smallBlind = bigBlind / 2;
		deck = new HoldEmDeck();
	}

	/**
	 * Workaround method for anonymous-classes... Returning myself
	 * @return
	 */
	protected PokerGame getThis()
	{
		return this;
	}

	/**
	 * Joins a player one at a time... If player already exist an exception is thrown
	 * @throws NoSeatsAvailable 
	 * @throws SeatTaken 
	 * @see com.sigge.model.IGame#join(com.sigge.model.IPlayer)
	 */
	@Override
	public synchronized void join(IPlayer player, double buyIn, int seat) throws PlayerAlredyJoined, SeatTaken, NoSeatsAvailable
	{
		for (IPlayer p : table.getPlayers())
		{
			if (p != null && p.getName().equals(player.getName())) throw new PlayerAlredyJoined(player.getName());
		}

		if (gameStarted)
		{
			//we don't want to disrupt the current game, so let's put the player into queue that we'll process when we finish...
			if (findPlayerInArray(player, waitingPlayers))
			{
				throw new PlayerAlredyJoined("Player already on waiting list");
			}

			waitingPlayers.add(new PokerPlayer(player, buyIn));
			return;
		}

		if (seat > -1)
		{
			table.join(player, seat);
		}
		else
		{
			table.join(player);
		}
		
		this.players.add(new PokerPlayer(player, buyIn));

		if (table.getHowManyPlayersAreIn() > 1)
		{
			start();
		}

	}

	private void start()
	{
		gameThread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				gameStarted = true;
				//broadcast all the players about a start...
				final IPlayer[] currentPlayers = table.getPlayers();
				
				//Create new GameState...
				gameState = new PokerGameState();
				
				for (IPlayer p : currentPlayers)
				{

					if (p != null)
					{
						p.createNewGame(getThis());
						IEvent e = new GameStartedEvent(currentPlayers);
						System.out.println("publishing event " + e + " : " + p);

						p.publishGameEvent(e);
						p.publishGameState(gameState);
					}
				}

			}
		});

		//Create a new thread to async broadcast the logic etc etcetc
		gameThread.start();
	}

	@Override
	public void join(IPlayer player, double buyIn) throws PlayerAlredyJoined, SeatTaken, NoSeatsAvailable
	{
		join(player, buyIn, -1);

	}

	private boolean findPlayerInArray(IPlayer player, Collection<PokerPlayer> players)
	{
		for (PokerPlayer p : players)
		{
			if (p.getName().equals(player.getName()))
			{
				return true;
			}
		}
		return false;
	}
	

	@Override
	public void makeAMove(IPlayer player, IMove move) throws IllegalMove, NotYourTurn
	{
		// TODO add legality etc...
		// Broadcast and change gamestate...
		System.out.println("Player " + player.getName() + " is moving: " + move);
		
	}
}