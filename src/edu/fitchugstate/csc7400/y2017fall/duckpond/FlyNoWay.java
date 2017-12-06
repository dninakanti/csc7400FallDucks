/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;
/**
 * @author divya ninakanti & nitesh vuppula
 * fly implementation for dummy ducks
 */
public class FlyNoWay implements FlyBehaviour  {

	@Override
	public void fly() {
		System.out.println("oh no, I can't fly");
	}

}
