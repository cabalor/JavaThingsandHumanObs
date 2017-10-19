package pl.cbl.humanObserv;

public class Beer extends Drink{

	private double Toxi;

	public double getToxi() {
		return Toxi;
	}

	public void setToxi(double toxi) {
		Toxi = toxi;
	}

	public Beer(double Toxi) {
		super(Toxi);
	}

	@Override
	public String toString() {
		return "Beer [Toxi=" + Toxi + "]";
	}
	
	
	
	
}
