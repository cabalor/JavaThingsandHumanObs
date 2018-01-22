package telefonyIDrzewa;

import java.util.Arrays;
import java.util.Optional;

public class Smartfon extends Komorka {

	Osoba[] osoba;

	public Smartfon(String interfesKomunikacyjny, String kolor, Osoba[] friends) {
		super(interfesKomunikacyjny, kolor);
		osoba = friends;
	}

	@Override
	void zadzwon(String numer) {
		// Arrays.stream(this.osoba).map(Osoba::getTelefon).filter(s ->
		// s.equals(numer)).forEach(System.out::println);
		super.zadzwon(numer);
	}

	@Override
	void showConnectionHitory() {
		System.out.println("\n\tHitoria polaczen");
		for (int i = 0; i < this.polaczenia.length; i++) {
			String numer = "";
			for (int j = 0; j < this.osoba.length; j++) {
				if (Optional.ofNullable(this.polaczenia[i]).orElseGet(() -> "d")
						.equals(Optional.ofNullable(this.osoba[j].getTelefon()).orElseGet(() -> "k"))) {
					System.out.println(this.osoba[j]);
					numer = osoba[j].getTelefon();
				}
			}
			if (check(polaczenia[i], polaczenia, numer)) {
				System.out.println("numer nieznany " + polaczenia[i]);
			}
		}

	}

	private boolean check(String polaczenie, String[] tab, String numer) {
		// boolean t = Arrays.stream(tab).anyMatch(i -> i.equals(polaczenie));
		return polaczenie.equals(numer) ? false : true;

	}

	@Override
	public String toString() {
		return "Smartfon [osoba=" + Arrays.toString(osoba) + ", interfesKomunikacyjny=" + interfesKomunikacyjny
				+ ", kolor=" + kolor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(osoba);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smartfon other = (Smartfon) obj;
		if (!Arrays.equals(osoba, other.osoba))
			return false;
		return true;
	}

}
