package szkola2_2;

public class Trojkat extends Figury{

	private int wysoksc;
	private int podstawa;
	private int przeciwprostokatna;
	
	public Trojkat(int wysokosc, int podstawa, int prz) {
		setWysoksc(wysokosc);
		setPodstawa(podstawa);
		setPrzeciwprostokatna(prz);
		this.obwód = this.wysoksc+this.podstawa+this.przeciwprostokatna;
		this.pole = (this.wysoksc+this.podstawa)/2;
		
	}

	public int getWysoksc() {
		return wysoksc;
	}

	public void setWysoksc(int wysoksc) {
		this.wysoksc = wysoksc;
	}

	public int getPodstawa() {
		return podstawa;
	}

	public void setPodstawa(int podstawa) {
		this.podstawa = podstawa;
	}

	public int getPrzeciwprostokatna() {
		return przeciwprostokatna;
	}

	public void setPrzeciwprostokatna(int przeciwprostokatna) {
		this.przeciwprostokatna = przeciwprostokatna;
	}

	@Override
	protected void obwod() {
		this.obwód = this.wysoksc+this.podstawa+this.przeciwprostokatna;
		System.out.println( "obwód wynosi " +obwód);
	}

	@Override
	protected int pole() {
		//System.out.println("pole wynosi "+pole);
	return 	this.pole = (this.wysoksc+this.podstawa)/2;
	
		
	}

	public String toString() {
		return "trojkat " + super.toString();
	}
	
	
}
