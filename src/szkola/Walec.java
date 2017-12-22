package szkola;

public class Walec {

	
	double promien;
	double wysokosc;
	
	public Walec(double promien, double wysokosc) {
		this.promien = promien;
		this.wysokosc = wysokosc;
		
	}
	
	public void show(Walec w) {
	 System.out.println("pole podstawy walca "+(w.promien*Math.PI));
	 System.out.println("pbjetsc walca "+(Math.PI*(w.promien*w.promien)*w.wysokosc));
	 
	 
 }

	
}
