package szkola2_3;

public class Square implements Comparable<Square>, Figure{

	
	int length, number;
	static int counter = 0;
	
	public Square(int len) throws ToBigCosTam {
		if(len> max) {
			throw new ToBigCosTam();
		} else {
		this.length = len;
		number = counter++;
		}
		
	}
	
	public int getArea(){
		
		return this.length * this.length;
	}
	
	
	public String toString() {
		return "("+ this.number+")"+getArea();
	}

	@Override
	public int compareTo(Square o) {
		int area = o.getArea();
		return this.getArea() - area;
	}


	@Override
	public int getPermietr() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
