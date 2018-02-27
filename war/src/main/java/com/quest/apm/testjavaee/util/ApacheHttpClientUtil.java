package com.quest.apm.testjavaee.util;

import org.apache.commons.httpclient.ConnectMethod;
import org.apache.commons.httpclient.HttpConnection;
import org.apache.commons.httpclient.HttpState;
import java.io.IOException;

/**
 * Created by rxiao on 2/27/2018.
 */
public class ApacheHttpClientUtil {


    public static int excuteGetHttp2() {
        ConnectMethod connectMethod = new ConnectMethod();
        HttpState httpState = new HttpState();
        HttpConnection httpConnection = new HttpConnection("140.211.11.105", 80);
        int result = 0;
        try {
            httpConnection.open();
            result = connectMethod.execute(httpState, httpConnection);
        } catch (IOException e) {
            e.printStackTrace();
        }
        httpConnection.close();
        return result;
    }

    public static void main(String[] args) throws IOException {
        /*final String url = "http://apache.org/";
        String result = excuteGetHttp(url);
        System.out.println(result);*/
        excuteGetHttp2();
    }
}
