package pl.cbl.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringsTest {

	@Test
	public void testSplitSpace() {
		Strings strings = new Strings();
		String[] result = strings.splitSpace("dupa dupa");
		String[] end = {"dupa", "dupa"};
		assertArrayEquals(end, result);
	}

}
