package col;

public class Siedzenie {

	private String number;
	private boolean rezerwa = false;
	
	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public boolean isRezerwacja() {
		return rezerwa;
	}


	public void setRezerwacja(boolean rezerwacja) {
		this.rezerwa = rezerwacja;
	}
	
	public Siedzenie(String numer) {
		//this.setNumber(numer);
		number = numer;
	}

	public boolean rezerwacja() {
		if(!this.rezerwa) {
			this.rezerwa = true;
			System.out.println("siedzenie " + this.number + " zrezerwowane");
			return true;
		}else {
			return false;
		}
	}
	
	public boolean rezygnuj() {
		if(this.rezerwa) {
			this.rezerwa = false;
			System.out.println("rezerwacja "+ this.number+" numeru siedzenia odwolana");
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
}
