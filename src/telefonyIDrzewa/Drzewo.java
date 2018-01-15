package telefonyIDrzewa;

public class Drzewo {

	boolean wiecznieZzielone;
	int wysokosc;
	String przekrojDrzewa;

	public Drzewo(boolean wiecznieZzielone, int wysokosc, String przekrojDrzewa) {
		super();
		this.wiecznieZzielone = wiecznieZzielone;
		this.wysokosc = wysokosc;
		this.przekrojDrzewa = przekrojDrzewa;
	}

	@Override
	public String toString() {
		return "Drzewo [wiecznieZzielone=" + wiecznieZzielone + ", wysokosc=" + wysokosc + ", przekrojDrzewa="
				+ przekrojDrzewa + "]";
	}

	void zerwijOwoc() throws DrzewoBezowocowException{
		throw new DrzewoBezowocowException();
	}

}
