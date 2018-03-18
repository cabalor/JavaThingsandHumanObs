package szkola2_2;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		List<Figury> lista = new ArrayList<>();
		lista.add(new Trojkat(2, 2, 2));
		lista.add(new Kwadrat(4));
		
		lista.forEach(System.out::println);
		//lista.forEach(f -> f.obwod());
		
		for(Figury f : lista) {
			System.out.println(f);
		}
	}

}
