package pl.szkola;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Owoc owoc = new Owoc("zielony", 1);
		System.out.println(owoc);

		Dzem d = new Dzem("truskawka", 5.0);
		Dzem d1 = new Dzem(5.0);
		Dzem d2 = new Dzem("kupa");

		System.out.println(d + " " + d1 + " " + d2);

		Sloik s = new Sloik(d);
		System.out.println(s);
		s.czyOtwarty();
		s.zamknij();
		s.czyOtwarty();
		s.otworz();
		s.czyOtwarty();

		Factory fac = new Factory();
		fac.przyjmij(5.0);
		fac.przyjmij(3.0);
		fac.przyjmij(3.0);
		System.out.println(fac.toString());
		Sloik[] sloiki = fac.tab;
		System.out.println(Arrays.toString(sloiki));

	}

}
