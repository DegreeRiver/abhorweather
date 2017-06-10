package com.dujiang.abhorweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名：  OwnProject
 * 包名：    com.dujiang.abhorweather.gson
 * 创建者：  Dujiang0311
 * 创建时间：2017/6/10 20:31
 * 描述：    TODO
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
