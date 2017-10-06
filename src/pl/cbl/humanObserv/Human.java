package pl.cbl.humanObserv;

import java.util.Random;

public class Human implements HumanObs{

	private String name;
	private double health = 100;
	
	
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
	
	public Human() {}
	
	public Human(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", health=" + health + "]";
	}

	@Override
	public void downHealth(double health) {
		Random random = new Random();
		 health = health - (double)random.nextInt(5);
		 this.setHealth(health);
		 System.out.println("health value down "+health);
		
	}

	@Override
	public void upHealth(double health) {
		Random random = new Random();
		 health = health + (double)random.nextInt(5);
		 this.setHealth(health);
		 System.out.println("health value up "+health);
		
	}
}
