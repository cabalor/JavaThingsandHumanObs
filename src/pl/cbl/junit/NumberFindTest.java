package pl.cbl.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberFindTest {

	@Test
	public void test() {
		NumberFind nf = new NumberFind();
		int[] tab= {1,3,-1,2};
		int res = nf.find(tab);
		assertSame(4, res);
		
	}
}
