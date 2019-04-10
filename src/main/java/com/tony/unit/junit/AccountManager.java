package com.tony.unit.junit;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/2
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public interface AccountManager {

    Account findAccountForUser(String userId);

    void updateAccount(Account account);

}
