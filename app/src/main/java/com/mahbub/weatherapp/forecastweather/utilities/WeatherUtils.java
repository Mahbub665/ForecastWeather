package com.mahbub.weatherapp.forecastweather.utilities;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by mahbub on 4/26/2018.
 */

public class WeatherUtils {

    /* This method will return  JOSONObject
    *@param tagName The tagName will receive a String parameter
    * @param jsonObject The jsonObject will receive a jsonObject
    * @return jsonObject  The jsonObject will return a JSONObject
     */
    public static JSONObject getObject(String tagName, JSONObject jsonObject) throws JSONException{
        JSONObject jsonObj = jsonObject.getJSONObject(tagName);
        return jsonObj;
    }

    /* This method will return  string
       *@param tagName The tagName will receive a String parameter
       * @param jsonObject The jsonObject will receive a jsonObject
       * @return string  This will return string weather data
        */
    public static String getString(String tagName, JSONObject jsonObject) throws JSONException{
        return jsonObject.getString(tagName);
    }

    /* This method will return  float data
     *@param tagName The tagName will receive a String parameter
     * @param jsonObject The jsonObject will receive a jsonObject
      * @return float  This will return float weather data
      */
    public static float getFloat(String tagName, JSONObject jsonObject )throws JSONException{
        return (float)jsonObject.getDouble(tagName);
    }
    /* This method will return  double
     *@param tagName The tagName will receive a String parameter
     * @param jsonObject The jsonObject will receive a jsonObject
      * @return double  This will return double weather data
      */
    public static double getDouble(String tagName, JSONObject jsonObject) throws JSONException{
        return jsonObject.getDouble(tagName);
    }
    /* This method will return  int type weather data
         *@param tagName The tagName will receive a String parameter
         * @param jsonObject The jsonObject will receive a jsonObject
          * @return int  This will return int weather data
          */
    public static int getInteger(String tagName, JSONObject jsonObject) throws JSONException{
        return jsonObject.getInt(tagName);
    }



}
