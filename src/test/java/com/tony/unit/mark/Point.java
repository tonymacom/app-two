package com.tony.unit.mark;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2018/11/23
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class Point<T> {

    private T x;
    private T y;

    public Point(T x, T y){
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public void setPoint(T t){
        this.x = t;
    }

}
