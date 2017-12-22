package szkola;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		System.out.println("zadania1");

		kwadrat(4, 'x');

		System.out.println("Zadanie 2");

		char[][] znaki = new char[26][26];
		Random r = new Random();

		for (int i = 0; i < znaki.length; i++) {
			for (int j = 0; j < znaki.length; j++) {
				znaki[i][j] = (char) (r.nextInt(26) + 97);
			}
		}
		System.out.println(Arrays.deepToString(znaki));
		
		for (char[] chary : znaki) {

		System.out.print(spradzenie(chary)+" ,");
		}
		System.out.println();
		System.out.println("Zadanie 3");

		int[][] tablica = { { 2, 4, 5 }, { 4, 6, 7 }, { 6, 8, 4 }, };

		boolean ff = dolnaTrojka(tablica);
		System.out.println(ff ? "mamy to" : "nie mamy");

		System.out.println("Zadanie 4");

		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 101);
			int b = (int) (Math.random() * 101);
			int c = eukli(a,b);
			System.out.println("NWD( liczba a " + a + ", i liczba b " + b + " nwd " + c + ")");
		}

		System.out.println("Zadanie 5");
		Kwadrat k = new Kwadrat(2);
		k.show(k);
		System.out.println("Zadanie 6");
		Walec w = new Walec(2, 5);

		w.show(w);
		System.out.println("Zadanie 7");
		Kwadrat kw = new Kwadrat(5, w);
		k.showKwadratWalec(kw);

	}

	public static void kwadrat(int bok, char start) {
		char next = start == 'x' ? 'x' : 'o';
		for (int i = 0; i < bok; i++) {
			for (int j = 0; j < bok; j++) {
				System.out.print(next);
				next = next == 'x' ? 'o' : 'x';
			}
			System.out.println();
		}
	}

	public static int eukli(int a, int b) {
		int c = 0;
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
		
	}

	private static boolean dolnaTrojka(int[][] tab) {

		for (int i = 0; i < tab.length; i++) {
			if (tab[i].length != tab.length)
				return false;
		}

		for (int j = 0; j < tab.length; j++) {
			for (int k = j + 1; k < tab.length; k++) {
				if (tab[j][k] != 0)
					return false;
			}
		}
		return true;
	}

	public static int spradzenie(char[] tab) {
		Pattern pattern = Pattern.compile("ala");
		Matcher matcher = pattern.matcher(String.valueOf(tab));
		int licznik = 0;
		while (matcher.find()) {
			licznik += 1;
		}
		return licznik;
	}

}
