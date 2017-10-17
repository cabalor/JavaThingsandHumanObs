package pl.cbl.junit;

public class NumberFind {

	
	
	
	
	
	public int find(int[] xx) {
		int i;
		int num=0;
		for( i=0; i<xx.length; i++) {
			if(xx[num]==0) {
				return 0;
			}else if(xx[num]==-1) {
				return i+1;
			}
			num=xx[num];
		}
		
		
		return -1;
		
	}
}
