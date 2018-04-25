package com.mahbub.weatherapp.forecastweather;
        import android.content.Context;
        import android.support.annotation.NonNull;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.TextView;

/**
 * Created by mahbub on 4/26/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    // declare member veriable for weather data string array
    private final ForecastAdapterOnClickHandler mClickHandler;
    String[] mWeatherData;

    public ForecastAdapter(String[] weatherData,ForecastAdapterOnClickHandler clickHandler){
        this.mWeatherData = weatherData ;
        this.mClickHandler = clickHandler ;
    }
public interface ForecastAdapterOnClickHandler{
        void onClick(String weatherData);
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

    public class ForecastViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mWeatherDataTextView;

        public ForecastViewHolder(View itemView) {
            super(itemView);

            mWeatherDataTextView=(TextView)itemView.findViewById(R.id.tv_forecast_weather_view);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            String weatherData = mWeatherData[position];
            mClickHandler.onClick(weatherData);

        }
    }
}
