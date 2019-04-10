package com.tony.unit.cleancode.argument;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/1/30
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class StringArgumentsMarshaler implements ArgumentsMarshaler {
    private String stringValue  = "";

    @Override
    public void set(Iterator<String> currentArguments) throws ArgsException {

        try {
            stringValue = currentArguments.next();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new ArgsException();
        }

    }

    public static String getValue(ArgumentsMarshaler am){
        if (am != null && am instanceof StringArgumentsMarshaler) {
            return ((StringArgumentsMarshaler) am).stringValue;
        }else{
            return "";
        }
    }

}
