package pl.cbl.humanObserv;

public class HumanHelth implements Runnable{

	
	private Human human;
	
	
	public HumanHelth(Human newHuman) {
		human = newHuman;
	}
	
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(human.getHealth()>90) {
			human.downHealth(human.getHealth());
			}
			else {
			human.upHealth(human.getHealth());
			}
		}
		System.out.println(human.toString());
		
	}

	
	
	
	
	
}
