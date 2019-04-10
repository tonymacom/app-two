package com.tony.unit.junit;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/2
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
@Data
@AllArgsConstructor
public class Account {

    private String accountId;
    private long balance;

    public void debit(long amount){
        this.balance -= amount;
    }

    public void credit(long amount){
        this.balance += amount;
    }


}
