/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import java.util.ArrayList;
import java.util.List;

/** 
 *  Class that controls the display of the duck pond
 */
public class DuckPond {

  /** 
   * Adds a duck to the pond
   * 
   * @param newDuck duck to add 
   */
  public void addDuck(Duck newDuck) {
    this.ducks.add(newDuck);
  }

  /** 
   *  Shows all the ducks swimming in the pond
   */
  public void swimming() {
	this.drawPond();
    for (Duck duck: this.ducks) {
      duck.quack();
      duck.swim();
    }
  }

  /**
   * Draws what happens after ducks have been spooked.
   */
  public void spook() {
    this.drawSky();
    for (Duck duck: this.ducks) {
        duck.quack();
        duck.quack();
        duck.fly();
      }
  }

  /** 
   *  Draws the base pond
   */
  protected void drawPond() {
    System.out.println("Drawing nice pond with cattails");
  }

  protected void drawSky() {
    System.out.println("Drawing blue sky");
  }

  /** 
   *  All the ducks that will be displayed
   */
  protected List<Duck> ducks = new ArrayList<Duck>();
}
