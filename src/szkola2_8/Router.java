package szkola2_8;

import java.awt.TextArea;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Router {
	Map<String, List<JComponent>> views;

	public Router() {
		views = new TreeMap<>();
		initProfileButton();
		initChatButton();
		//  kod
	}

	private void initProfileButton() {
		List<JComponent> view = new ArrayList<>();
		view.add(new JLabel("Witaj"));
		view.add(new JLabel("przybyszu!"));
		views.put("Profil", view);
	}

	private void initChatButton() {
		List<JComponent> view = new ArrayList<>();
		JList lista = new JList(new MyListModel());
		JScrollPane scroll = new JScrollPane(lista);
		view.add(scroll);
		views.put("Chat", view);
	}
	private void initTextArea() {
		List<JComponent> view = new ArrayList<>();
		TextArea ta = new TextArea();
		
		
	}
}
