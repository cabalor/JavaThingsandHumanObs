package szkola3;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("----------zadanie 1---------------");
		
		String s1 = "1984-3-22";
		
		
		Pattern p1 = Pattern.compile("[0-9]+[/-][0-9]+[/-][0-9]+");
		Matcher m1 = p1.matcher(s1);
		boolean v = m1.matches();
		System.out.println(v);
		
		System.out.println("----------zadanie 2---------------");
		
		String str;
		Scanner scn = new Scanner(System.in);
		System.out.println("wpisz adres email");
		str = scn.nextLine();
		Pattern p2 = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
		Matcher m2 = p2.matcher(s1);
		boolean vv = m1.matches();
		System.out.println(vv);
		
		System.out.println("----------zadanie 3---------------");
		
		
		FileInputStream fio = null;

		try {
			fio = new FileInputStream("serverLog.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringBuilder sb2 = new StringBuilder();
		String adresyIp = "";
		int licznik = 0;
		List<String> lista = new ArrayList<>();
		Pattern ip = Pattern.compile("[(](([0-9]{1,3}).([0-9]{1,3}).([0-9]{1,3}).([0-9]{1,3}))");
		
		try {
			BufferedReader read = new BufferedReader(new InputStreamReader(fio, "UTF-8"));
			while ((adresyIp = read.readLine()) != null) {

				Matcher matcher1 = ip.matcher(adresyIp);
				if (matcher1.find()) {
					Integer i = Integer.valueOf(matcher1.group(2));
					Integer i2 = Integer.valueOf(matcher1.group(3));
					Integer i3 = Integer.valueOf(matcher1.group(4));
					Integer i4 = Integer.valueOf(matcher1.group(5));
					lista.add(licznik+" "+i.toHexString(i)+":"+i2.toHexString(i2)+":"+i3.toHexString(i3)+":"+i4.toHexString(i4));
				}
				licznik ++;
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		lista.forEach(System.out::println);
		
		
		/*List<Integer> ls = new ArrayList<>();
		
		List<String> l2 = new ArrayList<>();
		
		for(String s: lista) {
			ls.add(Integer.parseInt(s));
		}
		for(Integer i: ls) {
			l2.add(Integer.toHexString(i));
		}
		l2.forEach(System.out::println);
		
		
		l2.stream().map(String -> str.concat(str+":"));
		l2.forEach(System.out::println);
		
		List<String> hexy = new ArrayList<>();
		for(String s: l2) {
			hexy.add()
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*lista.forEach(System.out::println);
		lista.stream().map(String -> String.split(".")).collect(Collectors.toList());
		lista.forEach(System.out::println);*/
		

	}

}
