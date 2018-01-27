package szkola2;

public class Przedmiot {

	String nazwa;
	boolean zaliczony;
	
	
	
	public Przedmiot(String nazwa, boolean zaliczony) {
		this.nazwa = nazwa;
		this.zaliczony = zaliczony;
	}



	@Override
	public String toString() {
		return "Przedmiot [nazwa=" + nazwa + ", zaliczony=" + zaliczony + "]";
	}
	
	
	
	
	
	
}
