package telefonyIDrzewa;

public class Rakieta {

	String nazwa;
	int wagaPaliwa;

	Rakieta(String nazwa, int waga) {
		this.nazwa = nazwa;
		wagaPaliwa = waga;
	}

	@Override
	public String toString() {
		return "Rakieta [nazwa=" + nazwa + ", wagaPaliwa=" + wagaPaliwa + "]";
	}

	void zatankuj() {
		this.wagaPaliwa = (int) (Math.random()*100);
		
	}
	
	public void start() throws Exception {
		if(wagaPaliwa < 50) {
			throw new ZaMaloPaliwaException();
		} else {
			System.out.println("rakieta moze startowac");
		}
	}
	
}
