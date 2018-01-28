package zadaniaNowe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

	public static void main(String[] args) {
		
		String s1 = "aaaabbcch";
		String s2 = "bbaaaacch";
		String s3 = "ccaaacch";
		String s4 = "bbaaaaabbh";
		String s5 = "abch";
		
		Pattern p1 = Pattern.compile("aaaabbcch|bbaaaacch|ccaaacch|bbaaaaabbh|abch");
		Matcher m1 = p1.matcher(s1);
		boolean zgoda = m1.matches();
		System.out.println(zgoda);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
