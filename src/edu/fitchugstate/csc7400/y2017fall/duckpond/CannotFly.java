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
public class CannotFly implements FlyBehaviour  {
public String duckType;
	
	public CannotFly(String duckType) {
		this.duckType = duckType;
	}

	@Override
	public void fly() {
		if(duckType.equals("RubberDuck")){
			System.out.println("Rubber duck continues to swim");
		}else if(duckType.equals("Decoy")) {
			System.out.println("Decoy still swims");
		}
		
	}

	/**
	 * @return the duckType
	 */
	public String getDuckType() {
		return duckType;
	}

	/**
	 * @param duckType the duckType to set
	 */
	public void setDuckType(String duckType) {
		this.duckType = duckType;
	}

}
