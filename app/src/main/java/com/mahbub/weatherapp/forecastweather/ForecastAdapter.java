package com.mahbub.weatherapp.forecastweather;
        import android.content.Context;
        import android.support.annotation.NonNull;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

/**
 * Created by mahbub on 4/26/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    // declare member veriable for weather data string array
    String[] mWeatherData;

    public ForecastAdapter(String[] weatherData){
        this.mWeatherData = weatherData ;
    }


    @NonNull
    @Override
    public ForecastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.layout_row_weather_view,parent,false);
        ForecastViewHolder viewHolder = new ForecastViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastViewHolder holder, int position) {
        holder.mWeatherDataTextView.setText(mWeatherData[position]);

    }

    @Override
    public int getItemCount() {
        return mWeatherData.length;
    }

    public class ForecastViewHolder extends RecyclerView.ViewHolder {
        TextView mWeatherDataTextView;

        public ForecastViewHolder(View itemView) {
            super(itemView);

            mWeatherDataTextView=(TextView)itemView.findViewById(R.id.tv_forecast_weather_view);
        }
    }
}
