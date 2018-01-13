package pl.szkola;

import java.util.ArrayList;
import java.util.List;

public class Factory {

	double waga;
	Sloik[] tab = new Sloik[10];

	void przyjmij(double owoce) {
		waga += owoce;
		if (waga >= 10) {
			for (int i = 0; i < 10; i++) {
				this.tab[i] = new Sloik(new Dzem(1.0));
				System.out.println("sloik zrobiony");
				this.tab[i].zamknij();
			}
			waga -= 10;
		}

	}

	@Override
	public String toString() {
		return "Factory [waga=" + waga + "kg ]";
	}

}
