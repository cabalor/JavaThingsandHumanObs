package szkola2_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private Router router;
	private JPanel centerPanel;
	private JPanel rightPanel;

	public Main() {
		router = new Router();
		setLayout(new BorderLayout());
		initLeftPanel();
		initCenterPanel();
		initRightPanel();
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initLeftPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		add(panel, BorderLayout.WEST);
		for (String name : router.views.keySet()) {
			JButton jbutton = new JButton(name);
			jbutton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					centerPanel.removeAll();
					rightPanel.removeAll();
					for (JComponent element : router.views2.get(name)) {
						rightPanel.add(element);
					}
					
					for (JComponent element : router.views.get(name)) {
						centerPanel.add(element);
					}
					pack();
				}
			});
			panel.add(jbutton);
			panel.setBackground(new Color(103, 58, 183));
		}
	}

	private void initCenterPanel() {
		centerPanel = new JPanel();
		/*JList lista = new JList(new MyListModel());
		JScrollPane scroll = new JScrollPane(lista);
		centerPanel.add(scroll);*/
		centerPanel.add(new JLabel("Witaj"));
		centerPanel.add(new JLabel("przybyszu!"));
		add(centerPanel, BorderLayout.CENTER);
	}

	private JPanel czat() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		TextArea taLow = new TextArea();
		TextArea dispaly = new TextArea();
		dispaly.setBackground(new Color(103, 58, 190));
		panel.add(taLow, BorderLayout.SOUTH);
		panel.add(dispaly, BorderLayout.CENTER);
		add(panel, BorderLayout.EAST);
		return panel;
	}

	private void initRightPanel() {
		rightPanel = new JPanel();
		rightPanel.setLayout(new BorderLayout());
		ImageIcon image = new ImageIcon("pjatk.png");
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 2));
		rightPanel.setBackground(new Color(103, 58, 183));
		JLabel label = new JLabel(image);
		add(rightPanel, BorderLayout.EAST);
		rightPanel.add(label);
		rightPanel.add(panel2, BorderLayout.SOUTH);
		JLabel label2 = new JLabel("imie");
		JLabel label3 = new JLabel("nazwisko");
		JLabel label4 = new JLabel("krysia");
		JLabel label5 = new JLabel("w");
		panel2.add(label2);
		panel2.add(label3);
		panel2.add(label4);
		panel2.add(label5);
		panel2.setBackground(new Color(103, 58, 190));
		rightPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
	}
}
