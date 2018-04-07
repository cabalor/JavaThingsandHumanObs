package szkola2_3;

public class Console extends ElectronicDevices implements PlayFunction{

	
	public Console(String name, double price) {
		super(name, price);
	}

	
	
	
	@Override
	public void play() {
		System.out.println("playing console");
	}

	
	

}
