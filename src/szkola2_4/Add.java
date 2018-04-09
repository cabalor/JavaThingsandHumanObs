package szkola2_4;

public interface Add {
	
	default String add(String a, String b) {
		
		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
	}

}
