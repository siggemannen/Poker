package com.sigge.model;

/**
 * @author sergey
 */
public class Player implements IPlayer
{
	private String name;
	
	public Player(String name)
	{
		this.name = name;
	}
	/**
	 * @see com.sigge.model.IPlayer#getName()
	 */
	@Override
	public String getName()
	{
		return name;
	}

}
