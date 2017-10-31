package pl.cbl.humanObserv;

import java.util.Random;

public class Human implements HumanObs {

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

	public Human() {
	}

	public Human(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", health=" + health + ", toxicity=" + toxicity + "]";
	}

	@Override
	public void downHealth(double health) {
		Random random = new Random();
		health = health - (double) random.nextInt(5);
		this.setHealth(health);
		System.out.println("health value down " + health + " " + this.getName());

	}

	@Override
	public void upHealth(double health) {
		Random random = new Random();
		health = health + (double) random.nextInt(5);
		this.setHealth(health);
		System.out.println("health value up " + health + " " + this.getName());

	}

	@Override
	public void drink(double toxi) {
		Random rnd = new Random();
		int x = rnd.nextInt(9) + 1;
		Drink dr = new Drink();
		if (x <= 3) {
			dr = df.makeDrink("Vodka");
		} else if (x > 3 && x <= 6) {
			dr = df.makeDrink("Wine");
		} else if (x > 6 && x <= 9) {
			dr = df.makeDrink("Beer");
		}
		toxi = toxi + dr.getToxicity();
		this.setToxicity(toxi);
		System.out.println("toxicity goes up for " + dr.getToxicity() + "\n toxi is now " + toxi + "\n-----------");
	}

}
