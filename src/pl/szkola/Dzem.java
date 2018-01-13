package pl.szkola;

public class Dzem {

	String smak;
	double waga;

	Dzem(String smak, double waga) {
		this.smak = smak;
		this.waga = waga;

	}

	Dzem(String smak) {
		this(smak, 100);

	}

	Dzem(double waga) {
		this("no name", waga);
	}

	@Override
	public String toString() {
		return "Dzem [smak=" + smak + ", waga=" + waga + "]";
	}
}