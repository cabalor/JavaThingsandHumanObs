package szkola;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nowa {

	public static void main(String[] args) throws IOException {

		Robot rob = new Robot("robek", "kupa", 12);
		Robot rob1 = new Robot("robek3", "kupa", 12);
		Robot rob2 = new Robot("robe4k", "kupa", 12);
		// rob.wyswietl(rob);
		System.out.println(rob + " " + rob1 + " " + rob2);

		String[] tab = new String[5];

		/*
		 * try { System.out.println(tab[6]); } catch (ArrayIndexOutOfBoundsException b)
		 * { b.printStackTrace(); System.err.println("jestes glupi"); }
		 */

		try {
			try {
				throw new Wyjatek("dupa");
			} catch (Wyjatek e) {
				System.out.println("polecial nasz wyjatek");

			}
			System.out.println(tab[6]);
		} catch (ArrayIndexOutOfBoundsException b) {
			// b.printStackTrace();
			System.out.println("jestes glupi");
		}

		System.out.println(rob);

		int a = 2, c = 1;

		try {
			int x = dziel(a, c);
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println("nie dziel przez zero");
		} catch (Wyjatek e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		metoda();
		// System.out.println("ssssss");

		File file = new File("d.txt");
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("dddddddd\nsdsdfdsfsdfsdsf\nbgbbdfdfgdbfgbgbg\nsdfsfsdfsdfdsfd\nmjmjmjmjmjjm");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*InputStream is = null;
		try {
			is = new FileInputStream("d.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		Reader isr = new InputStreamReader(is);
		int data = 0;
		try {
			data = isr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (data != -1) {
			char cc = (char) data;
			System.out.println(cc);
			try {
				data = isr.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}*/

		//FileReader fw = new FileReader("d.txt");
		List<String> lista = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();
		
		Stream<String> st = Files.lines(Paths.get("d.txt"));
		lista2 = st.map(String -> String.toUpperCase())
		.collect(Collectors.toList());
		lista2.forEach(System.out::println);
		
		
		BufferedReader br = Files.newBufferedReader(Paths.get("d.txt"));
		lista = br.lines().collect(Collectors.toList());
		lista.forEach(System.out::println);
		
	}

	static void metoda() {
		int a = 0;
		int b = 5;
		try {
			dziel(b, a);
		} catch (Wyjatek e) {
			e.printStackTrace();
		}
	}

	static int dziel(int a, int b) throws Wyjatek {
		if (b == 0) {
			throw new Wyjatek("bbbbbbbbbb");
		}
		return a / b;

	}

}
