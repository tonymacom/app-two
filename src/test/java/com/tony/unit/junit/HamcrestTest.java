package com.tony.unit.junit;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import lombok.Data;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/2
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class HamcrestTest {

    private List<String> values;

    @Before
    public void before(){
        values = ImmutableList.of(
                "One",
                "Two",
                "Three"
        );
    }

    @Test
    public void testWithHamcrest(){
        assertThat(values, Matchers.hasItem(Matchers.anyOf(Matchers.equalTo("One"),Matchers.equalTo("Two"))));
    }

    @Data
    public class Link {
        public String name;
    }


    @Test
    public void testAll(){

        //equalTo: 判断2个对象是否相等,使用Object.equals方法.
        assertThat("abc",Matchers.equalTo("abc"));

        //hasToString: 判断一个对象的toString方法.
        assertThat("abc",Matchers.hasToString("abc"));

        //instanceOf: 判断对象
        assertThat("abc",Matchers.instanceOf(String.class));

        // nullValue, notNullValue
        assertThat(null,Matchers.nullValue());
        assertThat("abc",Matchers.notNullValue());

        //sameInstance: 判断两个对象是否是同一个对象, 使用==比较
        assertThat("abc",Matchers.sameInstance("abc"));

        Link link = new Link();
        //是否存在属性, 必须存在getName方法才能检测到.
        assertThat(link, Matchers.hasProperty("name"));
    }

    @Test
    public void testCollection(){

        String[] strs = {"1","2","3"};
        List<String> strList = Arrays.asList(strs);

        //检测是包含1,2,3的一个数组
        assertThat(strs,Matchers.array(Matchers.equalTo("1"),Matchers.equalTo("2"),Matchers.equalTo("3")));

        //array匹配其中一个
        assertThat(strs,Matchers.hasItemInArray("1"));

        Map<String,Integer> map = ImmutableMap.<String,Integer>builder().put("key1",1).put("key2",2).build();
        //检测map中的entry
        assertThat(map,Matchers.hasEntry("key1",1));
        //检测存在的key
        assertThat(map,Matchers.hasKey("key1"));
        //检测存在的value
        assertThat(map,Matchers.hasValue(2));

        //精确匹配存在一个元素"1"
        assertThat(strList,Matchers.hasItem("1"));
        //同时存在两个元素1,2
        assertThat(strList,Matchers.hasItems("1","2"));
        //list 匹配只要存在其中一个则返回true
        assertThat(strList,Matchers.hasItems(Matchers.anyOf(Matchers.equalTo("1"),Matchers.equalTo("4"))));

        //检测某个元素是否存在在某个list中
        assertThat("1",Matchers.isIn(strList));

    }

    /**
     * 数字测试
     */
    @Test
    public void testDigital(){

        // 测试浮点数接近给定的值, 1.5在 1.0±0.6的范围内存在.
        assertThat(1.5,Matchers.closeTo(2.0,0.5));
        // 大小比较
        assertThat(1.0,Matchers.greaterThan(0.9));
        assertThat(1.0,Matchers.lessThan(1.1));
        assertThat(1.0,Matchers.greaterThanOrEqualTo(1.0));
        assertThat(1.0,Matchers.lessThanOrEqualTo(1.0));

    }

    @Test
    public void testStr(){

        //大小写忽略比较
        assertThat("LinkinPark",Matchers.equalToIgnoringCase("linkinpark"));
        //空白忽略比较
        assertThat("  LinkinPark",Matchers.equalToIgnoringWhiteSpace("LinkinPark"));
        //包含断言
        assertThat("LinkPark",Matchers.containsString("inkP"));
        assertThat("LinkinPark",Matchers.startsWith("Link"));
        assertThat("LinkinPark",Matchers.endsWith("Park"));

        //allOf中所有条件必须全部匹配
        assertThat("LinkinPark",Matchers.allOf(Matchers.endsWith("Park"),Matchers.startsWith("Lin")));
        //anyOf中满足一个条件即可
        assertThat("LinkinPark",Matchers.anyOf(Matchers.endsWith("asdfa"), Matchers.notNullValue()));
        //not匹配
        assertThat("LinkinPark", Matchers.not(Matchers.endsWith("Pasfdrk")));
        //is 确认比较
        assertThat("1",Matchers.is("1"));

        assertThat("LinkinPark", Matchers.is(Matchers.endsWith("Park")));
    }



}
