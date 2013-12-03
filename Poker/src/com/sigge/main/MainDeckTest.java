package com.sigge.main;

import java.util.Arrays;

import com.sigge.model.HoldEmDeck;
import com.sigge.model.HoldEmPokerTable;
import com.sigge.model.IDeck;
import com.sigge.model.IPlayer;
import com.sigge.model.ITable;
import com.sigge.model.OutOfCards;
import com.sigge.model.Player;

public class MainDeckTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		IDeck deck = new HoldEmDeck();

		IPlayer p1 = new Player("EEE");
		IPlayer p2 = new Player("ZZZ");

		ITable table = new HoldEmPokerTable(Arrays.asList(p1, p2), 0);

		try
		{
			int card = deck.deal();
			System.out.println(card);
			table.nextGame();
			System.out.println(table.getDealer());
		}
		catch (OutOfCards e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Thanks for playing!");
		}

	}

}
