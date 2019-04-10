package com.tony.unit.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/1
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class CalculatorTest {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int total = calculator.add(10, 20);
        Assert.assertEquals("add",30,30);

    }

    @Test(expected = RuntimeException.class)
    public void testException(){
        Calculator calculator = null;
        calculator.add(22,33);
    }

    /**
     * 测试TimeOut属性
     */
    @Test(timeout = 500)
    public void testTimeOut(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}