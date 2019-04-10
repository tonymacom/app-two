package com.tony.unit.junit;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2019/2/3
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class WebClient {

    public String getContent(URL url) {
        StringBuffer content = new StringBuffer();
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            InputStream is = connection.getInputStream();

            int count;
            while (-1!=(count= is.read())){
                content.append(new String(Character.toChars(count)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

}
