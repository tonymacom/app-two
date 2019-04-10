package com.tony.unit.cleancode.argument;

import java.util.Iterator;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/1/30
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public interface ArgumentsMarshaler {

    void set(Iterator<String> currentArguments) throws ArgsException;

}
