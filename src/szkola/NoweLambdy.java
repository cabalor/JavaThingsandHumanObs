package szkola;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
