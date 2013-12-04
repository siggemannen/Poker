package com.sigge.main;

import com.sigge.model.IGame;
import com.sigge.model.IPlayer;
import com.sigge.model.NoSeatsAvailable;
import com.sigge.model.Player;
import com.sigge.model.PlayerAlredyJoined;
import com.sigge.model.PokerGame;
import com.sigge.model.SeatTaken;

public class MainDeckTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		IPlayer p1 = new Player("EEE");
		IPlayer p2 = new Player("ZZZ");

		IGame g = new PokerGame(2, 200);
		try
		{
			g.join(p1, 10000);
			g.join(p2, 10000);
		}
		catch (PlayerAlredyJoined | SeatTaken | NoSeatsAvailable e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
