package com.mahbub.weatherapp.forecastweather;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class Detailsctivity extends AppCompatActivity {

    TextView mDetailWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        mDetailWeatherTextView = (TextView)findViewById(R.id.tv_detail_weather_data);

        Intent intent = getIntent();
        if (intent.hasExtra(Intent.EXTRA_TEXT)){
            String data = intent.getStringExtra(Intent.EXTRA_TEXT);
            mDetailWeatherTextView.setText(data);

        }
    }
}
