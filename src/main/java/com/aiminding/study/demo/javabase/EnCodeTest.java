package com.aiminding.study.demo.javabase;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * 编码相关
 */
public class EnCodeTest {

    @Test
    public void test1() throws UnsupportedEncodingException {
        String msg = "中国人";
        System.out.println(new String(msg.getBytes(Charset.forName("UTF-8")), "GBK"));
        System.out.println(new String(msg.getBytes(), "GBK"));
        System.out.println(new String(msg.getBytes("GBK"), "GBK"));
        System.out.println(new String(msg.getBytes("UTF-8"), "UTF-8"));
        System.out.println(new String(msg.getBytes(), "UTF-8"));
        System.out.println(new String(msg.getBytes("UTF-8")));

        String err = "娴嬭瘯涓";
        System.out.println(new String(msg.getBytes("ISO-8859-1"), "GBK"));
    }
}
