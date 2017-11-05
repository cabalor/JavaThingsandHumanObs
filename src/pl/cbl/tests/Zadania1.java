package pl.cbl.tests;

import java.util.concurrent.SynchronousQueue;

public class Zadania1 {

	public static void main(String[] args) {

		System.out.println("----------Zadanie 1-----------");

		char chr = 'A';
		if (chr < 'A' || chr < 'G') {
			System.out.println("Znak A-G");
		} else {
			System.out.println("Znak H-Z");
		}

		System.out.println("----------zadanie 2---------");
		boolean stat;
		double n;
		if (Math.random() > 0.5) {

			stat = true;
			n = 9.0;
		} else {
			stat = false;
			n = 2.0;
		}

		System.out.println(stat + " " + n);

		System.out.println("-------Zadanie 3-------");

		short zmienna = 200;
		int zm = (int) zmienna;
		System.out.println(zm);
		String str = Integer.toHexString(zm);
		System.out.println(str);
		char jed = str.charAt(0);
		char dwa = str.charAt(1);
		System.out.println("char " + jed);
		System.out.println("char " + dwa);

		System.out.println("-----------Zadanie 4-------");

		for (int i = -100; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println(i);
		}

		System.out.println("--------------Zadanie 5--------------");
		int kk = 0;
		int s = 0;
		while (s <= 10) {
			kk = kk + s;
			s++;
		}
		System.out.println("wynik " + kk);

		int k = 0;
		for (int i = 1; i <= 10; i++) {
			k = k + i;
		}
		System.out.println("wynik " + k);

		
		
		System.out.println("----------------Zadanie 6---------------");
		double g = 0.0;
		for (int i = 0; i < 10; i++) {
			g= g /(Math.pow(2, g));
			System.out.println(g);
			g++;
		}

		System.out.println("----------------Zadanie 7----------------");

		int ii = 10;
		int numm = 0;
		String liczbaPierwsza = "";

		for (ii = 10; ii <= 50; ii++) {
			int licznik = 0;
			for (numm = ii; numm >= 1; numm--) {
				if (ii % numm == 0) {
					licznik = licznik + 1;
				}
			}
			if (licznik == 2) {
				liczbaPierwsza = liczbaPierwsza + ii + " ";
			}
		}
		System.out.println("Liczby pierwsze od 10 do 50 to :" + liczbaPierwsza);
	}
}