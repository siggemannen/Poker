package com.sigge.model;

public class OutOfCards extends Exception
{

	private static final long serialVersionUID = -3025241783064192809L;

	public OutOfCards(String message)
	{
		super(message);
	}
	public OutOfCards(String message, Throwable e)
	{
		super(message, e);
	}
}
