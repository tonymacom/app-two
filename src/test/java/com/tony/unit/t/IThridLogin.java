package com.tony.unit.t;

import com.tony.unit.base.ResponseData;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2018/11/23
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public interface IThridLogin<E extends BaseReq,V extends BaseResp> {

    public ResponseData authorize(E e);


    public V authorize2(E e);


}
