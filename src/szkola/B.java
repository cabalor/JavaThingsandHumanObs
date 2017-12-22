package szkola;

public class B {

	private int x, y;
	
	public B(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	public B(){
		this(2,2);
	}

	void show() {
	 System.out.println(this);
	}
	
	static void showStat(B obj) {
		 System.out.println(obj);
		}
	

	public String toString() {
		return "x "+x+" y " + y;
	}
	
	
}
