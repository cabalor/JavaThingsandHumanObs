package telefonyIDrzewa;

public class Osoba {

	private String imie;
	private String nazwisko;
	private String telefon;

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Osoba(String imie, String nazwisko, String telefon) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.telefon = telefon;
	}

	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", telefon=" + telefon + "]";
	}

}
