package com.neil.gradledemo.weather.srevice.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neil.gradledemo.weather.srevice.IWeatherDataService;
import com.neil.gradledemo.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


/**
 * @author zhangxiang
 * @since java 1.8
 */
@Service
public class WeatherDataServiceImpl implements IWeatherDataService {

    private RestTemplate restTemplate;
    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final String WEATHER_API = "http://t.weather.sojson.com/api/weather";

    /**
     * 根据cityId查询天气
     *
     * @param cityId return
     */
    @Override
    public WeatherResponse getDataByCityId(String cityId) {

        String uri = WEATHER_API + "/city/" + cityId;
        return this.doGetWeatherData(uri);
    }

    /**
     * 根据cityId查询天气
     *
     * @param cityName return
     */
    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_API + "?city=" + cityName;
        return this.doGetWeatherData(uri);
    }

    private WeatherResponse doGetWeatherData(String uri) {
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        String strBody = null;
        if (response.getStatusCodeValue() == 200) {
            strBody = response.getBody();
        }
        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weather = null;
        try {
            weather = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weather;
    }

}
