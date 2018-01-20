package telefonyIDrzewa;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) throws DrzewoBezowocowException {
		/*Drzewo d = new DrzewoIglaste(true, 123, "taki", 3, 4);
		Drzewo doa = new DrzewoOwocowe(true, 2, "lewe", 4, "starczy");
		doa.zerwijOwoc();
		//d.zerwijOwoc();
		List<Drzewo> las = new ArrayList<>();
		las.add(d);
		las.add(doa);
		las.forEach(System.out::println);*/
		//System.out.println(d);
		
		
		
		Telefon tel = new Komorka("tarcza", "zielona");
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
		System.out.println(tel.toString());
		tel.showConnectionHitory();
		Osoba os1 = new Osoba("x", "xx", "122");
		Osoba[] os = new Osoba[] { new Osoba("x", "xx", "123"), new Osoba("y", "yy", "321")};
		Telefon t = new Smartfon("klawiaturka", "czarny", os);
		
		t.zadzwon("123");
		t.zadzwon("435");
		t.zadzwon("321");
		t.zadzwon("456");
		t.showConnectionHitory();
		System.out.println(t.toString());
	}

}
