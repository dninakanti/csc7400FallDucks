/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Main program that simulates a pond
 */
public class SimuPond {

  /** 
   *  Runs the duck pond simulator
   */
  public static void main(String[] args) {
	System.out.println("Adding ducks to duck pond");
	addDuck(new Mallard());
	//addDuck(new Mallard());
	addDuck(new Redhead());
	addDuck(new RubberDuck());
	addDuck(new WoodenDecoy());
	
	System.out.println("\nIdyllic pond");
	pond.swimming();
	
	System.out.println("\nDog runs into pond");
	pond.spook();
  }
  
  /**
   * Adds a duck to the pond, just a helper function
   * @param duck the duck to add to the pond
   */
  public static void addDuck(Duck duck) {
	duck.display();
    pond.addDuck(duck);
  }

  /**
   * The pond for the simulation
   */
  private static DuckPond pond = new DuckPond();
}
