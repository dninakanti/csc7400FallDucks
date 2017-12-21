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
 * @author divya ninakanti & nitesh vuppula
 * Default fly implementation for ducks
 */
public class SimpleFly implements FlyBehaviour {
	public GIF gif;
	
	public SimpleFly(String imageName) {
		gif = new GifImpl(imageName);
	}
	
	@Override
	public void fly() {
		gif.animate();
		//System.out.println("Hurray, I'm flying!!!");
	}

}
