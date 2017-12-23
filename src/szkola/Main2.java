package szkola;

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
		
		

	}

}
