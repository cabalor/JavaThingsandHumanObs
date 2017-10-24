package pl.cbl.humanObserv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		List<Human> list = new ArrayList<>();
		while (true) {

			System.out.println("welcome to drink game");
			System.out.println(
					"hit 1 to add a player, hit 2 to exit, hit 3 to show player list, hit 4 to start the game");
			String s = scn.nextLine();
			if (s.equals("1")) {
				if (list.size() < 4) {
					list.add(newPlayer(scn));
				} else {
					System.out.println("max players limit hit");
				}
			} else if (s.equals("2")) {
				System.out.println("shut down");
				System.exit(2);

			} else if (s.equals("3")) {
				for (Human hum : list) {
					System.out.println(hum);
				}

			} else if (s.equals("4")) {
				game(list, scn);
			}

		}

		/*
		 * Human human = new Human("rich"); Human human2 = new Human("jon");
		 * System.out.println(human.toString()); System.out.println(human2.toString());
		 * Runnable run = new HumanHelth(human); Runnable run2 = new HumanHelth(human2);
		 * new Thread(run).start(); new Thread(run2).start();
		 */
	}

	public static Human newPlayer(Scanner scn) {
		System.out.println("set name");
		String name = scn.nextLine();
		Human player = new Human(name);
		return player;

	}

	public static void game(List<Human> players, Scanner scn) {
		System.out.println("how many rounds will you drink?");
		int limit = scn.nextInt();
		scn.nextLine();
		boolean gameOn = true;
		DrinkFactory df = new DrinkFactory();
		String s;
		while (gameOn == true) {
			for (int i = 0; i < limit; i++) {
				for (int j = 0; j < players.size() * limit; j++) {
					System.out.println("Round " + i);
				System.out.println(
						players.get(j).getName() + " choose drink from list: V for Vodka, B for beer, W for wine");
				s = scn.nextLine();
				System.out.println(s);
				Drink dr = df.makeDrink(s);
				System.out.println(dr.Toxicity);
				players.get(j).setToxicity(dr.getToxicity());
				if (dr.getToxicity() > 70) {
					System.out.println("chlejesz metanol");
				} else {
					System.out.println(players.get(j).getName() + " toksycznosc " + players.get(i).getToxicity());
				}
				}
			}

		}

	}
}
