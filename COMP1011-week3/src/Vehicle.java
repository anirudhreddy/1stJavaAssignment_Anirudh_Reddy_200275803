/**
 * 
 */

/**
 * @author Anirudh.reddy
 *Class Description : Creating vehicle class to use as a super class for all other vehicle subclasses
 *
 */
public class Vehicle {
	
	// Private Methods ------------------------------------------------------------------------
	private int numWheels = 4;
	private int numDoors = 2;
	private String colour = "";
	private String make = "";
	private String model = "";
	private String year = "";
	private float speed = 0;
	private final int MAX_SPEED = 40;
	
	// Get Accessor Methods -------------------------------------------------------------------
	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @return the numDoors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return this.colour;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}
	/**
	 * @return the speed
	 */
	public float getspeed() {
		return this.speed;
		
	}
	
	//Constructor -------------------------------------------------------------------------------
	public Vehicle() {
		
	}
	//Public Methods ---------------------------------------------------------------------------
	public void accelarate() { 
		this.speed +=4;
		if(this.speed >= this.MAX_SPEED){
			this.speed = this.MAX_SPEED;			
		}
	}
	public void decelerate() {
		this.speed -=6;
		if(this.speed < 0) {
			this.speed = 0;
		}
	}
	public void turnLeft() { 
		System.out.println("Turning Left");
		
	}
	public void turnRight() {
		System.out.println("Turning Right");
		
	}



		
}
