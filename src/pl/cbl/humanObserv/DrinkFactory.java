package pl.cbl.humanObserv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DrinkFactory {

	private final String r1 = "V"; 
	private final String r2 = "w-W"; 
	private final String r3 = "b-B"; 
	
	private final Pattern pat = Pattern.compile(r1);
	private Pattern pat2 = Pattern.compile(r2);
	private Pattern pat3 = Pattern.compile(r3);
	private Matcher mat;
	
	
	
	public Drink makeDrink(String drink) {
		
		mat = pat.matcher(drink);
		if(mat.lookingAt()) {
			return new Vodka(40);
		}
		if(drink.equals("W")) {
		return new Wine(10);	
		}
		
		if(drink.equals("b-B")) {
			return new Beer(5);	
			}
		
		
		return null;
		
		
	}
}
