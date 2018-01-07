package szkola;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		
		B.showStat(new B(3,3));
		B b = new B();
		b.show();
		
		KulaW kw = new KulaW();
		
		Kwadrat k = new Kwadrat(6);
		
		kw.set(k);
		
		kw.k.show(k);
		System.out.println(kw);
		
		
		KulaNa ns = new KulaNa(new Kwadrat(5));
		String str = "ala ma kota";
		
		System.out.println(str.charAt(4)+ " " +str.charAt(2));
		
		System.out.println(str.indexOf("k"));
		System.out.println(str.length());
		String[] tab = str.split(" ");
		System.out.println(Arrays.toString(tab));
		
	}

}
