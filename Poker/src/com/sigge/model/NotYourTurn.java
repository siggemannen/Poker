package com.sigge.model;

/**
 * @author sergey
 */
public class NotYourTurn extends Exception
{

	private static final long serialVersionUID = -6026918521726847909L;

	/**
	 * @param message
	 */
	public NotYourTurn(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public NotYourTurn(String message, Throwable cause)
	{
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
