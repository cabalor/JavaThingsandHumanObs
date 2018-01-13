package pl.szkola;

import java.util.function.Function;

public class Sloik {

	Dzem dzem;
	boolean bool;

	Sloik(Dzem dzem) {
		this.dzem = dzem;
		this.bool = true;
	}

	public void otworz() {
		bool = true;
		System.out.println("otwarty");
	}

	public void zamknij() {
		bool = false;
		System.out.println("słoik zamkniety");
	}

	public void czyOtwarty() {
		if (bool == true) {
			System.out.println("sloik otwarty");
		} else {
			System.out.println("sloik zamkniety");
		}

	}


	@Override
	public String toString() {
		return "Sloik [dzem=" + dzem + "]";
	}

}
