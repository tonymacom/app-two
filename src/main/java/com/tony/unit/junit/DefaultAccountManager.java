package com.tony.unit.junit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/3
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class DefaultAccountManager implements AccountManager {

    private Log log;
    private IAccountConfiguration configuration;


    public DefaultAccountManager(){
        this.log = LogFactory.getLog(DefaultAccountManager.class);
        this.configuration = new DefaultIAccountConfiguration("bundle");
    }

    public DefaultAccountManager(Log log,IAccountConfiguration configuration){
        this.log = log;
        this.configuration = configuration;

    }


    @Override
    public Account findAccountForUser(String userId) {
        log.debug("get account for user [" + userId + "]");

        ResourceBundle bundle = PropertyResourceBundle.getBundle("technical");
        String sql = bundle.getString("FIND_ACCOUNT_SQL");

        //db operation

        return null;
    }

    @Override
    public void updateAccount(Account account) {

    }
}
