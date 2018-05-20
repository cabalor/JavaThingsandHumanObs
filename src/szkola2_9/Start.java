package szkola2_9;

import javax.swing.*;
import java.awt.*;

class PaintWindow extends JFrame {

	double srednica = 20;
	double x = 10;
	double y = 10;
	double zmianaX = 3;
	double zmianaY = 2;

	PaintWindow() {

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// Tworzymy wątek
		Thread thread = new Thread(() -> {
			// Przez cały czas trwania programu
			while (true) {
				// Przeliczamy pozycję
				this.updatePosition();
				// Wywołujemy ponowne wyrysowanie
				this.revalidate();
				this.repaint();
				try {
					// Dajemy nacieszyć się wynikiem
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
			}
		});
		// Uruchamiamy wątek
		thread.start();
	}

	private void updatePosition() {

		x += zmianaX;
		y += zmianaY;

		int szerokosc = getWidth();
		int wysokosc = getHeight();

		if (x - srednica < 0) {
			zmianaX = -zmianaX;
			x = srednica;
		}
		if (x + srednica > szerokosc) {
			zmianaX = -zmianaX; /* + Math.random(); */
			x = szerokosc - srednica;
		}
		if (y - srednica < 0) {
			zmianaY = -zmianaY;
			y = srednica;
		}
		if (y + srednica > wysokosc) {
			zmianaY = -zmianaY; /* + Math.random(); */
			y = wysokosc - srednica;
		}

	}

	@Override
	public void paint(Graphics g) {
		// g.clearRect(0, 0, getWidth(), getHeight());
		g.setColor(new Color(255, 100, 100));
		g.drawOval((int) (x - srednica), (int) (y - srednica), (int) (srednica), (int) (srednica));
	}

}

public class Start {
	public static void main(String[] args) {
		new PaintWindow();

	}
}
