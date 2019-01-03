/**
 * 
 */
package week2HW;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Lanny
 *
 */
public class FindSmallestBiggestTest {

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
		int[] arr = new int[] {-3, 2, 8, 3, 99, -64, 888};
		assertEquals(-64, FindSmallestBiggest.findSmallest(arr));
		assertEquals(888, FindSmallestBiggest.findBiggest(arr));

	}

}
