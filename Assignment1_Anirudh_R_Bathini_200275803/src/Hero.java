import java.util.Random;

/**
 *
 * @author Anirudh.Reddy
 */
public class Hero {
	//PRIVATE Instance Variables-------------------------------------------------------------------
    private int strength;               /// 'Strength' attribute
    private int speed;                  /// 'Speed' attribute
    private int health;                 /// 'Health' attribute
  //PUBLIC Instance Variables----------------------------------------------------------------------
    public String name;                 /// 'Name' attribute
    
    /// The constructor ---------------------------------------------------------------------------
    Hero (String n) {
        this.name = n;                  /// Setting the name
        this.generateAbilities();       /// Calling the instance's method
    }
    
    private void generateAbilities () {
        /// Instantiating a new Random() instance to generate random integers
        Random randomGenerator = new Random();
        
        /// Generating random integers from 1 to 100 for each attribute
        this.strength = randomGenerator.nextInt(100) + 1;
        this.speed = randomGenerator.nextInt(100) + 1;
        this.health = randomGenerator.nextInt(100) + 1;
    }
    
    public void fight () {
    	// If hitAttempt() returns 'true', Getting the hit damage
        if ( this.hitAttempt() == true ) { 
            int damage = this.hitDamage(); 
            //Display Result
            System.out.println("The damage caused is : " + damage); 
        }
    }
    
    private boolean hitAttempt () {
        /* to generate a 20% probability of hitAttempt(), we generate a random
        number between 0 and 1, it will be less than 0.2 (which is 20% of the time) */
        if ( Math.random() < 0.2) {
            return true;
        }
        else {
            return false;
        }
    }
    
    private int hitDamage () {
        /// Instantiating a new Random() instance to generate random integers
        Random randomGenerator = new Random();
        int factor = randomGenerator.nextInt(6) + 1; // Getting the damage factor
        int damage = this.strength * factor;         // Calculating the result
        return damage;                               // Returning the result
    }
    
    public void show () {
        // Printing each attribute
        System.out.println("Hero's name\t" + this.name);
        System.out.println("Strength\t" + this.strength);
        System.out.println("Speed\t\t" + this.speed);
        System.out.println("Health\t\t" + this.health);
    }
    
    public static void main(String[] args) {
        
        // Instantiating a new instance of the Hero class
        Hero superman = new Hero("Superman");
        
        // Calling the new instance's show() method
        superman.show();
        
        System.out.println("\n");
        
        for (int i = 0 ; i < 100 ; i++) {
            // Calling the new instance's fight() method
            superman.fight();
        }
    }
}
