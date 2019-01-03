/**
 * 
 */
package weekendHW;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Lanny
 *
 */
public class BubbleSortTest {

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
		int[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		int[] arrExpect = BubbleSort.bubbleSort(arr);
		assertArrayEquals(new int[]{-9, -7, -3, -2, 0, 2, 4, 5, 6, 8}, arrExpect);
	}

}
