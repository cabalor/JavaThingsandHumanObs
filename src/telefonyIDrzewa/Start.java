package telefonyIDrzewa;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) throws DrzewoBezowocowException {
		
		Rakieta rak = new Rakieta("rakieta 1");
		rak.zatankuj();
		try {
			rak.start();
		} catch (ZaMaloPaliwaException e1) {
			e1.printStackTrace();
			System.err.println("malo paliwa, startu nie ma");
		}
		
		
		Drzewo d = new DrzewoIglaste(true, 123, "taki", 3, 4);
		Drzewo owoc = new DrzewoOwocowe(true, 2, "lewe", 4, "starczy");
		Drzewo lisc = new DrzewoLisciaste(true, 300, "zly", 5);
		Drzewo iglaste = new DrzewoIglaste(true, 300, "dobre", 5, 5);
		try {
		owoc.zerwijOwoc();
		lisc.zerwijOwoc();
		} catch(DrzewoBezowocowException e) {
			e.printStackTrace();
			System.err.println("polecial wyjatek ale zyjemy "+lisc+" nie ma owocow, niestety");
		}
		List<Drzewo> las = new ArrayList<>();
		las.add(d);
		las.add(owoc);
		las.add(lisc);
		las.add(iglaste);
		las.forEach(System.out::println);
		
		System.out.println("\n====================Telefony========================");
		Telefon telefon = new Telefon("tarcza", "czerwony");
		telefon.zadzwon("2222");
		telefon.zadzwon("44444");
		telefon.showConnectionHitory();
		System.out.println("\n================komorka================");
		
		Telefon tel = new Komorka("wyswietlacz", "zielona");
		tel.zadzwon("112121");
		tel.zadzwon("2");
		tel.zadzwon("3112121");
		tel.zadzwon("4112121");
		tel.zadzwon("5112121");
		tel.zadzwon("6112121");
		tel.zadzwon("7112121");
		tel.zadzwon("8112121");
		tel.zadzwon("9112121");
		tel.zadzwon("10");
		tel.zadzwon("11");
		tel.showConnectionHitory();
		
		System.out.println("\n==========================smartfon==========================");
		
		Osoba[] os = new Osoba[] { new Osoba("janek", "gmoch", "123"), new Osoba("hula", "kula", "321"), new Osoba("asda", "fdfd", "756")};
		Telefon t = new Smartfon("klawiaturka", "czarny", os);
		t.zadzwon("123");
		t.zadzwon("435");
		t.zadzwon("321");
		t.zadzwon("456");
		t.zadzwon("756");
		t.zadzwon("9956");
		t.zadzwon("4543446");
		t.zadzwon("5666456");
		t.zadzwon("77776777456");
		t.zadzwon("12132131456");
		t.zadzwon("444");
		t.showConnectionHitory();
	}

}
