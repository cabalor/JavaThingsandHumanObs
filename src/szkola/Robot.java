package szkola;

public class Robot {

	private String name;
	private String typ;
	private int wiek;

	public Robot(String name, String typ, int wiek) {
		super();
		this.name = name;
		this.typ = typ;
		this.wiek = wiek;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}


	@Override
	public String toString() {
		return name + " "+wiek;
	}
	
	
	
	
}
