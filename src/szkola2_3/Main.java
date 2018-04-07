package szkola2_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements Comparator<ElectronicDevices>{

	public static void main(String[] args) throws ToBigCosTam {
		
		List<Square> lista = new ArrayList<>();
		lista.add(new Square(2));
		lista.add(new Square(5));
		lista.add(new Square(6));
		lista.add(new Square(3));
		lista.add(new Square(1));
		lista.add(new Square(4));
		Collections.sort(lista);
		lista.forEach(x -> System.out.println(x));
		
		
		Console cons = new Console("konsola", 10.0);
		
		cons.play();
	
		Smartphone smart = new Smartphone("smart", 20.0);
		smart.play();
		smart.call();
		smart.Sms();
		smart.write();
		Smartphone smart2 = new Smartphone("smart", 15.0);
		List<ElectronicDevices> list = new ArrayList<>();
		list.add(smart);
		list.add(smart2);
		list.add(cons);
		Collections.sort(list);
		list.forEach(x -> System.out.println(x));
	}


	@Override
	public int compare(ElectronicDevices o1, ElectronicDevices o2) {
		return (int)o1.price - (int)o2.price;
	}

}
