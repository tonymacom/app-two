package com.tony.unit.junit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/3
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class DefaultAccountManagerTest {

    @Test
    public void findAccountForUser() {

        Log log = LogFactory.getLog(DefaultAccountManager.class);
        MockIAccountConfiguration mockIAccountConfiguration = new MockIAccountConfiguration();

        DefaultAccountManager accountManager = new DefaultAccountManager(log, mockIAccountConfiguration);
        accountManager.findAccountForUser("111");


    }
}