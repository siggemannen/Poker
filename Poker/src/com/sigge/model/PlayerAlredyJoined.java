package com.sigge.model;

public class PlayerAlredyJoined extends Exception
{
	private static final long serialVersionUID = 2076015894043349598L;

	public PlayerAlredyJoined(String message)
	{
		super(message);
	}

	public PlayerAlredyJoined(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
	}

}
