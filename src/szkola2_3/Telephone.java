package szkola2_3;

public class Telephone extends ElectronicDevices implements CallFunctions {

	
	public Telephone(String name, double price) {
		super(name, price);

	}

	@Override
	public void call() {
		System.out.println("dzwoni telefon");
		
	}
	
	
	
}
