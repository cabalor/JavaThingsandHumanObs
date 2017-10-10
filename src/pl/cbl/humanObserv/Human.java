package pl.cbl.humanObserv;

import java.util.Random;

public class Human implements HumanObs{

	private String name;
	private double health = 100;
	private double toxicity = 0;
	
	DrinkFactory df = new DrinkFactory();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	
	public double getToxicity() {
		return toxicity;
	}

	public void setToxicity(double toxicity) {
		this.toxicity = toxicity;
	}

	public Human() {}
	
	public Human(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", health=" + health + ", toxicity=" + toxicity +"]";
	}

	@Override
	public void downHealth(double health) {
		Random random = new Random();
		 health = health - (double)random.nextInt(5);
		 this.setHealth(health);
		 System.out.println("health value down "+health + " "+this.getName());
		
	}
	@Override 
	public void upHealth(double health) {
		Random random = new Random();
		 health = health + (double)random.nextInt(5);
		 this.setHealth(health);
		 System.out.println("health value up "+health+" "+this.getName());
		
	}

	@Override
	public void drink(Drink drink) {
		drink = df.makeDrink("Vodka");
		this.setToxicity(drink.getToxicity());
		System.out.println("toxicity goes up for " + drink.getToxicity());
	}
	
	
	
	
	
	
}
