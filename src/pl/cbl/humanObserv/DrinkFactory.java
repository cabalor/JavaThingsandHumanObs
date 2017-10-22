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
			return new Vodka(40);
		}
		mat2 = pat2.matcher(drink);
		if (mat2.lookingAt()) {
			return new Wine(10);
		}
		mat3 = pat3.matcher(drink);
		if (mat3.lookingAt()) {
			return new Beer(5);
		}

		return null;

	}
}
