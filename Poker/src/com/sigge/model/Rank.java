package com.sigge.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sergey
 */
public enum Rank
{
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), J(11), Q(12), K(13), A(1);

	private int rank;
	private static Map<Integer, Rank> memoiser = getMap();

	Rank(int rank)
	{
		this.rank = rank;
	}

	private static Map<Integer, Rank> getMap()
	{
		Map<Integer, Rank> m = new HashMap<>();
		for (Rank r : Rank.values())
		{
			m.put(r.rank, r);
		}
		return m;
	}

	public static Rank getValueOf(int rank)
	{
		return memoiser.get(rank);
	}

}
