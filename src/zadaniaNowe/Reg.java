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
		
		
		String str = "wieś w Polsce położona w województwie wielkopolskim, w powiecie\n" + 
				"kolskim, w gminie Olszówka. W latach 1975-1998 miejscowość położona była w wo-\n" + 
				"jewództwie konińskim";
		
		Pattern partLiczb = Pattern.compile("[0-9]{2}"); //("\\d{4}-\\d{4}"),   (^[0-9]{2})+ ,   \\d{2}
		Matcher m2 = partLiczb.matcher(str);
		int count = 0;
		
		while(m2.find()) {
			count++;
			System.out.println(m2.group());
		};
		System.out.println("Pary liczb "+count);
		
		System.out.println("========3==========");
		
		File file = new File("text.txt");
		try {
			if(!file.exists()) {
			file.createNewFile();
			}
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Path path = Paths.get("src/txt.txt");
		
		try {
			if(!Files.exists(path)){
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = "";
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader read = new BufferedReader( new InputStreamReader(in, "UTF-8"));
			while((text = read.readLine())!=null) {
				//text = read.readLine();
				sb.append(text);
				
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
		
		Pattern p3 = Pattern.compile("\\w+"); //[^\s]+
		Matcher m4 = p3.matcher(sb.toString());
		int ile=0;
		while(m4.find()) {
			ile++;
		}
		System.out.println("wyrazy "+ ile);
		
		
		System.out.println("========4==========");
		
	}
	
	
	
}
