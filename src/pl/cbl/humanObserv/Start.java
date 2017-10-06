package pl.cbl.humanObserv;

public class Start{

	
	
	
	
	public static void main(String[] args) {

		
		Human human = new Human("rich");
		System.out.println(human.toString());
		Runnable run = new HumanHelth(human);
		new Thread(run).start();
		
	}

		
	}

