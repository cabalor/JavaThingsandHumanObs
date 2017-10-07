package pl.cbl.humanObserv;

public class Drink {

	private String type;
	private double toxicLvl;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getToxicLvl() {
		return toxicLvl;
	}
	public void setToxicLvl(double toxicLvl) {
		this.toxicLvl = toxicLvl;
	}
	
	Drink(){}
	
	@Override
	public String toString() {
		return "Drink [type=" + type + ", toxicLvl=" + toxicLvl + "]";
	}
	
	
}
