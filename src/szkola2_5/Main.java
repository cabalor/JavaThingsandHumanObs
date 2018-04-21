package szkola2_5;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Letters letters = new Letters("AB");
			for (Thread t : letters.getTherds()) {
		
				System.out.println(t.getName());
				t.start();
			}
			
			
			System.out.println("\nProgram skończył działanie");
		}
	}
