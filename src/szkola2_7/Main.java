package szkola2_7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {
	
	public Main() {
		setLayout(new BorderLayout());
		initLeftPanel();
		initCenterPanel();
		initRightPanel();
		// inicjalizacja lewego panelu
		// inicjalizacja środkowego panelu
		// inicjalizacja prawego panelu
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

	private void initLeftPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JButton but1 = new JButton("Gallery");
		JButton but2 = new JButton("Home");
		panel.add(but1);
		panel.add(but2);
		add(panel, BorderLayout.WEST);
	}

	private void initCenterPanel() {
		/*JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());*/
		JList lista = new JList(new MyListModel());
		JScrollPane scroll = new JScrollPane(lista);
		//panel.add(scroll);
		
		//add(panel, BorderLayout.CENTER);
		add(scroll);
	}

	
	private void initRightPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		ImageIcon image = new ImageIcon("pjatk.png");
		TextArea area = new TextArea("dupa dupa dupa dupa duap dupa dupa dupa");
		panel.setBackground(Color.red);
		JLabel label = new JLabel(image);
		add(panel,BorderLayout.EAST);
		panel.add(label);
		panel.add(area, BorderLayout.SOUTH);
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		
		
	}
}
