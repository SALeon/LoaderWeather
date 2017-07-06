package ru.gdgkazan.simpleweather.screen.weatherlist.MyWeatherList;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.gdgkazan.simpleweather.R;
import ru.gdgkazan.simpleweather.model.City;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherHolder> {

    private final List<City> mCities;

    private final WeatherAdapter.OnItemClick mOnItemClick;

    private final View.OnClickListener mInternalListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            City city = (City) view.getTag();
            mOnItemClick.onItemClick(city);
        }
    };

    public WeatherAdapter(List<City> cities, @NonNull OnItemClick onItemClick) {
        mCities = new ArrayList<>(cities);
        mOnItemClick = onItemClick;
    }

    @Override
    public WeatherHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.weather_card, parent, false);
        return new WeatherHolder(itemView);
    }


    @Override
    public void onBindViewHolder(WeatherHolder holder, int position) {
        City city=mCities.get(position);
        holder.bind(city);
    }


    @Override
    public int getItemCount() {
        return mCities.size();
    }

    public interface OnItemClick {

        void onItemClick(@NonNull City city);

    }
}
