public class Hero extends Entity {
	//PRIVATE Instance Variables
	protected int strength;
	protected int speed;
	public int health;
	//PUBLIC Instance Variables
	public String name;
	
	//Constructor ##################################################
	public Hero(String name){
		this.name = name;
		generateAbilities();
	}
	//Getters+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getStrength() {
		return strength;
	}
	public int getSpeed() {
		return speed;
	}
	public int health() {
		return health;
	}

    //Methods 
	private void generateAbilities(){
		this.strength = (int) (Math.random()*100+1);
		this.speed = (int) (Math.random()*100+1);
		this.health = (int) (Math.random()*100+1);
	}
	public void showAbilities(){
		System.out.println("##############################");
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Speed: " + speed);
		System.out.println("##############################");
	}
	public void fight(){
		System.out.println(name + " is Fighting");
	}
	
	public void run(){
		System.out.println(name + " is Running");
	}

	

	
}
