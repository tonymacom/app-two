package com.tony.unit.cleancode.argument;

import java.util.Iterator;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/1/30
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class BooleanArgumentMarshaler implements ArgumentsMarshaler {

    private boolean booleanValue = false;

    @Override
    public void set(Iterator<String> currentArguments) throws ArgsException {
        booleanValue = true;
    }

    public static boolean getValue(ArgumentsMarshaler am){
        if(am!=null && am instanceof BooleanArgumentMarshaler){
            return ((BooleanArgumentMarshaler) am).booleanValue;
        }else{
            return false;
        }
    }
}
