package szkola2;

import static org.hamcrest.CoreMatchers.instanceOf;

public class Start {

	
	public static void main(String[] args) {
		
		
		Przedmiot p1 = new Przedmiot("matma", true);
		Przedmiot p2 = new Przedmiot("matma2", true);
		Przedmiot p3 = new Przedmiot("matma3", false);
		Przedmiot p4 = new Przedmiot("matma4", true);
		
		Osoba[] osoby = new Osoba[5];
		
		Osoba o1 = new Osoba("danuta", 1984);
		Student s1 = new Student("romek", 1995,	1,1);
		Abslwent a1 = new Abslwent("radek", 1996, 2, 2);
		Student s2 = new Student("bartek", 1987,1,1);
		Abslwent a2 = new Abslwent("fazi", 1993, 2, 2);
		s1.przedmioty[0] = p1;
		s1.przedmioty[1] = p2;
		s1.przedmioty[2] = p4;
		a1.przedmioty[0] = p1;
		a1.przedmioty[1] = p1;
		a1.przedmioty[2] = p2;
		a1.przedmioty[3] = p2;
		a2.przedmioty[0] = p1;
		a2.przedmioty[1] = p1;
		a2.przedmioty[2] = p1;
		a2.przedmioty[3] = p3;
		s1.przedmioty[0] = p1;
		s1.przedmioty[1] = p2;
		s1.przedmioty[2] = p3;
		
		osoby[0] = o1;
		osoby[1] = s1;
		osoby[2] = a1;
		osoby[3] = s2;
		osoby[4] = a2;
		System.out.println("======================");
		
		for(Osoba o: osoby) {
			if(o instanceof Student) {
				System.out.println("mamy studenta " + o.imie);
			}
			else if(o instanceof Abslwent) {
				System.out.println("mamy absolwenta " + o.imie);
			} else {
				System.out.println("mamy osobe " + o.imie);
			}
		}
		
		
		try {
			a1.obrona();
		} catch (ITNException e) {
			e.printStackTrace();
		}
		
		try {
			a2.obrona();
		} catch (ITNException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s1.pobierzeWiek()+" wiek studenta : "+ s1.imie +" imie studenta");
		
		System.out.println("imie absolwenta "+a1 + " wiek absolwenta "+a1.imie + " numer indeksu "+ a1.numerIndeksu + "");
		
		System.out.println(a2);
		
		System.out.println(s1);
		
		
	}
	
	
	
	
	
	
}
