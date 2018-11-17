package com.tony.unit;

import com.google.common.base.Splitter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @org.junit.Test
    public void test(){
        System.out.println(52/2);
        System.out.println((int)(52/2));
        System.out.println(100/0.85);
        System.out.println((int)(100/0.85));
    }

    @org.junit.Test
    public void testsplit(){
        String et = "a,b,,,,,c,d,,,,,,";
        List<String> list = Arrays.asList(et.split(","));
        System.out.println(list.size());
        list.forEach(e -> System.out.println(e));

        // guava Splitter
        List<String> list2 = Splitter.on(",").splitToList(et);
        System.out.println(list2.size());
        list2.forEach(e -> System.out.println(e));


    }
}
