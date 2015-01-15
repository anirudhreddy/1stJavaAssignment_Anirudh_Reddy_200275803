
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
	//Public Methods -------------------------------------------------------------------------------
	
	public void showAbilities(){
		System.out.println("=====================================");
		System.out.println("Strength: "+ this.strength);
		System.out.println("Strength: "+ this.speed);
		System.out.println("Strength: "+ this.health);
	}
	
	//Private Methods ----------------------------------------------------------------------------
	
	private void generateAbilities() {
		this.strength = (int)(Math.random()*100 + 1);
		this.speed = (int)(Math.random()*100 + 1);
		this.health = (int)(Math.random()*100 + 1);
	}

	public void fight() {
		System.out.println(this.name + " is fighting");
				
	}
	
	public void run () {
		System.out.println(this.name + " is running");
		
	}





}

