package szkola2_4;

public interface Sub extends Operation{

	default String Subs(String a, String b) {
		 return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	
	
}
