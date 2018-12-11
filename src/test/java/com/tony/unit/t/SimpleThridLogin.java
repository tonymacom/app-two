package com.tony.unit.t;

import com.tony.unit.base.ResponseData;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2018/11/23
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class SimpleThridLogin implements IThridLogin<SimpleReq,SimpleResponse> {
    @Override
    public ResponseData authorize(SimpleReq baseReq) {
        return null;
    }

    @Override
    public SimpleResponse authorize2(SimpleReq baseReq) {


        return null;
    }

}
