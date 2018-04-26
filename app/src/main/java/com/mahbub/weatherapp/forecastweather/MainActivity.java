package com.mahbub.weatherapp.forecastweather;

    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.support.v7.widget.LinearLayoutManager;
    import android.support.v7.widget.RecyclerView;
    import android.view.View;
    import android.widget.LinearLayout;
    import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ForecastAdapter.ForecastAdapterOnClickHandler {
    // declare all member veriable
    private RecyclerView mWeatherRecyclerView;
    private ForecastAdapter mForecastAdapter;
    private String[] mWeatherData;
    private Toast mToast;


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
        mForecastAdapter = new ForecastAdapter(mWeatherData,this);
        mWeatherRecyclerView.setAdapter(mForecastAdapter);

    }


    @Override
    public void onClick(String data) {
        Intent intent = new Intent(this,Detailsctivity.class);
        intent.putExtra(Intent.EXTRA_TEXT,data);
        startActivity(intent);
        mToast = Toast.makeText(this, data + "clicked",Toast.LENGTH_SHORT);
        mToast.show();

    }
}
