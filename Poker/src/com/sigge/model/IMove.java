package com.sigge.model;

/**
 * Standard move interface...
 * @author sergey
 */
public interface IMove
{
	/**
	 * What kind of move we're dealing with
	 * @return
	 */
	MoveType getMoveType();
	
	/**
	 * How much money we put into the bet etc...
	 * @return
	 */
	double getAmount();
	
}
