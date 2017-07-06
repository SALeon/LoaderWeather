package ru.gdgkazan.simpleweather.screen.weatherlist.MyWeatherList;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.gdgkazan.simpleweather.R;
import ru.gdgkazan.simpleweather.model.City;


public class WeatherHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.weather_main)
    TextView mCityName;

    @BindView(R.id.temperature_name)
    TextView mTemperature;

    @BindView(R.id.pressure_name)
    TextView mPressure;

    @BindView(R.id.humidity_name)
    TextView mHumidity;

    @BindView(R.id.wind_speed_name)
    TextView mWindSpeed;




    public WeatherHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bind(City city) {
        mCityName.setText(city.getName());
        mTemperature.setText("температурища");
        mPressure.setText("давленища");
        mHumidity.setText("Незнающе");
        mWindSpeed.setText("скоростище");

    }
}
