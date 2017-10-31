package pl.cbl.humanObserv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DrinkFactory {

	private final String r1 = "[vV]";
	private final String r2 = "[wW]";
	private final String r3 = "[bB]";

	private final Pattern pat = Pattern.compile(r1);
	private Pattern pat2 = Pattern.compile(r2);
	private Pattern pat3 = Pattern.compile(r3);
	private Matcher mat1;
	private Matcher mat2;
	private Matcher mat3;

	public Drink makeDrink(String drink) {
		mat1 = pat.matcher(drink);
		if (mat1.lookingAt()) {
			int rnd = random(1, 10);
			if (rnd < 8) {
				return new Vodka(40);
			} else {
				return new Vodka(80);

			}
		}
		mat2 = pat2.matcher(drink);
		if (mat2.lookingAt()) {
			int rnd = random(1, 10);
			if (rnd < 8) {
				return new Wine(12);
			} else {
				return new Vodka(18);

			}
		}
		mat3 = pat3.matcher(drink);
		if (mat3.lookingAt()) {
			int rnd = random(1, 10);
			if (rnd < 8) {
				return new Beer(5);
			} else {
				return new Beer(10);

			}
		}

		return null;

	}

	int random(int min, int max) {

		int range = (max - min) + 1;
		return (int) (Math.random() * range) + (min <= max ? min : max);

	}

}
