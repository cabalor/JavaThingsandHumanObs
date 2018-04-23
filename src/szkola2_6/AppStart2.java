package szkola2_6;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppStart2 extends JFrame {

	public AppStart2() {
		super();
		
		JPanel panel = new MyPanel();
		add(panel);
		setTitle("linie");
//		Graphics2D g2d = Graphics2D;

		//g2d.drawLine(0, 0, 800, 600);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);

	}


}
