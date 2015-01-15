
public class Hero {
	//private properties ---------------------------------------------------------------------------
	private int strength;
	private int speed;
	private int health;
	//public properties ------------------------------------------------------------------------------
	public String name;
	
	//Getters ------------------------------------------------------------------------------------
	public int getStrength() {
		return strength;
	}
	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}
	

	//Constructor ----------------------------------------------------------------------------------
	public Hero(String name){
		this.name = name;
		generateAbilities();
	}
	//Private Methods ----------------------------------------------------------------------------
	private void generateAbilities() {
		
	}

	public void fight() {
				
	}
	
	public void run () {
		
	}





}

