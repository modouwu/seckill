package com.fndsoft;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feibabm on 2017/9/12 0012.
 */
public class RemoteInvote {

    @Test
    public void test1() {
        List<Long> list = new ArrayList();
        for(long i = 1; i <= 10000; i++){
            list.add(i);
        }
        list.stream().forEach(o -> {
            String url = "http://localhost:8080/seckill/product/1000";
            String s1=HttpRequest.sendGet(url, "userId="+o);
            System.out.println(s1);
        });
    }

}
