package GCLab14;

public abstract class Player {
	
	private String name; //fields (aka instance variable)
	// concrete subclasses must override/implement this method
	public abstract Roshambo generateRoshambo();
	public Player() { // no-arg construct
		
	}

	public Player(String name) { //overloaded constructor
		this.name = name;
	}

	public String getName() { // overloaded constructor
		return name;
	}

	public void setName(String name) {// getter
		this.name = name;
	}

	@Override
	public String toString() { //setter
		return "Player [name= " + name + "]";
	}
	


}
