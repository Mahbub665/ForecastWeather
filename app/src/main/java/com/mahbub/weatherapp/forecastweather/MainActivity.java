package com.mahbub.weatherapp.forecastweather;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.support.v7.widget.LinearLayoutManager;
    import android.support.v7.widget.RecyclerView;
    import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    // declare all member veriable
    RecyclerView mWeatherRecyclerView;
    ForecastAdapter mForecastAdapter;
    String[] mWeatherData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWeatherRecyclerView=(RecyclerView)findViewById(R.id.rv_forecast_weather_display);

        // initialize weatherdata by fake weather data
        mWeatherData = getResources().getStringArray(R.array.fakeWeahterData);

        // declare and initialize linearlayoutmanager object and set into recycler view
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mWeatherRecyclerView.setLayoutManager(linearLayoutManager);
        mWeatherRecyclerView.setHasFixedSize(true);

        //initialize adapter with mWeahterData as a constructor parameter
        mForecastAdapter = new ForecastAdapter(mWeatherData);
        mWeatherRecyclerView.setAdapter(mForecastAdapter);

    }
}
