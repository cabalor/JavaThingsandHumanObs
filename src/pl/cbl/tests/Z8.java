package pl.cbl.tests;

public class Z8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----z1-------");
		show(5);
		System.out.println("-----z2-------");

		char[] tab = { 'a', 'b', 'c', 'd', 'e' };

		int li = liczba(tab);
		System.out.println(li);

		System.out.println("-----z3-------");

		int[][] tabik = { { 0, 0 }, { 0, 0 }

		};

		fillRow(tabik, 0, 5);
		fillCol(tabik,0,5);
	}

	public static void show(int i) {
		System.out.println(i);
	}

	public static int liczba(char[] tab) {
		int count = 0;
		for (int i = 0; i < tab.length; i++) {
			count++;
		}
		return count;
	}

	public static void display(int[][] tab) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.println(tab[i][j]);
			}
		}
	}

	public static void fillRow(int[][] tab, int row, int val) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (i == row) {
					tab[i][j] = val;
				}
				System.out.println(tab[i][j]+ " "); 
			}
		}

	}
	
	public static void fillCol(int[][] tab, int col, int val) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if(j==col) {
					tab[i][j]=val;
				}
				System.out.println(tab[i][j]+" ");
				}
				
			}
		}

	}
	
	
	
	


