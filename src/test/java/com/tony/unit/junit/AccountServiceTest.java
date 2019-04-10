package com.tony.unit.junit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/3
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class AccountServiceTest {

    @Test
    public void transfer() {

        MockAccountManager mockAccountManager = new MockAccountManager();

        AccountService accountService = new AccountService();
        accountService.setAccountManager(mockAccountManager);
        accountService.transfer("1","2",50,false);

        assertEquals(150,mockAccountManager.findAccountForUser("1").getBalance());
        assertEquals(150,mockAccountManager.findAccountForUser("2").getBalance());


    }
}