package pl.cbl.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ZadanieTablice {

	public static void main(String[] args) {

		System.out.println("-----------------------------zad 1 i 2");

		int[] tab = new int[10];
		int jed = 0;
		int dwa = 0;
		Random rnd = new Random();

		for (int i = 0; i < tab.length; i++) {
			tab[i] = rnd.nextInt(2);
			if (tab[i] == 0) {
				jed++;
			} else {
				dwa++;
			}

			System.out.println("wartosc " + i + " " + tab[i]);
		}

		System.out.println(" jest zer " + jed + " i " + dwa + " jedynek");
		System.out.println("----------------- zad3");

		int zm1 = (int) (Math.random() * 100);

		int tab2[] = new int[zm1];
		System.out.println("tablica ma dlugosc " + tab2.length);

		System.out.println("------------zad 4");

		double tab3[] = new double[10];

		for (int i = 0; i < tab3.length; i++) {
			tab3[i] = (Math.random() * 10);
			System.out.println(tab3[i]);
			if (i % 2 == 0 && i == 0) {
				System.out.println("parzysty indeks " + i + " wartosc " + tab3[i]);
			}
		}
		for (int i = 0; i < tab3.length; i++) {
			if ((int) tab3[i] % 2 != 0) {
				System.out.println("nieprzysta wartosc a indeksie " + i + " wartosc " + (int) tab3[i]);
			}

		}

		System.out.println("========zad5=====");

		int tab4[] = { 1, 0, 0, 0, 2, 0, 0, 0, 3 };
		int teb5[][] = new int[3][3];
		int index = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				teb5[i][j] = tab4[index];
				index++;
			}
		}
		for (int i = 0; i < teb5.length; i++) {
			for (int j = 0; j < teb5[i].length; j++) {
				System.out.print(teb5[i][j] + " ");

			}
		}

		int tab6[][] = new int[3][3];

		int ind2 = 0;
		for (int i = teb5.length - 1; i >= 0; i--) {
			for (int j = 0; j < teb5[i].length; j++) {
				tab6[ind2][j] = teb5[i][j];
			}
			ind2++;
		}
		System.out.println("/n");
		for (int i = 0; i < tab6.length; i++) {
			for (int j = 0; j < tab6[i].length; j++) {
				System.out.print(tab6[i][j] + " ");

			}
		}
		System.out.println("\n");
		int tab7[][] = new int[3][3];
		int ind3 = 0;
		int ind4 = 0;
		for (int i = teb5.length - 1; i >= 0; i--) {
			for (int j = teb5[i].length - 1; j >= 0; j--) {
				tab7[ind3][ind4] = teb5[i][j];
				ind4++;
			}
			ind3++;
			ind4 = 0;
		}

		for (int i = 0; i < tab7.length; i++) {
			for (int j = 0; j < tab7[i].length; j++) {
				System.out.print(tab7[i][j] + " ");

			}
		}

		System.out.println("==============z6===============");

		/*
		 * int tab8[]; System.out.println(tab8); error not initialized
		 */

		System.out.println("==============z7==========");

		/*
		 * int tab9[] = {789, 678, 567};
		 * 
		 * for(int i=0; i<tab9.length; i++) { for(int j =i; j<tab.length;j++) {
		 * System.out.println(tab9[i]-tab9[j]); } }
		 */
		System.out.println("========z8=======");

		int tab10[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		System.out.println(check(tab10));

		System.out.println("==========z8.5=========");

		double[] duble = { 1.3, 5.6, 7.8 };
		int[] tab666 = new int[duble.length];

		for (int i = 0; i < duble.length; i++) {
			tab[i] = (int) duble[i];
		}
		for (int x : tab) {
			System.out.println(x);
		}

		double[] d2 = { 1.2, 4.5, 7.8 };
		int[] dupa = Arrays.stream(d2).mapToInt(d -> (int) d).toArray();
		System.out.println(Arrays.toString(dupa));

		System.out.println("=============z9 i z10==============");

		int[][] tab44 = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				tab44[i][j] = (int) (Math.random() * 10);
			}
		}
		int[][] tab55 = { { 1, 1 }, { 1, 4 } };

		checkDiagonal(tab44);
		evenSum(tab55);
		evenS(tab44);
	}

	public static boolean check(int[][] tabi) {

		int check = (tabi.length * tabi[0].length) / tabi.length;
		int count = 0;
		for (int i = 0; i < tabi.length; i++) {
			for (int j = 0; j < tabi[i].length; j++) {
				if (i == j && tabi[i][j] == 1) {
					count++;
				}
				if (i != j && tabi[i][j] != 0) {
					return false;
				}
			}
		}
		if (check == count) {
			return true;
		}
		return false;
	}

	public static boolean checkDiagonal(int[][] tab) {
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (i == j) {
					lista.add(tab[i][j]);
				}
			}
		}
		System.out.println(lista.size());

		return true;
	}

	
	
	public static boolean evenSum(int[][] tab) {
		int sumaW = 0;
		int sumaK = 0;
		int check = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				sumaW = sumaW + tab[i][j];
				sumaK = sumaK + tab[j][i];
			}
			System.out.println("sssss " + sumaW);
			System.out.println("kkkk " + sumaK);
			if (sumaW == sumaK) {
				System.out.println("wiersz jest rowny kolumnie");
				check++;
			}
			sumaK = 0;
			sumaW = 0;
		}
		if (check > 0) {
			System.out.println("byly rowne kolumny w liczbie " + check);
			return true;
		}
		System.out.println("nie ma rownych kolumn");
		return false;
	}

	public static boolean evenS(int[][] tab) {
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<tab.length;i++) {
			for(int j=0; j<tab.length;j++) {
				sum1 = sum1 + tab[i][j];
				sum2 = sum2 + tab[j][i];
			}
		}
		
		System.out.println("s1 "+sum1+" sum2 "+sum2);
		
		
		return false;
		
		
		
	}
	
	
	
	
}
