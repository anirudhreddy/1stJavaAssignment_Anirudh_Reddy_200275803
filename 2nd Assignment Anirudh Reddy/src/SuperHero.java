import java.util.ArrayList;
import java.util.Arrays;


public class SuperHero extends Hero {

	//Variables
	private String [] superPowers;
	
	//Constructor
	public SuperHero (String name) {
		super (name);
		
		//Initialize Array superPowers	
		
				superPowers = new String [3];
				
		this.generateRandomPowers();
		
	
		
	}
	
	//private methods ------------------------------------------------------------------------------
	private void generateRandomPowers(){
		ArrayList<String> allPowers = new ArrayList<String>(0);
		allPowers.addAll(Arrays.asList("Super Speed", 
				"Super Strength", "Body Armour", "Flight", "Fire Generation","Weather Control"));
		
		for (int i = 0; i < 3; i++) { 
			int randomValue = (int) (Math.random() * allPowers.size());
			
			superPowers[i] = allPowers.get(randomValue);
			
			allPowers.remove(randomValue);
			
		}
	}
		
		//Public Methods -----------------------------------------------------------------------------------
	
		public void showPowers() {
			System.out.println(this.name + " has: "   );
			for (int i = 0; i < 3; i++){
				System.out.println(superPowers[i]);
			}
			
		}
	}


