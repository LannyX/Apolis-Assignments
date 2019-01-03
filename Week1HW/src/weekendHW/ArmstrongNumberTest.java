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
public class ArmstrongNumberTest {

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

	/**
	 * Test method for {@link weekendHW.ArmstrongNumber#isAmstrong(int)}.
	 */
	@Test
	public void testIsAmstrong() {
		int  n = 153;
		assertEquals(true, ArmstrongNumber.isAmstrong(n));
	}

}
