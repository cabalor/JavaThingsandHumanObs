package zadaniaNowe;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

	public static void main(String[] args) {

		System.out.println("==========1===========");
		String s1 = "aaaabbcch";
		String s2 = "bbaaaacch";
		String s3 = "ccaaacch";
		String s4 = "bbaaaaabbh";
		String s5 = "abch";

		Pattern p1 = Pattern.compile("aaaabbcch|bbaaaacch|ccaaacch|bbaaaaabbh|abch");
		Matcher m1 = p1.matcher(s1);
		boolean zgoda = m1.matches();
		System.out.println(zgoda);
		System.out.println("========2==========");

		String str = "wieś w Polsce położona w województwie wielkopolskim, w powiecie\n"
				+ "kolskim, w gminie Olszówka. W latach 1975-1998 miejscowość położona była w wo-\n"
				+ "jewództwie konińskim";

		Pattern partLiczb = Pattern.compile("[0-9]{2}"); // ("\\d{4}-\\d{4}"), (^[0-9]{2})+ , \\d{2}
		Matcher m2 = partLiczb.matcher(str);
		int count = 0;

		while (m2.find()) {
			count++;
			System.out.println(m2.group());
		}
		;
		System.out.println("Pary liczb " + count);

		System.out.println("========3==========");

		File file = new File("text.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		Path path = Paths.get("src/txt.txt");

		try {
			if (!Files.exists(path)) {
				Files.createFile(path);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		InputStream in = null;

		try {
			in = new FileInputStream("text.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String text = "";
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader read = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			while ((text = read.readLine()) != null) {
				// text = read.readLine();
				sb.append(text);

			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(sb.toString());

		Pattern p3 = Pattern.compile("\\w+"); // [^\s]+
		Matcher m4 = p3.matcher(sb.toString());
		int ile = 0;
		while (m4.find()) {
			ile++;
		}
		System.out.println("wyrazy " + ile);

		System.out.println("========4==========");

		String[][] tab = new String[100][3];
		FileInputStream fio = null;

		try {
			fio = new FileInputStream("log.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Pattern data = Pattern.compile("[0-9]+[//][0-9]+[//][0-9]+");
		Pattern ip = Pattern.compile("[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}");
		Pattern msg = Pattern.compile("[>].+");

		StringBuilder sb2 = new StringBuilder();
		String log = "";
		int cont = 0;
		try {
			BufferedReader read = new BufferedReader(new InputStreamReader(fio, "UTF-8"));
			while ((log = read.readLine()) != null) {

				Matcher ma1 = data.matcher(log);
				if (m1.find()) {
					tab[cont][0] = ma1.group();
					System.out.println(ma1.group());
				}

				Matcher ma2 = ip.matcher(log);
				if (m2.find()) {
					tab[cont][1] = ma2.group();
					System.out.println(ma2.group());
				}

				Matcher ma3 = msg.matcher(log);
				if (ma3.find()) {
					tab[cont][2] = ma3.group();
					System.out.println(ma3.group());
				}

				cont++;

			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(sb2.toString());

		System.out.println("========6==========");

		Pattern godzina = Pattern.compile("[0-9]+[:][0-9]+[:][0-9]+");
		Pattern user = Pattern.compile("(AM|PM) - [a-z]+");

		FileInputStream fio2 = null;

		try {
			fio = new FileInputStream("log.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		StringBuilder sb3 = new StringBuilder();
		String log2 = "";
		int ctr = 0;

		List<Wiadomosc> msgs = new ArrayList<>();
		try {
			BufferedReader read = new BufferedReader(new InputStreamReader(fio2, "UTF-8"));
			while ((log2 = read.readLine()) != null) {

				Matcher date = data.matcher(log2);
				Matcher godz = godzina.matcher(log2);
				Matcher us = user.matcher(log2);
				Matcher ms = msg.matcher(log2);
				Matcher ipp = ip.matcher(log2);

				int dzien = 0;
				int miesiac = 0;
				int rok = 0;

				if (m1.find()) {
					String s = date.group();
					miesiac = Integer.parseInt(s.split("/")[0]);
					dzien = Integer.parseInt(s.split("/")[1]);
					rok = Integer.parseInt(s.split("/")[2]);
				}

				String go = "";

				if (m2.find()) {
					String g = godz.group();

					go = g.split(":")[0];

				}

				String u = "";
				if (us.find()) {
					u = us.group();

				}

				String txt = "";
				if (ms.find()) {
					txt = m4.group();

				}

				String i = "";
				if (ipp.find()) {
					i = ipp.group();
				}

				Wiadomosc wd = new Wiadomosc(dzien, miesiac, rok, go, u, i, txt);
				System.out.println(wd);
				msgs.add(wd);
			}

			dzien(23, msgs);

			ctr++;

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void dzien(int dzien, List<Wiadomosc> wiado) {

		for (Wiadomosc w : wiado) {
			if (w.getDzien() == dzien) {
				
				System.out.println("dzien znalezony " + w);
			}
			
		}
	}

	public static void miesiac(int miesiac, List<Wiadomosc> wiado) {

		for (Wiadomosc w : wiado) {
			if (w.getMiesiac() == miesiac) {
				
				System.out.println("znaleziona wiadomosc " + w);
			}
		}
	}

	public static void ip(String ip, List<Wiadomosc> wiado) {

		for (Wiadomosc w : wiado) {
			if (w.getIp().equals(ip)) {

				System.out.println("znalezione ip " + w);
			}
		}
	}

}
