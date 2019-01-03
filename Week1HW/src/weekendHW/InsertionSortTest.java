/**
 * 
 */
package weekendHW;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 * @author Lanny
 *
 */
public class InsertionSortTest {

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
		int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = InsertionSort.insertionSort(arr1);
        assertArrayEquals(arr1, arr2);    
	
	}
		
	
}
