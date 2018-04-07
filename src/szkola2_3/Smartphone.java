package szkola2_3;

public class Smartphone extends ElectronicDevices implements CallFunctions, PlayFunction, SmsFunction, WriteFunction{

	
	public Smartphone(String name, double price) {
		super(name, price);
	}

	@Override
	public void write() {
		System.out.println("write smart");
		
	}

	@Override
	public void Sms() {
		System.out.println("sms smart");
		
	}

	@Override
	public void play() {
		System.out.println("play smart");
		
	}

	@Override
	public void call() {
		System.out.println("call smart");
		
	}
	
	
}
