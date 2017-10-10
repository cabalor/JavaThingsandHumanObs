package pl.cbl.humanObserv;

public class Drink {
	
	public double Toxicity;

	public double getToxicity() {
		return Toxicity;
	}

	public void setToxicity(double toxicity) {
		Toxicity = toxicity;
	}
	
	Drink(double Toxi){
		Toxicity = Toxi;
	}

	@Override
	public String toString() {
		return "Drink [Toxicity=" + Toxicity + "]";
	}
	
	
}
