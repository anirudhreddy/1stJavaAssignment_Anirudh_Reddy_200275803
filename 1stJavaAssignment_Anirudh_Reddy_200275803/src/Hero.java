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