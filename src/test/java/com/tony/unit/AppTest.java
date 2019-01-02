package com.tony.unit;

import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
/**
 * Unit test for simple App.
 */
public class AppTest {

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

    @Test
    public void testSnowFlake(){
        SnowFlake snowFlake = new SnowFlake(1, 1);
        System.out.println(snowFlake.nextId());
        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void testAbs(){
        System.out.println(Math.abs(-333));
    }

}
