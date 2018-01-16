package szkola;

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
