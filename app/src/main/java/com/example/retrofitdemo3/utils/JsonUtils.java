package com.example.retrofitdemo3.utils;

import com.example.retrofitdemo3.bean.WeatherBean;
import com.google.gson.Gson;

public class JsonUtils {

    public static WeatherBean.WeatherinfoBean getWeather(String str) {
        Gson gson = new Gson();
        WeatherBean.WeatherinfoBean weatherinfoBean = gson.fromJson(str, WeatherBean.WeatherinfoBean.class);
        return weatherinfoBean;
    }
}
