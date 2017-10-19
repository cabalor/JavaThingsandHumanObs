package pl.cbl.humanObserv;

public class DrinkFactory {

	
	
	
	public Drink makeDrink(String drink) {
		
		if(drink == "Vodka") {
			
			return new Vodka(40);
		}
		
		
		if(drink == "Wine") {
		return new Wine(10);	
		}
		
		if(drink == "Beer") {
			return new Beer(5);	
			}
		
		
		return null;
		
		
	}
}
