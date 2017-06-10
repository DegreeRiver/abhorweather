package com.dujiang.abhorweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名：  OwnProject
 * 包名：    com.dujiang.abhorweather.gson
 * 创建者：  Dujiang0311
 * 创建时间：2017/6/10 20:27
 * 描述：    TODO
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")

    public More more;
    public class More{
        @SerializedName("txt")
        public String info;

    }
}
