package pl.cbl.humanObserv;

public class Start{

	
	
	
	
	public static void main(String[] args) {

		
		Human human = new Human("rich");
		Human human2 = new Human("jon");
		System.out.println(human.toString());
		System.out.println(human2.toString());
		Runnable run = new HumanHelth(human);
		Runnable run2 = new HumanHelth(human2);
		new Thread(run).start();
		new Thread(run2).start();
	}

		
	}

