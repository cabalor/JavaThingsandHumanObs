package szkola2;

public class Abslwent extends Student{

	public Abslwent(String imie, int rokUrodzenia, int indeks, int rok) {
		super(imie, rokUrodzenia, indeks, rok);
	}
	
	
	@Override
	public String toString() {
		return "inz " + imie ;
	}
	
	void obrona() throws ITNException{
		if(maAbsolutorium()) {
			System.out.println(this.imie + " absolwenta ma zaliczone wszystie przedmioty");
		} else {
			throw new ITNException(imie + "absolwenta nie ma zaliczonych wszystkich przedmiotow");
		}
	}
	
	
	
}
