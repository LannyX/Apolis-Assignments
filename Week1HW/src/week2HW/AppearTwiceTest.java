/**
 * 
 */
package week2HW;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Lanny
 *
 */
public class AppearTwiceTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ArrayList<Integer> expected = new ArrayList<>(1);
		expected.add(1);
		assertEquals(expected, AppearTwice.appearTwice(new int[]{1, 2, 1, 3, 2, 2, 3, 3, 3, 4, 5, 6}));
	}

}
