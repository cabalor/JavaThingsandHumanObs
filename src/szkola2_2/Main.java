package szkola2_2;

public class Main {
		
	public static void main(String[] args) {

		Spiewak s1 = new Spiewak("Johnson") {

			@Override
			public String spiewaj() {
				
				return "dupa";
			}
		} ;
		Spiewak s2 = new Spiewak("Bon Jovi") {

			@Override
			public String spiewaj() {
				
				return "XXXXXXXXXX";
			}
		} ;
		Spiewak s3 = new Spiewak("Dio") {

			@Override
			public String spiewaj() {
				
				return "DDDDDD";
			}
		} ;

		Spiewak sp[] = {s1, s2, s3};

			for (Spiewak s : sp) {
				System.out.println(s);
			}
			
			System.out.println(Spiewak.najglosniej(sp));
	}
	}
