package telefonyIDrzewa;

public class Telefon {

	String interfesKomunikacyjny;
	String kolor;

	public Telefon(String interfesKomunikacyjny, String kolor) {
		this.interfesKomunikacyjny = interfesKomunikacyjny;
		this.kolor = kolor;
	}

	void zadzwon(String numer) {
		System.out.println("dzwonie " + numer);
	}

	void showConnectionHitory() {
		System.out.println("nie ma historii");
	}

	@Override
	public String toString() {
		return "Telefon [interfesKomunikacyjny=" + interfesKomunikacyjny + ", kolor=" + kolor + "]";
	}

}
