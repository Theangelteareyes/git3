package com.itwjl.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: day01_eeasy_01springMvc
 * @description:
 * @author: Mr.Wang
 * @create: 2019-10-07 13:24
 **/
public class StringToDateConverter implements Converter<String, Date> {
    /**
     * 传进来的字符串
     * @param s
     * @return
     */
    @Override
    public Date convert(String s) {
        //判断
        if(s==null){
            throw new RuntimeException("请输入数据！");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //把字符串转换日期
        try {
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("数据转换出现错误！");
        }
    }
}
