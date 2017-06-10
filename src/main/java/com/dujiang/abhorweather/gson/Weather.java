package com.dujiang.abhorweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 项目名：  OwnProject
 * 包名：    com.dujiang.abhorweather.gson
 * 创建者：  Dujiang0311
 * 创建时间：2017/6/10 20:32
 * 描述：    TODO
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
