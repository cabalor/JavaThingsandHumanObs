package telefonyIDrzewa;

import java.util.Arrays;

public class Komorka extends Telefon {

	protected String[] polaczenia = new String[10];

	public String[] getPolaczenia() {
		return polaczenia;
	}

	public void setPolaczenia(String[] polaczenia) {
		this.polaczenia = polaczenia;
	}

	private int i = 0;

	public Komorka(String interfesKomunikacyjny, String kolor) {
		super(interfesKomunikacyjny, kolor);

	}

	void zadzwon(String numer) {
		super.zadzwon(numer);
		dodaniePolaczenia(numer);
	}

	private void dodaniePolaczenia(String numer) {
		if (i >= this.polaczenia.length) {
			this.polaczenia = copy(this.polaczenia);
			this.polaczenia[this.polaczenia.length - 1] = numer;
		} else {
			this.polaczenia[i] = numer;
			this.i++;
		}
	}

	private String[] copy(String[] tab) {
		String[] tabi = new String[tab.length];
		for (int i = 0; i < tab.length - 1; i++) {
			tabi[i] = tab[i + 1];
		}
		return tabi;
	}

	@Override
	void showConnectionHitory() {
		System.out.println("\n\thistoria polaczen");
		for (String s : this.polaczenia) {
			System.out.println("polaczenie " + s);
		}
	}

	@Override
	public String toString() {
		return "Komorka [polaczenia=" + Arrays.toString(polaczenia) + ", interfesKomunikacyjny=" + interfesKomunikacyjny
				+ ", kolor=" + kolor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + Arrays.hashCode(polaczenia);
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
		Komorka other = (Komorka) obj;
		if (i != other.i)
			return false;
		if (!Arrays.equals(polaczenia, other.polaczenia))
			return false;
		return true;
	}

}