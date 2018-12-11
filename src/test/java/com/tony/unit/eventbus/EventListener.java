package com.tony.unit.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2018/11/29
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class EventListener {

    public int lastMessage = 0;

    @Subscribe
    public void listen(TestEvent event) {
        lastMessage = event.getMessage();
        System.out.println("Message:"+lastMessage);
    }

    public int getLastMessage() {
        return lastMessage;
    }


}
