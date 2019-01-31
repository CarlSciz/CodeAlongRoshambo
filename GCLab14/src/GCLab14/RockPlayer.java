package GCLab14;

public class RockPlayer extends Player {

	//Create constructors from superclass
	public RockPlayer() {
		super();
		
	}

	public RockPlayer(String name) {
		super(name);

	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

	

}
