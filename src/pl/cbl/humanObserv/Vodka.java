package pl.cbl.humanObserv;

public class Vodka extends Drink{

	private double Toxi;

	Vodka(double Toxi) {
		super(Toxi);
		// TODO Auto-generated constructor stub
	}

	public double getToxi() {
		return Toxi;
	}

	public void setToxi(double toxi) {
		Toxi = toxi;
	}

	@Override
	public String toString() {
		return "Vodka [Toxi=" + Toxi + "]";
	}

	

}
