package com.tony.unit;

import com.tony.unit.mark.Father;
import com.tony.unit.mark.Point;
import com.tony.unit.mark.Son;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * -------------------------------------
 * ? 只能用来填充通配符T, 不能用于定义变量
 * 如果你想从一个数据类型里获取数据，使用 ? extends 通配符（能取不能存）
 * 如果你想把对象写入一个数据结构里，使用 ? super 通配符（能存不能取）
 * 如果你既想存，又想取，那就别用通配符。
 *
 *
 * -------------------------------------
 */
public class JavaTest {


    /**
     * ----------------
     * 构造泛型实例时，如果省略了填充类型，则默认填充为无边界通配符(?)
     * ----------------
     */
    public void test(){

        Point point = new Point(3,3);
        point = new Point<String>("","");

    }

    /**
     * --------------
     * ? 只能用来填充通配符T, 不能用于定义变量
     * ---------------
     */
    @Test
    public void testJava() {

        Point<?> point;

        point = new Point<Integer>(3,3);
        point = new Point<Float>(4.3f,4.3f);
        point = new Point<Double>(4.3d,4.90d);
        point = new Point<Long>(12l,23l);
        point = new Point<String>("","");


    }

    /**
     * --------------
     * ? extends 约束泛型.
     * 利用<? extends Number>定义的变量，只可取其中的值，不可修改
     * ? 用来填充Point<T> 中的T
     * ---------------
     */
    public void testExtends(){
        Point<? extends Number> point;

        point = new Point<Integer>(3,3);
        point = new Point<Float>(4.3f,4.3f);
        point = new Point<Double>(4.3d,4.90d);
        point = new Point<Long>(12l,23l);

//        报错, 约束泛型
//        point = new Point<String>("","");
//        报错, 不能存.
//        point.setPoint(Integer.valueOf(1));


    }


    /**
     * --------------
     *? super 约束泛型.
     * 利用<? extends Father>通配符实例内容：能存不能取.
     * ? 用来填充List<E>中的泛型E.
     * ---------------
     */
    @Test
    public void testSuper(){
        List< ? super Father> list = new ArrayList<>();

        list.add(new Son());
        list.add(new Father());

//        报错, 约束泛型
//        list.add(new String());
//        报错, 不能取
//        Father father = list.get(0);
//        Son son = list.get(0);

//        error
//        Father father = (Father)list.get(0);
//        Father father2 = (Father)list.get(1);
//        Son son1 = (Son) list.get(0);
//        Son son2 = (Son) list.get(1);

//        error
//        Father father3 = new Father();
//        Son son3 = (Son) father3;



    }

}
