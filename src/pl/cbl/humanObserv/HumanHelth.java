package pl.cbl.humanObserv;

public class HumanHelth implements Runnable{

	
	private Human human;
	
	
	public HumanHelth(Human newHuman) {
		human = newHuman;
	}
	
	public DrinkFactory dF = new DrinkFactory();
	
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
			human.drink(dF.makeDrink("Vodka"));
			}
			else {
			human.upHealth(human.getHealth());
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		System.out.println(human.toString());
		
	}

	
	
	
	
	
}
