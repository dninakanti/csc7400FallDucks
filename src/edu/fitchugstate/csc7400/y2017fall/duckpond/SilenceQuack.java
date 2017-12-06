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
 * Implements SilenceQuack from  QuackBehaviour
 */
public class SilenceQuack implements QuackBehaviour
{
    public void quack()
    {
	System.out.println("<< silence >>");
    }
}