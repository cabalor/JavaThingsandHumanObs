package szkola2;

import java.util.Arrays;

public class Student extends Osoba {

	int numerIndeksu;
	int rokStudiow;
	Przedmiot przedmioty[];

	public Student(String imie, int rokUrodzenia, int indeks, int rok ) {
		super(imie, rokUrodzenia);
		numerIndeksu = indeks;
		rokStudiow = rok;
		if(rok ==1) {
			this.przedmioty = new Przedmiot [3];
		}
		if(rok == 2) {
			this.przedmioty = new Przedmiot[4];
		}
		if(rok == 3) {
			this.przedmioty = new Przedmiot[2];
		}
		
	}
	
	boolean maAbsolutorium() {
		int iloscPrzedmiotow = this.przedmioty.length;
		for(Przedmiot p: this.przedmioty) {
			if(p.zaliczony == true) {
				iloscPrzedmiotow--;
			}
		}
		if(iloscPrzedmiotow==0) {
			return true;
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [numerIndeksu=" + numerIndeksu + ", rokStudiow=" + rokStudiow + ", przedmioty="
				+ Arrays.toString(przedmioty) + "]";
	}
	
	
	
	
	
	
}
