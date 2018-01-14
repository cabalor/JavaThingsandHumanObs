package szkola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamy {

	public static void main(String[] args) {

		List<String> BingoNumb = Arrays.asList("A40", "A50", "B60", "B20", "B10", "b12", "C30", "C45", "D25");

		List<String> bLiczby = new ArrayList<>();

		bLiczby.stream()
				.map(String::toUpperCase)   //String -> String.toUpperCase()
				.filter(s -> s.startsWith("B"))
				.sorted()
				.forEach(System.out::println); //str -> System.out.println(str)
		
		
		Stream<String> streamString = Stream.of("V1", "V12", "V14", "V16");
		Stream<String> secondString = Stream.of("N12", "N14", "N6", "N18", "N88");
		Stream<String> zloaczenie = Stream.concat(streamString, secondString);
		System.out.println(zloaczenie.distinct().count());
		System.out.println("xxxxxxxxxxxxx");
		System.out.println(zloaczenie.distinct().peek(System.out::println).count());
		
		
		Ludzik janek = new Ludzik("swinia", "okopowa", 33);
		Ludzik ranek = new Ludzik("cialak", "oko", 23);
		Ludzik mozg = new Ludzik("dalajlama", "egonoo", 40);
		Ludzik kalafior = new Ludzik("glen", "drka", 35);
		
		Place zamek = new Place("zamek");
		zamek.addLudzik(kalafior);
		zamek.addLudzik(mozg);
		zamek.addLudzik(ranek);
		
		Place skrytka = new Place("skryka");
		skrytka.addLudzik(janek);
		
		List<Place> miejsca = new ArrayList<>();
		miejsca.add(zamek);
		miejsca.add(skrytka);
		
		miejsca.stream().flatMap(m -> m.getLudzik().stream()).forEach(System.out::println);
		
		List<String> sortetNumbers = BingoNumb.stream()
				.map(String::toUpperCase)
				.filter(s -> s.startsWith("B"))
				.sorted()
				.collect(Collectors.toList());
		for(String numb: sortetNumbers) {
			System.out.println(numb);
		}
				
		List<String> sortetNumbers2 = BingoNumb.stream()
				.map(String::toUpperCase)
				.filter(s -> s.startsWith("B"))
				.sorted()
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		Map<Integer, List<Ludzik>> poWieku = miejsca.stream()
				.flatMap(miejsce -> miejsce.getLudzik().stream())
				.collect(Collectors.groupingBy(ludzik -> ludzik.getHp()));
		
		miejsca.stream()
		.flatMap( mie -> mie.getLudzik().stream())
		.reduce((l1, l2) -> l1.getHp() < l2.getHp() ? l1 : l2)
		.ifPresent(System.out::println);
		
		
		Stream.of("aac", "baa", "abc", "sr", "ser")
		.filter(s -> {
			System.out.println(s);
			return s.length() == 3;
		}).count();
		
		

		
		BingoNumb.forEach(liczby -> {
			if (liczby.toUpperCase().startsWith("B")) {
				bLiczby.add(liczby);
			}
		});

		bLiczby.sort((String s1, String s2) -> s1.compareTo(s2));
		bLiczby.forEach((String stinga) -> System.out.println(stinga));
		;

		BingoNumb.forEach(liczby -> {
			if (liczby.toUpperCase().startsWith("B")) {
				System.out.println(liczby);
			}
		});

	}

}
