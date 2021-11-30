package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import businesscode.MyselectionSort;
/* 
 * Repeated tests are run with the
 *  @RepeatedTest annotation. We specify 
 * the total number of repetitions desired.
 */
class MySelectionSortJunitTest {
private final int N=10;  //declaring constant 
private int[] vals=new int[N];


	@BeforeEach
	void setUp() throws Exception {
		var r=new Random(System.nanoTime());
		for(int i=0;i<N;i++)
		{
			vals[i]=r.nextInt(100);
		}
	}

	@RepeatedTest(value=40,name="#{displayName}{currentRepeatation}/{}totalRepeatation")
	@DisplayName("Should sort values")
	void testDoSort() 
	{
System.out.println(Arrays.toString(vals));
	var sorted=MyselectionSort.doSort(vals);
			Arrays.sort(vals);
			
	System.out.println(Arrays.toString(sorted));
	assertEquals(sorted, vals);
	
	}

}