package com.tony.unit.eventbus;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2018/11/29
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class TestEventBus {


    @Test
    public void testReceiveEvent() throws Exception {

        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();
        EventListener2 listener2 = new EventListener2();
        eventBus.register(listener);
        eventBus.register(listener2);

        eventBus.post(new TestEvent(200));

    }


}
