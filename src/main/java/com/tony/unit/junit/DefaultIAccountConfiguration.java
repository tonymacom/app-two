package com.tony.unit.junit;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/3
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class DefaultIAccountConfiguration implements IAccountConfiguration {

    private ResourceBundle bundle;

    public DefaultIAccountConfiguration(String technical) {
        bundle = PropertyResourceBundle.getBundle(technical);
    }

    @Override
    public String getSQL(String key) {
        return bundle.getString(key);
    }
}
