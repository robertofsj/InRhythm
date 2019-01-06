package com.inrhythm.exercise.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.inrhythm.exercise.App;


public class AppTest {

	//TEXT TO BE USED IN OUR TESTS. CHANGE IT AS NEEDED FOR MORE COMPLEX TEST CASES.
	//DON'T FORGET TO CHANGE THE ASSERT EXPRESSION TO REFLECT THE NEW TEST.
	private static final String TESTED_TEXT = "The cow jumped over the moon.";
	

	@Test
    public void lenghtWordTest() {
		
		Object[] result = App.getLongestWord(TESTED_TEXT);
        
		assertEquals(6, result[0]);
    }

	@Test
    public void longestWordTest() {
		
		Object[] result = App.getLongestWord(TESTED_TEXT);
        
		assertEquals("jumped", result[1]);
    }

}
