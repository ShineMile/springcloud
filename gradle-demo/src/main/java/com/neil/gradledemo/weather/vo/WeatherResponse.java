/**
  * Copyright 2018 bejson.com 
  */
package com.neil.gradledemo.weather.vo;
import java.util.Date;

/**
 * Auto-generated: 2018-11-27 15:59:9
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class WeatherResponse {

    private String  time;
    private CityInfo cityInfo;
    private String date;
    private String message;
    private int status;
    private Data data;
    public void setTime(String  time) {
         this.time = time;
     }
     public String  getTime() {
         return time;
     }

    public void setCityInfo(CityInfo cityInfo) {
         this.cityInfo = cityInfo;
     }
     public CityInfo getCityInfo() {
         return cityInfo;
     }

    public void setDate(String date) {
         this.date = date;
     }
     public String getDate() {
         return date;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

}