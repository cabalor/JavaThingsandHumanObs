package szkola2;

public class Osoba {

	String imie;
	int rokUrodzenia;

	public Osoba(String imie, int rokUrodzenia) {
		super();
		this.imie = imie;
		this.rokUrodzenia = rokUrodzenia;
	}

	public int pobierzeWiek() {
		return 2018 -rokUrodzenia;
	}
	
	
	@Override
	public String toString() {
		return "Osoba [imie=" + imie +"]";
	}
	
	
	

}
