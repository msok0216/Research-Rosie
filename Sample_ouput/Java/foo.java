/*  -*- Mode: Java//l; -*-                                                  
 
 *  foo.java
 * 
   AUTHOR: Jamie A. Jennings <foobar@mit.edu>
 *  © Copyright 2019
        Jamie A. Jennings 2222
 *  LICENSE MIT License (https://opensource.org/licenses/mit-license.html)

*/


package edu.ncsu.csc316.dsa.disjoint_set;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ncsu.csc316.dsa.Position;

public class UpTreeDisjointSetTest {

	private DisjointSet<String> set;
	
	@Before
	public void setUp() {
		set = new UpTreeDisjointSetForest<>();
	}
	
	@Test
	public void testMakeSet() {
		Position<String> one = set.makeSet("one");
		Position<String> two = set.makeSet("two");
		Position<String> three = set.makeSet("three");
		
		assertEquals(one,set.find("one"));
		assertEquals(two,set.find("two"));
		assertEquals(three,set.find("three"));
		
		set.union(one, two);
		Position<String> root1 = set.find("one");
		Position<String> root2 = set.find("one");
		assertEquals(root1, root2);
		
		
	}

}
