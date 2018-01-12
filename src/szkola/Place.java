package szkola;

import java.util.ArrayList;
import java.util.List;

public class Place {

	private String name;
	private List<Ludzik> ludziki;
	
	public Place(String name) {
		this.name = name;
		ludziki = new ArrayList<>();
	}
	
	public void addLudzik(Ludzik ludzik) {
		ludziki.add(ludzik);
		}
	
	public List<Ludzik> getLudzik(){
		return ludziki;
	}
}
