package com.weng.test.conpany.api;

import com.a121tongbu.common.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateUtil {
    public static void main(String[] args) {
//        String date=DateUtil.conversionDate000000(new Date()).toString();
//        System.out.println(date);
//        System.out.println(DateUtil.conversionDate235959(new Date()));


        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate=sdf.format(DateUtil.conversionDate000000(new Date()));
        System.out.println(formatDate);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        System.out.println(sdf.format(new Date()));
    }
}
