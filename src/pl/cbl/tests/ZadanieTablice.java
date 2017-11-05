package pl.cbl.tests;

import java.util.Random;

public class ZadanieTablice {

	
	public static void main (String[] args) {

		
		System.out.println("-----------------------------zad 1 i 2");
		
		
		int[] tab = new int[10];
		int jed = 0;
		int dwa = 0;
		Random rnd = new Random();
		
		for (int i =0; i<tab.length; i++) {
			tab[i] = rnd.nextInt(2);
			if(tab[i]==0) {
				jed++;
			}else {
				dwa++;
			}
			
			
			
			System.out.println("wartosc "+i+" " + tab[i]);
		}
		
		System.out.println(" jest zer "+ jed +" i " + dwa+" jedynek");
		System.out.println("----------------- zad3");
		
		int zm1 = (int)(Math.random()*100);
		
		int tab2[]= new int[zm1];
		System.out.println("tablica ma dlugosc "+tab2.length);
		
		System.out.println("------------zad 4");
		
		double tab3[] = new double[10];
		
		for(int i=0; i<tab3.length; i++) {
			tab3[i] = (Math.random()*10);
			System.out.println(tab3[i]);
			if(i%2==0&&i==0) {
				System.out.println("parzysty indeks "+i+" wartosc "+tab3[i]);
			}	
		}
		for(int i =0;i<tab3.length;i++) {
			if((int)tab3[i]%2!=0) {
				System.out.println("nieprzysta wartosc a indeksie "+ i + " wartosc "+(int)tab3[i]);
			}
			
		}
		
		System.out.println("========zad5=====");
		
		int tab4[] = {1,0,0,0,2,0,0,0,3};
		int teb5[][] = new int[3][3];
		int index = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				teb5[i][j] = tab4[index];
				index++;
			}
		}
		for(int i=0;i<teb5.length;i++) {
			for(int j=0;j<teb5[i].length;j++) {
				System.out.print(teb5[i][j]+" ");
				
			}
		}

		int tab6[][] = new int[3][3];
		
		int ind2 =0;
		for(int i = teb5.length-1;i>=0;i--) {
			for(int j=0;j<teb5[i].length;j++) {
				tab6[ind2][j] = teb5[i][j];
			}
			ind2++;
		}
		
		for(int i=0;i<tab6.length;i++) {
			for(int j=0;j<tab6[i].length;j++) {
				System.out.print("\n"+tab6[i][j]+" ");
				
			}
		}
		
		int tab7[][] = new int[3][3];
		int ind3 =0;
		for(int i = tab7.length-1;i>=0;i--) {
			for(int j=tab7.length-1;j<teb5[i].length;j++) {
				tab6[ind2][j] = teb5[i][j];
			}
			ind2++;
		}
		
		
	}
	
	
	
}
