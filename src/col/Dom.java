package col;

import java.util.ArrayList;
import java.util.List;

public class Dom {

	private final String name;
	private List<Siedzenie> siedzenia = new ArrayList<>();

	public Dom(String name, int row, int siedzeniaRow) {
		this.name = name;

		int lastRow = 'A' + (row - 1);
		for (char r = 'A'; r <= lastRow; r++) {
			for (int numSie = 1; numSie <= siedzeniaRow; numSie++) {
				Siedzenie sie = new Siedzenie(r + String.format("%02d", numSie));
				siedzenia.add(sie);
			}
		}

	}

	public String getDomName() {
		return name;
	}

	public boolean zapasoweSiedzenie(String sieNumber) {
		Siedzenie req = null;
		for (Siedzenie s : siedzenia) {
			if (s.getNumber().equals(sieNumber)) {
				req = s;
			}
		}
		if (req == null) {
			System.out.println("niema siedzenia o numereze " + sieNumber);
			return false;
		}
		return req.rezerwacja();
	}

	public void printAllSiedzenia() {
		for (Siedzenie s : siedzenia) {
			System.out.println(s.getNumber());
		}
	}

}
