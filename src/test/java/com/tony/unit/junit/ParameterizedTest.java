package com.tony.unit.junit;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

/**
 * @author www.yamibuy.com
 * @desc : Parameterized测试运行器
 * @date 2019/2/1
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {

    private Integer expected;
    private Integer valueOne;
    private Integer valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> initParameters(){
        return ImmutableList.of(
                new Integer[]{2, 1, 1},
                new Integer[]{3, 2, 1},
                new Integer[]{4, 3, 1}
        );
    }

    public ParameterizedTest(Integer expected, Integer valueOne, Integer valueTwo){
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void add(){
        Calculator calculator = new Calculator();
        Integer total = calculator.add(valueOne,valueTwo);
        Assert.assertEquals(expected,total);
    }



}
