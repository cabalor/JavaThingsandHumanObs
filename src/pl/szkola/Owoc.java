package pl.szkola;

public class Owoc {
	String color;
	int pestki;
	double waga;

	public Owoc(String color, int pestki) {
		this.color = color;
		this.pestki = pestki;
		waga = 0.5 + (Math.random() * 0.3);
	}

	public String toString() {
		return "Owoc ->\n\tcolor: " + color + "\n\tpestki: " + pestki + " \nwaga " + waga;
	}
}
