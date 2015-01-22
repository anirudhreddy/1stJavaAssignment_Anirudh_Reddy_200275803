public class Project {

	public static void main(String[] args) {
		
		//Instantiate Hero
		StrongMan hero = new StrongMan("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		//INstantiate Villain
		Villain villin = new Villain("Sly Man");
		villin.run();
		villin.steals();
		villin.showAbilities();
		
		//Instantiate Vigilante
		Vigilante vigilante = new Vigilante("Ms. Savage");
		vigilante.run();
		vigilante.steals();
		vigilante.dealsJustice();
		vigilante.showAbilities();
	}

}