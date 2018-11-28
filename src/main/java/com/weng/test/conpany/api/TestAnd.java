package com.weng.test.conpany.api;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 按位与运算
 */
public class TestAnd {
    @Test
    public void fun1() {
        System.out.println(1&1);
    }

    @Test
    public void fun2() {
        System.out.println(12&2);
        //1100 0010
        //0010

        System.out.println(12&6);

        //0011
        //0010
        //0010
        System.out.println(3&2);
        //
        System.out.println(2&2);


        //0000 1000
        //0000 1010
        //  0000 1000
    }

    @Test
    public void fun3() {
        System.out.println(2);
    }

    @Test
    public void fun4() {
        List<String> list = new ArrayList<>();
        String str = new String();
        list.add(str);
        str = "xx";
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void fun5() {
        Student student = new Student();
        List<String> list = new ArrayList<>();
        student.setList(list);

        list.add("aa");
        list.add("bb");
        list.add("cc");

        for (String s : student.getList()) {
            System.out.println(s);
        }
    }

    @Test
    public void fun6() {
        System.out.println("fun666");
    }

}
