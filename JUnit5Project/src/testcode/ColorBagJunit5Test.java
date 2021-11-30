package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.ColorBag;

class ColorBagJunit5Test {
	
	private ColorBag colorBag;

	@BeforeEach
	void setUp() throws Exception {
		colorBag=new ColorBag();
		colorBag.add("red");
		colorBag.add("green");
		colorBag.add("blue");
		colorBag.add("brown");
		colorBag.add("magenta");

		
	}

	@Test
	@DisplayName("Added color should be in Bag")
	void testAdd() {
var newColor="pink";
colorBag.add(newColor);
	assertTrue(colorBag.contains(newColor),"failure");
	
	
	}

	@Test
	
	@DisplayName("removed color should not be in Bag")

	void testRemove() {
		var color="green";
		colorBag.remove(color);
	assertFalse(colorBag.contains(color),"Failure");
	}

	@Test
	@DisplayName(" color bag set should be transformed into List in Bag")

	void testToList() {

	var myList=Arrays.asList("blue","brown","green","magenta","red");
	var colorList=colorBag.toList();
	
	Collections.sort(myList);
	Collections.sort(colorList);
assertEquals(colorList, myList,"failure");
	}


	@Test
	void testSize() {
int bsize=colorBag.size();
assertEquals(5, bsize,"failure");}

}