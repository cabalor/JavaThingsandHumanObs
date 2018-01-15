package telefonyIDrzewa;

public class DrzewoLisciaste extends Drzewo {

	
	int ksztaltLiscia;
	
	public DrzewoLisciaste(boolean wiecznieZzielone, int wysokosc, String przekrojDrzewa, int kształtLiscia) {
		super(wiecznieZzielone, wysokosc, przekrojDrzewa);
		this.ksztaltLiscia = kształtLiscia;
	}

	@Override
	public String toString() {
		return "DrzewoLisciaste [ksztaltLiscia=" + ksztaltLiscia + ", wiecznieZzielone=" + wiecznieZzielone
				+ ", wysokosc=" + wysokosc + ", przekrojDrzewa=" + przekrojDrzewa + "]";
	}

	
	
}
