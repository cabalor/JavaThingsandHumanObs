package szkola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class La2 {

	public static void main(String[] args) {
		Runnable run = new Runnable() {
			public void run() {
				String x = "lal llal";
				String[] d = x.split(" ");
				for (String str : d) {
					System.out.println(str);
				}
			}
		};

		Runnable r = () -> {
			String x = "lal llal";
			String[] d = x.split(" ");
			for (String str : d) {
				System.out.println(str);
			}
		};

		Function<String, String> lambdaFunc = s -> {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 1) {
					sb.append(s).charAt(i);
				}
			}
			return sb.toString();

		};

		System.out.println(lambdaFunc.apply("2244333555666"));
		
		String str = evenChar(lambdaFunc, "234432");
		System.out.println(str);
		
		Supplier<String> sup = () -> "wyraz";
		Supplier<String> sup2 = () -> {
			return "wyraz";
		};
		
		String supik = sup.get();
		System.out.println(supik);
		
		
		
		List<String> nazwy = Arrays.asList("rzeka", "stolek", "auto", "drzewo", "kaczka", "trawa", 
				"tratwa", "wozek","arka","wiadro");
		
		List<String> upperCase = new ArrayList<>();
		nazwy.forEach(n -> upperCase.add(n.substring(0, 1).toUpperCase()+n.substring(1)));
		upperCase.sort((s1, s2) -> s1.compareTo(s2));
		upperCase.forEach( s -> System.out.println(s));
		
		List<String> upperCase2 = new ArrayList<>();
		nazwy.forEach(n -> upperCase2.add(n.substring(0, 1).toUpperCase()+n.substring(1)));
		upperCase2.sort(String::compareTo);
		upperCase2.forEach(System.out::println);
		
		List<String> upperCase3 = new ArrayList<>();
		
		nazwy.stream()
			 .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1))
			 .sorted(String::compareTo)
			 .forEach(System.out::println);
		
		int count = (int)nazwy.stream()
				 .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1))
				 .filter(x -> x.startsWith("w"))
				 .count();
		
		nazwy.stream()
		 .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1))
		 .peek(System.out::println)
		 .sorted(String::compareTo)
		 .count();
		 
		
		
		
		
		
		
		
	}

	public static String sec(String root) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < root.length(); i++) {
			if (i % 2 == 1) {
				sb.append(root).charAt(i);
			}
		}
		return sb.toString();
	}

	public static String evenChar(Function<String, String> funkcja, String root) {
		return funkcja.apply(root);
	}
	
	
	
	
	
}
