package com.sigge.model;

/**
 * @author sergey
 */
public class Player implements IPlayer
{
	private String name;
	private IGameHandle handle;

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

	@Override
	public void publishGameEvent(IEvent e)
	{
		System.out.println("got event: " + e);

	}

	@Override
	public void publishGameState(IGameState s)
	{
		System.out.println("got game state: " + s);
		
		//if we get a game state event of "it's my move", then make a damn move...

	}

	@Override
	public void createNewGame(IGameHandle handle)
	{
		this.handle = handle;
		System.out.println("got handle: " + handle);

	}

}
