package com.tony.unit.junit;

import lombok.Data;
import lombok.Setter;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/2
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class AccountService {

    @Setter
    private AccountManager accountManager;

    /**
     * 转账
     * @param senderId
     * @param recivedId
     * @param amount
     */
    public void transfer(String senderId, String recivedId, long amount, boolean test) {
        Account sender = this.accountManager.findAccountForUser(senderId);
        Account reciveder = this.accountManager.findAccountForUser(recivedId);
        sender.debit(amount);
        reciveder.credit(amount);
        if(test){
            System.out.println(121);
            int i = 0;
            i += 1;
        }

        accountManager.updateAccount(sender);
        accountManager.updateAccount(reciveder);
    }
}
