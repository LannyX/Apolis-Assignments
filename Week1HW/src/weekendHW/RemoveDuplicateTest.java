/**
 * 
 */
package weekendHW;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		assertEquals("Total unique number is: 4", RemoveDuplicate.removeDupicate(new int[] {1, 2, 3, 3, 4, 4}));
	}

}
