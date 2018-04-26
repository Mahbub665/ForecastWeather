package com.mahbub.weatherapp.forecastweather.utilities;

import android.net.Uri;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by mahbub on 4/26/2018.
 */

public class NetworkUtils {

    public static final String BASE_WEATHER_URL = "https://andfun-weather.udacity.com/weather";

    /*  the format we want our API to return  */
    public static final String format = "json";
    /*  the units we want our API to return  */
    public static final String units = "Metric";
    /*  the number of days we want our API  to return  */
    public static final int numDays = 14;

    final static String QUERY_PARAM = "q";
    final static String LAT_PARAM = "lat";
    final static String LON_PARAM = "lon";
    final static String FORMAT_PARAM = "mode";
    final static String UNITS_PARAM = "units";
    final static String DAYS_PARAM = "cnt";

    /* this method will return weather Url based on location Query
     *@param locationQuery The locationQuery get from user
       * @return Url This url will return weather url
      */
    public static URL buildUrl(String locationQuery){
        Uri buildUri = Uri.parse(BASE_WEATHER_URL).buildUpon()
                .appendQueryParameter(QUERY_PARAM,locationQuery)
                .appendQueryParameter(FORMAT_PARAM,format)
                .appendQueryParameter(UNITS_PARAM,units)
                .appendQueryParameter(DAYS_PARAM, String.valueOf(numDays))
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }

/* this method return  entire weather data from http response
 * @param url The URL to fetch from http response
 * @return string weather data
 * @throws IOException
  * */
    public static String getResponseFromHttpUrl(URL url) throws IOException{

        HttpURLConnection urlConnection =(HttpURLConnection) url.openConnection();

        try{
            InputStream inputStream = urlConnection.getInputStream();

            Scanner scanner = new Scanner(inputStream);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput){
                return scanner.next();
            }else {
                return null;
            }

        }finally {
            urlConnection.disconnect();
        }

    }
}
