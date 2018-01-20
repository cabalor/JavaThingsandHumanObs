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
		if(i >= this.polaczenia.length) {
			this.polaczenia = copy(this.polaczenia);
			this.polaczenia[this.polaczenia.length-1] = numer;
		} else {
		this.polaczenia[i] = numer;
		this.i++;
		}
	}

	
	private String[] copy(String[] tab) {
		String[] tabi = new String[tab.length];
		for(int i=0;i<tab.length-1;i++) {
			tabi[i]=tab[i+1];
		}
		return tabi;
	}

	@Override
	void showConnectionHitory() {
		System.out.println("historia polaczen");
		for(String s: this.polaczenia) {
			System.out.println("polaczenie " + s);
		}
	}
	
	
	@Override
	public String toString() {
		return "Komorka [polaczenia=" + Arrays.toString(polaczenia) + ", interfesKomunikacyjny=" + interfesKomunikacyjny
				+ ", kolor=" + kolor + "]";
	}
	
	
	
}