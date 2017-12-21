/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import external.GIF;
import external.GifImpl;

/**
 * 
 *@author divya ninakanti & nitesh vuppula
 * Default swim implementation for ducks
 */
public class SimpleSwim implements SwimBehaviour{
	
	public GIF gif;
	
	public SimpleSwim(String swimGif) {
		gif = new GifImpl(swimGif);
	}

	@Override
	public void swim() {
		gif.animate();
		//System.out.println("Nice pond,enjoying swim!!!");
		}

}
