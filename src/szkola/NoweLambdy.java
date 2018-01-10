package szkola;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class NoweLambdy {

	public static void main(String[] args) {
		 	Workery jon = new Workery("dupa", 20);
	        Workery jan = new Workery("sds", 40);
	        Workery hrun = new Workery("asdada", 23);
	        Workery ggg = new Workery("radek", 32);

	        List<Workery> work = new ArrayList<>();
	        work.add(jon);
	        work.add(jan);
	        work.add(hrun);
	        work.add(ggg);
	        
	        work.forEach(W -> {
	        	System.out.println(W.getName());
	        	System.out.println(W.getAge());
	        });
	        
	        System.out.println("workery powyzej 30");
	        System.out.println("=====");
	        for(Workery wo: work) {
	        	if(wo.getAge() >30) {
	        		System.out.println(wo.getName());
	        	}
	        }
	        
	        
	        printWorkeryAge(work, "dupka dupka", w -> w.getAge() > 30);
	        printWorkeryAge(work, "mloda upka", g -> g.getAge() < 30);
	        
	        printWorkeryAge(work, "mlodsi niz 25", new Predicate<Workery>() {

				@Override
				public boolean test(Workery t) {					
					return t.getAge()<25;
				}
	        	
	        });
	        
	        IntPredicate intPred = i -> i >15;
	        IntPredicate wiecej = i -> i < 100;
	        
	        System.out.println(intPred.test(10));
	        
	        int a = 20;
	        System.out.println(intPred.test(a +5));
	        
	        System.out.println(intPred.and(wiecej).test(a));
	        
	        
	        Random rnd = new Random();
	        Supplier<Integer> randSup = () -> rnd.nextInt(10);
	        
	        for(int i=0; i<10; i++) {
	        	System.out.println(randSup.get());
	        }
	        
	        work.forEach(w -> {
	        	String nazwisko = w.getName().substring(w.getName().indexOf(' ') + 1);
	        	System.out.println("naziwsko " + nazwisko);
	        });
	        
	        Function<Workery, String> nazwa = ( Workery worker) -> {
	        	return worker.getName().substring(worker.getName().indexOf(' ') + 1);
	        };
	        
	        String nazwisk2 = nazwa.apply(work.get(1));
	        System.out.println(nazwisk2);
	        
	        
	        Function<Workery, String> imie = (Workery worker) -> {
	        	return worker.getName().substring(0, worker.getName().indexOf(' '));
	        };
	        
	        Random rnd1 = new Random();
	        for(Workery w: work) {
	        	if(rnd1.nextBoolean()) {
	        		System.out.println(dawajImie(imie, w));
	        	} else {
	        		System.out.println(dawajImie(nazwa, w));
	        	}
	        }
	        
	        Function<Workery, String> doGory = worker -> worker.getName().toUpperCase();
	        Function<String, String> dodanie = name -> name.substring(0, name.indexOf(' '));
	        Function chaindeFunc = doGory.andThen(dodanie);
	        System.out.println(chaindeFunc.apply(work.get(0)));
	        
	        BiFunction<String, Workery, String> conAge = (String name, Workery w) -> {
	        	return name.concat( " " + w.getAge());
	        };
	        
	        String upName = doGory.apply(work.get(0));
	        System.out.println(conAge.apply(upName, work.get(0)));
	        
	        
	        IntUnaryOperator in5 = i -> i+ 5;
	        System.out.println(in5.applyAsInt(5));
	        
	        Consumer<String> c1 = s -> s.toUpperCase();
	        Consumer<String> c2 = s -> System.out.println(s);
	        c1.andThen(c2).accept("dupa dupa");
	        
//	        work.forEach(wo -> {
//	        	if(wo.getAge() > 30) {
//	        		System.out.println(wo.getName());
//	        	}
//	        });
//	        
//	        
//	        work.forEach(mo -> {
//	        	if(mo.getAge() < 30) {
//	        		System.out.println(mo.getName());
//	        	}
//	        });
	        

	}

	private static String dawajImie(Function<Workery, String> imie, Workery work) {
		return imie.apply(work);
	}
	
	
	private static void printWorkeryAge(List<Workery> work, String ageText, Predicate<Workery> warunekWieku) {
		System.out.println(ageText);
		for(Workery wo: work) {
			if(warunekWieku.test(wo)) {
				System.out.println(wo.getName());
			}
		}
		/*work.forEach(wo -> {
        	if(wo.getAge() > 30) {
        		System.out.println(wo.getName());
        	}
        });*/
		
		
		
	}
	
	
}
