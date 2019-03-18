package com.cofel.core.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期时间工具类
 */
public class Dates {

    /**
     * 日期时间匹配格式
     * 周四下午拍照
     * 周五出去写真
     */
    public interface Pattern{
        //--------------------------------
        //常规模式
        //--------------------------------
        /**
         * yyyy-MM-dd
         */
        String DATE = "yyyy-MM-dd";

        /**
         * yyyy-MM-dd HH:mm:ss
         */
        String DATETIME = "yyyy-MM-dd HH:mm:ss";

        /**
         * yyyy-MM-dd HH:mm
         */
        String DATETIME_MM = "yyyy-MM-dd HH:mm";

        /**
         * yyyy-MM-dd HH:mm:ss.SSS
         */
        String DATETIME_SSS = "yyyy-MM-dd HH:mm:ss.SSS";

        /**
         * HH:mm
         */
        String TIME = "HH:mm";

        /**
         * HH:mm:ss
         */
        String TIME_SS = "HH:mm:ss";

        //--------------------------------
        // 系统时间模式
        //--------------------------------

        /**
         * yyyyMMdd
         */
        String NONE_DATE = "yyyyMMdd";

        /**
         * yyyyMMddHHmmss
         */
        String NONE_DATETIME = "yyyyMMddHHmmss";

        /**
         * yyyyMMddHHmm
         */
        String NONE_DATEME_MM = "yyyyMMddHHmm";

        /**
         * yyyyMMddHHmmssSSS
         */
        String NONE_DATETIME__SSS = "yyyyMMddHHmmssSSS";
    }

    public static final String DEFAULT_PATTERN = Pattern.DATETIME;

    public static final String[] PARSE_PATTERN = new String[]{
            Pattern.DATE,
            Pattern.DATETIME,
            Pattern.DATETIME_MM,
            Pattern.DATETIME_SSS,
            Pattern.NONE_DATE,
            Pattern.NONE_DATETIME,
            Pattern.NONE_DATEME_MM,
            Pattern.NONE_DATETIME__SSS
    };

    /**
     * 格式化日期时间
     * @param date 日期时间
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String fromat(Date date){
        return format(date,DEFAULT_PATTERN);
    }

    /**
     * 格式化日期
     * @param date 日期
     * @param pattern 匹配模式
     * @return 格式化后的字符串
     */
    public static String format(Date date,String pattern){
        if(date == null){
            return null;
        }
        pattern = StringUtils.isNotBlank(pattern)?pattern:DEFAULT_PATTERN;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 解析日期
     * @param date 日期
     * @return 解析后的日期
     */
    public static Date parseDate(String date){
        if(StringUtils.isBlank(date)){
            return null;
        }
        try {
            DateUtils.parseDate(date,PARSE_PATTERN);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 方法重载，匹配格式格式化日期，字符串转换日期
     * @param date 日期
     * @param pattern 匹配模式
     * @return 解析后的日期
     */
    public static Date parseDate(String date,String pattern){
        if(StringUtils.isBlank(date)){
            return null;
        }
        String[] parsePatterns;
        parsePatterns = StringUtils.isNotBlank(pattern)?new String[]{pattern}:PARSE_PATTERN;
        try{
            return DateUtils.parseDate(date,pattern);
        } catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }


}
