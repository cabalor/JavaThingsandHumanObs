package bb;

import java.util.Scanner;

public class Cos {


	public static void main(String[] args) {
	
		double sqTwo = Math.sqrt(2);
		double d = sqTwo-2;
		
		
		if(d>0) {
			System.out.println("wicej niz zero");
		} else {
			System.out.println("zero lub mniej");
		}
		
		Scanner scn = new Scanner(System.in);
		System.out.println("podaj liczbe");
		byte b = scn.nextByte();
		int intek = b;
		String s = Integer.toBinaryString(intek);
		System.out.println(s);
		int i = s.length();
		do {
			System.out.print((b&(1<<s.length()-i--))+" ");
		}
		while(i>=0); 
		
		System.out.println("==================");
		System.out.println((b & (1<<3)));
		System.out.println((b & (1<<2)));
		System.out.println((b & (1<<1)));
		System.out.println((b & (1<<0)));
		
		/*int lo = (byte)b;
		System.out.println(b);
		int n = 33;
		for(int i =0; i<n; i++) {
			lo = lo*2;
		}
		b = (byte) lo;
		System.out.println(b);*/
		/*int intek = b;
		String s = Integer.toBinaryString(intek);
		System.out.println(s);
		while(s.length()>0) {
			int tm = Integer.parseInt(s.charAt(s.length()-1)+'');
		
			
		}*/
		
		
		//System.out.println((b>>1)%2);
		
		
		
		
	}

	
	
	
	
	
}
