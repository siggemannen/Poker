package com.sigge.model;

import java.util.Arrays;

/**
 * Event notifying start of the game
 * @author sergey
 */
public class GameStartedEvent implements IEvent
{

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("GameStartedEvent [players=");
		builder.append(Arrays.toString(players));
		builder.append("]");
		return builder.toString();
	}

	public IPlayer[] players;

	public GameStartedEvent(IPlayer[] players)
	{
		this.players = players;
	}

}
