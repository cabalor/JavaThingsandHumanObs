package szkola2_3;

public abstract class ElectronicDevices implements Comparable<ElectronicDevices> {

	protected String name;
	protected double price;
	
	public ElectronicDevices(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public int compareTo(ElectronicDevices o) {
		return (int)this.price - (int)o.price;
	}


	@Override
	public String toString() {
		return "ElectronicDevices [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
