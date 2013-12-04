package com.sigge.model;

public class PokerPlayer
{

	private IPlayer player;
	private double money;
	private double moneyOnTheTable;
	private double buyIn;

	public PokerPlayer(IPlayer player, double buyIn)
	{
		this.player = player;
		this.buyIn = buyIn;
		this.money = buyIn;
		this.moneyOnTheTable = 0;
	}

	/**
	 * Fill up the stash inbetween the games
	 * @param money
	 */
	public void add(double money)
	{
		assert moneyOnTheTable == 0;
		this.money += money;
	}

	/**
	 * Set money after a win or loss
	 * @param money
	 */
	public void set(double money)
	{
		assert money >= 0;
		this.money = money;
		moneyOnTheTable = 0;

	}

	public void bet(double amount)
	{
		assert money <= getAvailableAmount();
		moneyOnTheTable += amount;
	}

	public double getAvailableAmount()
	{
		return money - moneyOnTheTable;
	}

	public double getMoneyOnTheTable()
	{
		return moneyOnTheTable;
	}

	public double getMoney()
	{
		return money;
	}

	public IPlayer getPlayer()
	{
		return player;
	}

	public double getOriginalBuyIn()
	{
		return buyIn;
	}

	public Object getName()
	{
		return player.getName();
	}

}
