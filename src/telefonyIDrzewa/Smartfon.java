package telefonyIDrzewa;

import java.util.Arrays;

public class Smartfon extends Komorka {

	Osoba[] osoba;

	public Smartfon(String interfesKomunikacyjny, String kolor, Osoba[] friends) {
		super(interfesKomunikacyjny, kolor);
		osoba = friends;
	}

	@Override
	void zadzwon(String numer) {
		//Arrays.stream(this.osoba).map(Osoba::getTelefon).filter(s -> s.equals(numer)).forEach(System.out::println);
		super.zadzwon(numer);
	}

	@Override
	void showConnectionHitory() {
		for(int i =0; i< this.polaczenia.length;i++) {
			for(int j =0; j< this.osoba.length;j++) {
				if(this.polaczenia[i].equals(this.osoba[j].getTelefon())) {
					System.out.println(this.osoba[j].toString());
				}
			}
			System.out.println(this.polaczenia[i]);
		}
		
	}

	@Override
	public String toString() {
		return "Smartfon [osoba=" + Arrays.toString(osoba) + ", interfesKomunikacyjny=" + interfesKomunikacyjny
				+ ", kolor=" + kolor + "]";
	}

}
