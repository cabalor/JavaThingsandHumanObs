package pl.cbl.tests;

import java.util.Arrays;
import java.util.Random;

public class ZadaniaZajęcia7 {

	public static void main(String[] args) {

		System.out.println("-----Zadanie 1------");

		char[] tab1 = { 'a', 'b', 'c', 'd', 'e', 'f' };

		for (int i = 0; i < tab1.length; i++) {
			if (i == 0) {
				System.out.println(tab1[tab1.length - 1] + " " + tab1[i] + " " + tab1[i + 1]);

			} else if (i != 0 && i != tab1.length - 1) {
				System.out.println(tab1[i - 1] + " " + tab1[i] + " " + tab1[i + 1]);
			} else if (i == tab1.length - 1) {
				System.out.println(tab1[i - 1] + " " + tab1[i] + " " + tab1[0]);
			}
		}

		System.out.println("Zadanie 2------------------");

		int[] tab2 = new int[100];
		for (int i = 0; i < tab2.length; i++) {
			tab2[i] = (int) (Math.random() * 100);
			System.out.print(tab2[i] + ",");
		}
		System.out.println();

		int avg = 0;
		for (int i = 0; i < tab2.length; i++) {
			avg = avg + tab2[i];
		}
		avg = avg / tab2.length;
		System.out.println("avg" + avg);

		int ileM = 0;
		int ileW = 0;
		for (int i = 0; i < tab2.length; i++) {
			if (tab2[i] < avg) {
				ileM++;
			} else {
				ileW++;
			}
		}

		int[] mSr = new int[ileM];
		int[] wSr = new int[ileW];
		int mCout = 0;
		int wCou = 0;
		for (int i = 0; i < tab2.length; i++) {
			if (tab2[i] < avg) {
				mSr[mCout++] = tab2[i];
			} else {
				wSr[wCou++] = tab2[i];
			}
		}

		System.out.print("mniejsze od wartosci sredniej: ");
		for (int i = 0; i < mSr.length; i++) {
			System.out.print(mSr[i] + ", ");
		}
		System.out.print("\nwikesze od wartosci sredniej: ");
		for (int i = 0; i < wSr.length; i++) {
			System.out.print(wSr[i] + ", ");
		}

		System.out.println("----------Zadanie3----------------");

		int[][] tab = { { 1, 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 1, 0 } };
		int l = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int k = 0; k < tab[i].length; k++) {
				l++;
			}
		}
		System.out.println(l);

		int[] tab222 = new int[l];
		l = 0;

		for (int i = 0; i < tab.length; i++) {
			System.out.println(i);
			for (int k = 0; k < tab[i].length; k++) {
				System.out.println(k);
				tab222[l] = tab[i][k];
				l++;
			}
		}
		for (int x : tab222) {
			System.out.print(x + " ");
		}

		System.out.println("\n------zadanie4--------");

		double[][] punkt = { { 1 }, { 0 }, { 0 } };

		double[][] odbicie = { { 1, 0, 0 }, { 0, -1, 0 }, { 0, 0, 1 } };

		double[][] rezultat = new double[3][1];

		for (int i = 0; i < rezultat.length; i++) {
			for (int j = 0; j < odbicie[i].length; j++) {
				rezultat[i][0] += punkt[j][0] * odbicie[i][j];
			}
			System.out.println(rezultat[i][0]);
		}

		System.out.println("-------Zadanie5----------");

		int[][] wynik = tablica(5);
		for (int i = 0; i < wynik.length; i++) {
			for (int j = 0; j < wynik[i].length; j++) {
				System.out.print(wynik[i][j]);
			}
			System.out.print("\n");
		}

	}

	public static int[][] tablica(int m) {
		int[][] tab = new int[m][m];
		for (int value = 0; value <= m / 2; value++) {
			for (int i = value; i < tab.length - value; i++) {
				for (int j = value; j < tab.length - value; j++) {
					tab[i][j] = value;
				}
			}
		}
		return tab;
	}

}
