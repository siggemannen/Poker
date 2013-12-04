package com.sigge.model;

public class NoSeatsAvailable extends Exception
{

	private static final long serialVersionUID = 3512813487727045135L;

	public NoSeatsAvailable(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoSeatsAvailable(String message, Throwable cause)
	{
		super(message, cause);
		// TODO Auto-generated constructor stub
	}



}
