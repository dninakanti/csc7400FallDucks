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
public class DuckBehaviorFactory extends AbstractBehaviorFactory {
	
	private String flyGif;
	private String swimGif;
	
	public DuckBehaviorFactory(String flyGif, String swimGif) {
		this.flyGif = flyGif;
		this.swimGif = swimGif;
	}

	@Override
	public FlyBehaviour createFlyBehavior() {
		return new SimpleFly(flyGif);
	}

	@Override
	public SwimBehaviour createSwimBehavior() {
		return new SimpleSwim(swimGif);
	}

	@Override
	public QuackBehaviour createQuackBehavior() {
		return new SimpleQuack();
	}

}
