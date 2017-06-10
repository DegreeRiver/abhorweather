package com.dujiang.abhorweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名：  OwnProject
 * 包名：    com.dujiang.abhorweather.gson
 * 创建者：  Dujiang0311
 * 创建时间：2017/6/10 20:32
 * 描述：    TODO
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

}
