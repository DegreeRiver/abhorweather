package com.dujiang.abhorweather.gson;

/**
 * 项目名：  OwnProject
 * 包名：    com.dujiang.abhorweather.gson
 * 创建者：  Dujiang0311
 * 创建时间：2017/6/10 20:24
 * 描述：    TODO
 */

public class AQI {
    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
