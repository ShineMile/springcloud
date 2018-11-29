package com.neil.gradledemo.weather.srevice;

import com.neil.gradledemo.weather.vo.WeatherResponse;

public interface IWeatherDataService {
    /**
     * 根据cityId查询天气
     * @param cityId
     * return
     */
    WeatherResponse getDataByCityId(String cityId);
    /**
     * 根据cityName查询天气
     * @param cityName
     * return
     */
    WeatherResponse getDataByCityName(String cityName);

}
