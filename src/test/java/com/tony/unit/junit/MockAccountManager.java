package com.tony.unit.junit;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/3
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class MockAccountManager implements AccountManager{

    Map<String,Account> accounts = ImmutableMap.<String,Account>builder()
            .put("1",new Account("1",200))
            .put("2",new Account("2",100))
            .build();

    @Override
    public Account findAccountForUser(String userId) {

        return accounts.get(userId);
    }

    @Override
    public void updateAccount(Account account) {
        //do something
    }
}