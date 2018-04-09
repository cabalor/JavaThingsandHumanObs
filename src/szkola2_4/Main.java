package szkola2_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	
		
		String[] arr = { "office A", "rychu", "peja", "office B", "marek", "markowski", "office C", "zosia", "zosiowska", "office A", "basia", "basiowska" };
		
		Map<String, List<Person>> mapa = new HashMap<>();
		
		
		
		
		
		for(int i=0; i< arr.length; i = i+3) {
			if(!mapa.containsKey(arr[i])) {
			List<Person> lista = new ArrayList<>();
			lista.add(new Person (arr[i+1], arr[i+2]));
			mapa.put(arr[i], lista);
			} else {
				mapa.get(arr[i]).add(new Person(arr[i+1], arr[i+2]));
			}
		}
		
		/*for(String klucz:mapa.keySet()) {
			System.out.println(klucz +" " + mapa.get(klucz));
		}*/
		
		
		for(Map.Entry<String, List<Person>> me: mapa.entrySet()) {
			String key = me.getKey();
			List<Person> values = me.getValue();
			System.out.println("key "+key);
			System.out.println("values ");
			for(Person s: values) {
				System.out.println(s);
			}
		}
		
		
		//mapa.forEach((k,v) -> );
	}
	
	public static void show(List<Person> lista) {
		for(Person x: lista) {
			System.out.println(x);
		}
	}
	

}
