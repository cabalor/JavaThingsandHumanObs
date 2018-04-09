package szkola2_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Calculator{

		
	public String doCalc(String str) {
		
		String[] data = str.split(" ");
		Map<String, String> mapa = new HashMap<>();
		mapa.put("+", add(data[0], data[2]));
		mapa.put("-", sub(data[0], data[2]));
		mapa.put("*", mul(data[0], data[2]));
		mapa.put("/", div(data[0], data[2]));
		
		String op = mapa.keySet().stream().filter(x -> x.contains(data[1])).findFirst().orElse(" ");
		
		return Optional.ofNullable(mapa.get(op)).orElse("blad we wpisywanej wartości");
	}


	
	

	private String add(String a, String b) {
		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
	}
	private String sub(String a, String b) {
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	private String mul(String a, String b) {
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	private String div(String a, String b) {
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
	
}
