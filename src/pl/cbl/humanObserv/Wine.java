package pl.cbl.humanObserv;

public class Wine extends Drink{

	
	Wine(double Toxi) {
		super(Toxi);
		// TODO Auto-generated constructor stub
	}


	private double Toxi ;
	
	
	


	public double getToxi() {
		return Toxi;
	}


	public void setToxi(double toxi) {
		Toxi = toxi;
	}


	@Override
	public String toString() {
		return "Wine [Toxi=" + Toxi + "]";
	}

	
	
}
