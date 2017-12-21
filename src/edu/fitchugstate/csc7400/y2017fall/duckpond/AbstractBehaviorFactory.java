package edu.fitchugstate.csc7400.y2017fall.duckpond;
/**
 * 
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-12-20
 * @author divya ninakanti and nitesh vuppula
 *
 */
public abstract class AbstractBehaviorFactory {

	public abstract FlyBehaviour createFlyBehavior();
	
	public abstract SwimBehaviour createSwimBehavior();
	
	public abstract QuackBehaviour createQuackBehavior();
}
