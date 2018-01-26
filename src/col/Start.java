package col;

public class Start {

	public static void main(String[] args) {
		
		
		Dom dom1 = new Dom("ladny", 4, 4);
		dom1.printAllSiedzenia();
		
		if(dom1.zapasoweSiedzenie("B03")) {
			System.out.println("jest");
		}else {
			System.out.println("nie ma");
		}
		
		
	}
	
	
	
}
