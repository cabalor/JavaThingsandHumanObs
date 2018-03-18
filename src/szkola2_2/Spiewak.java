package szkola2_2;

public abstract class Spiewak {

	
	String name;
	int numer;
	static int counter =0;
	String text;
	
	public Spiewak(String name) {
		this.name = name;
		this.numer = ++counter;
	}
	
	
	public abstract String spiewaj();
	
	
	public String toString() {
		
		return "imie "+name+" numer startowy "+numer +" " +spiewaj();
	}
	
	
	public static Spiewak najglosniej(Spiewak[] tab) {
		Spiewak najglosniejszy = null;
		int max = 0;
		int count =0;
		for(int i =0; i<tab.length; i++) {
			for(int j=0; j<tab[i].spiewaj().length(); j++) {
				if(Character.isUpperCase(tab[i].spiewaj().charAt(j))) {
					count++;
				}
			}
			if(count > max) {
				najglosniejszy = tab[i];
				max = count;
			}
			count =0;
		}
		return najglosniejszy;
	}
	
}
