package szkola;

public class Kwadrat {

	double bok;
	Walec w;
	
	
	public Kwadrat(double bok, Walec w) {
		this.bok = bok;
		this.w = w;
	}
	public Kwadrat(int bok) {
		this.bok = bok;
	}
	
	public void show(Kwadrat k) {
		System.out.println("pole = "+(k.bok * k.bok));
		System.out.println("pole szescianu = "+(k.bok*k.bok*k.bok));
	}
	
	
	
	public void showKwadratWalec(Kwadrat k) {
		System.out.println("pole kwadrata = "+(k.bok * k.bok));
		System.out.println("pole szescianu = "+(k.bok*k.bok*k.bok));
		System.out.println("pbjetsc walca "+(Math.PI*((k.bok*k.bok)*k.w.wysokosc)));
		System.out.println("dane walca umieszczonego w szescianie wysokosc "+ k.w.wysokosc + " promien "+k.bok);
	}
	@Override
	public String toString() {
		return "Kwadrat [bok=" + bok + ", w=" + w + "]";
	}
	
	
}
