package pl.cbl.humanObserv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start{

	
	
	
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		List<Human> list = new ArrayList<>();
		while(true) {
			
		System.out.println("welcome to drink game");
		System.out.println("hit 1 to add a player, hit 2 to exit, hit 3 to show player list, hit 4 to start the game");
		String s = scn.nextLine();
		if(s.equals("1")) {
			list.add(newPlayer(scn));
			
		}else if(s.equals("2")) {
			System.out.println("shut down");
			System.exit(2);
			
		}else if(s.equals("3")) {
			for(Human hum:list) {
				System.out.println(hum);
			}
			
		}
			
		
		
			
			
		}
		
		
		
		
		/*Human human = new Human("rich");
		Human human2 = new Human("jon");
		System.out.println(human.toString());
		System.out.println(human2.toString());
		Runnable run = new HumanHelth(human);
		Runnable run2 = new HumanHelth(human2);
		new Thread(run).start();
		new Thread(run2).start();*/
	}

		public static Human newPlayer(Scanner scn) {
			System.out.println("set name");
			String name = scn.nextLine();
			Human player = new Human(name);
			return player;
			
		}
	}

