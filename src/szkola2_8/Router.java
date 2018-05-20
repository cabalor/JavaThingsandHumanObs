package szkola2_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Router {
	Map<String, List<JComponent>> views;
	Map<String, List<JComponent>> views2;
	JList lista;

	public Router() {
		views = new TreeMap<>();
		views2 = new TreeMap<>();
		initProfileButton();
		initChatButton();
		initTextArea();
		initRight();
	}

	private void initProfileButton() {
		List<JComponent> view = new ArrayList<>();
		view.add(new JLabel("Witaj"));
		view.add(new JLabel("przybyszu!"));
		views.put("Profil", view);
	}

	private void initChatButton() {
		List<JComponent> view = new ArrayList<>();
		lista = new JList(new MyListModel());
		JScrollPane scroll = new JScrollPane(lista);
		view.add(scroll);
		views.put("Chat", view);
	}

	private void initTextArea() {
		List<JComponent> view = new ArrayList<>();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JTextArea taLow = new JTextArea(10, 40);
		JTextArea dispaly = new JTextArea(16, 40);
		lista.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				dispaly.setText("");
			}
		});

		taLow.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					if (lista.isSelectionEmpty()) {
						JOptionPane.showMessageDialog(panel, "wybierz imie z listy", null,
								JOptionPane.INFORMATION_MESSAGE);
						taLow.setText("");
					} else {
						dispaly.append("do " + lista.getSelectedValue() + " " + taLow.getText());
						taLow.setText("");

					}

				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		});
		dispaly.setBackground(new Color(103, 58, 190));
		panel.add(taLow, BorderLayout.SOUTH);
		panel.add(dispaly, BorderLayout.CENTER);
		view.add(panel);
		views2.put("Chat", view);

	}

	public void initRight() {
		List<JComponent> view = new ArrayList<>();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		ImageIcon image = new ImageIcon("Profile.png");
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 2));
		panel.setBackground(new Color(103, 58, 183));
		JLabel label = new JLabel(image);
		panel.add(label);
		panel.add(panel2, BorderLayout.SOUTH);
		JLabel label2 = new JLabel("imie");
		JLabel label3 = new JLabel("nazwisko");
		JLabel label4 = new JLabel("krycha");
		JLabel label5 = new JLabel("w");
		panel2.add(label2);
		panel2.add(label3);
		panel2.add(label4);
		panel2.add(label5);
		panel2.setBackground(new Color(103, 58, 190));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		view.add(panel);
		views2.put("Profil", view);

	}
}
