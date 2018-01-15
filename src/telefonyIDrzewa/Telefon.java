package telefonyIDrzewa;

public class Telefon {

	String interfesKomunikacyjny;
	String kolor;

	@Override
	public String toString() {
		return "Telefon [interfesKomunikacyjny=" + interfesKomunikacyjny + ", kolor=" + kolor + "]";
	}

	public Telefon(String interfesKomunikacyjny, String kolor) {
		this.interfesKomunikacyjny = interfesKomunikacyjny;
		this.kolor = kolor;
	}

	void zadzwon(String numer) {
		System.out.println(numer);
	}

}
