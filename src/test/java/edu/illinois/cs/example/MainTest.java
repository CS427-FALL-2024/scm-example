package edu.illinois.cs.example;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.illinois.cs.example.Main;

/**
 * Unit test for simple Main.
 */
public class MainTest {

    /**
     * Rigourous Test :-)
     */
	@Test
    public void test1()
    {
        assertEquals(3, Main.sum(1, 2));
    }
}
