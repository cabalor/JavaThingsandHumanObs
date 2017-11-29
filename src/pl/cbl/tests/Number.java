package pl.cbl.tests;

public class Number {

	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void wyswietl() {
		System.out.println(this.number);
	}

	@Override
	public String toString() {
		return "Number [number=" + number + "]";
	}


	
	
}
