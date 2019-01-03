/**
 * 
 */
package week2HW;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import weekendHW.FibonacciSeries;

/**
 * @author Lanny
 *
 */
public class RemoveDuplicateTest {

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
		assertEquals("Lanly", RemoveDuplicate.removeDup("Lannyly"));
	}

}
