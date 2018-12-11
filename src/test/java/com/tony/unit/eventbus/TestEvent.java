package com.tony.unit.eventbus;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2018/11/29
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class TestEvent {

    private final int message;
    public TestEvent(int message) {
        this.message = message;
    }
    public int getMessage() {
        return message;
    }

}
