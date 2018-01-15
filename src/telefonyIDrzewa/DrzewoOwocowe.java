package telefonyIDrzewa;

public class DrzewoOwocowe extends DrzewoLisciaste{

	String nazwaOwoca;
	
	public DrzewoOwocowe(boolean wiecznieZzielone, int wysokosc, String przekrojDrzewa, int kształtLiscia, String nazwaOwoca) {
		super(wiecznieZzielone, wysokosc, przekrojDrzewa, kształtLiscia);
		// TODO Auto-generated constructor stub
		this.nazwaOwoca = nazwaOwoca;
	}

	@Override
	public String toString() {
		return super.toString() + "DrzewoOwocowe [nazwaOwoca=" + nazwaOwoca + "]";
	}

	@Override
	void zerwijOwoc() throws DrzewoBezowocowException{
		System.out.println("owoc jest");
	}
	
	
	
}
