package com.tony.unit.junit;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/3
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class MockIAccountConfiguration implements IAccountConfiguration {
    String sql;

    @Override
    public String getSQL(String key) {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
