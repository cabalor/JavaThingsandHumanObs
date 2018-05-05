package szkola2_7;

import javax.swing.DefaultListModel;

class MyListModel extends DefaultListModel<Integer> {

	
	
	@Override
	public Integer getElementAt(int arg0) {
		return arg0 * 10;
	}

	@Override
	public int getSize() {
		return 40;
	}
}
