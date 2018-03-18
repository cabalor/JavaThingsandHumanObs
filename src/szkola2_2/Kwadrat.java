package szkola2_2;

public class Kwadrat extends Figury{

	int bok;
	
	
	public Kwadrat(int bok) {
		this.bok = bok;
		this.pole = bok * bok;
		this.obwód = bok *4;
	}


	@Override
	protected void obwod() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected int pole() {
		return 0;
		
	}
	
	public String toString() {
		
		return "kwadrat " + super.toString();
	}
	
	
}
