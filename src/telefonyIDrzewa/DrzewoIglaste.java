package telefonyIDrzewa;

public class DrzewoIglaste extends Drzewo {

	int iloscIgiel;
	int dlugoscSzyszki;
	
	
	public DrzewoIglaste(boolean wiecznieZzielone, int wysokosc, String przekrojDrzewa, int dlugoscSzyszki, int iloscIgiel) {
		super(wiecznieZzielone, wysokosc, przekrojDrzewa);
		this.dlugoscSzyszki = dlugoscSzyszki;
		this.iloscIgiel = iloscIgiel;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "[iloscIgiel=" + iloscIgiel + ", dlugoscSzyszki=" + dlugoscSzyszki + "]";
	}
	
	
	
	
	
}
