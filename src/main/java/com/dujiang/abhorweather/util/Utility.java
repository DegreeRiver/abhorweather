package com.dujiang.abhorweather.util;

import android.text.TextUtils;

import com.dujiang.abhorweather.db.City;
import com.dujiang.abhorweather.db.County;
import com.dujiang.abhorweather.db.Province;
import com.dujiang.abhorweather.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 项目名：  OwnProject
 * 包名：    com.dujiang.abhorweather.util
 * 创建者：  Dujiang0311
 * 创建时间：2017/6/6 21:31
 * 描述：    处理JSON格式
 */

public class Utility {


    /**
     * 将返回的JSON数据解析成Weather实体类
     */
    public static Weather handleWeatherResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent, Weather.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //解析和处理服务器返回的省级数据
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allProVinces = new JSONArray(response);
                for (int i = 0; i < allProVinces.length(); i++) {
                    JSONObject provinceObject = allProVinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    //解析和处理服务器返回的市级数据
    public static boolean handleCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject provinceObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(provinceObject.getString("name"));
                    city.setCityCode(provinceObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    //解析和处理服务器返回的县级数据
    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject CountyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(CountyObject.getString("name"));
                    county.setWeatherId(CountyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
