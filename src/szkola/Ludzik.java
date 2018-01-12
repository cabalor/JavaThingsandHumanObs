package szkola;

public class Ludzik {
	
	private String nickName;
	private String adress;
	private int hp;
	
	public Ludzik(String nick, String adress, int hp) {
		setNickName(nick);
		this.setAdress(adress);
		this.setHp(hp);
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Ludzik [nickName=" + nickName + ", adress=" + adress + ", hp=" + hp + "]";
	}
	
	
}
