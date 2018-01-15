package telefonyIDrzewa;

public class Komorka extends Telefon {

	String[] polaczenia = new String[11];
	
	public Komorka(String interfesKomunikacyjny, String kolor, String[] calls) {
		super(interfesKomunikacyjny, kolor);
		polaczenia = calls;
		
	}

	public String[] polaczenia(String[] tab) {
	String[] telefony = new String[10];	
	if(tab[9]!=null && tab[10]==null) {
			telefony = copy(tab);
	}
	return telefony;
	}
	
	public String[] copy(String[] tab) {
		String[] tabi = new String[11];
		for(int i=0;i<9;i++) {
			tabi[i]=tab[i];
		}
		return tabi;
		
	}
	
}