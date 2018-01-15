package telefonyIDrzewa;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) throws DrzewoBezowocowException {
		Drzewo d = new DrzewoIglaste(true, 123, "taki", 3, 4);
		Drzewo doa = new DrzewoOwocowe(true, 2, "lewe", 4, "starczy");
		doa.zerwijOwoc();
		//d.zerwijOwoc();
		List<Drzewo> las = new ArrayList<>();
		las.add(d);
		las.add(doa);
		las.forEach(System.out::println);
		//System.out.println(d);
		
	}

}
