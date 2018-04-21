package szkola2_5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;


public class Letters{

	public String str;

	public List<Thread> lista = new ArrayList<>();

	private final AtomicBoolean running = new AtomicBoolean(true);
	
	
	public Letters(String s) {

		for (int i = 0; i < s.length(); i++) {
			final char c = s.charAt(i);

			Thread t = new Thread(() -> {
				int count =0;
				while (running.get()) {
					count++;
					
					try {
						Thread.sleep(1000);
						System.out.println("spie");
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
					System.out.println(c);
					
					if(count == 5 ) {
						running.set(false);
					}
				}

			});

			lista.add(t);
		}
	}

	public List<Thread> getTherds() {
		return lista;
	}

}
