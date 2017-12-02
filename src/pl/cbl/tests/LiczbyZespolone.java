package pl.cbl.tests;

public class LiczbyZespolone {

	private double rzeczywista;
	private double urojona;
	
	
	public LiczbyZespolone(double rzecz, double uro) {
	rzeczywista = rzecz;
	urojona = uro;
	}
	
	LiczbyZespolone(){}
	
	public static double dodaj(LiczbyZespolone li) {
		System.out.println(li.rzeczywista+li.urojona);
	return li.rzeczywista+li.urojona;	
	}
	public static double odejmij(LiczbyZespolone li) {
		return li.rzeczywista-li.urojona;	
		}
	public static double mnoz(LiczbyZespolone li) {
		return li.rzeczywista*li.urojona;	
		}
	public static void zwieksz(LiczbyZespolone li) {
		li.rzeczywista++;
		System.out.println(li.rzeczywista);
	}
	public static void show(LiczbyZespolone li) {
		System.out.println("rzeczywista "+li.rzeczywista+" urojona "+li.urojona+"i");
	}
	
}
