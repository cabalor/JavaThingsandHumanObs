package szkola2_8;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;

class MyListModel extends DefaultListModel<String> {

	List<String> lista = new ArrayList<>();
	
	
	public MyListModel() {
		lista.add("marek");
		lista.add("darek");
		lista.add("robert");
	}
	
	
	
	
	@Override
	public String getElementAt(int arg0) {
		
		return lista.get(arg0);
	}

	@Override
	public int getSize() {
		return lista.size();
	}
	
	
	
}
