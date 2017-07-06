package ru.gdgkazan.simpleweather.screen.weatherlist.MyWeatherList;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import ru.gdgkazan.simpleweather.R;
import ru.gdgkazan.simpleweather.model.City;


public class MyWeatherListActivity extends AppCompatActivity implements WeatherAdapter.OnItemClick {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.empty)
    View mEmptyView;

    WeatherAdapter mWeatherAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_list);

        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mWeatherAdapter=new WeatherAdapter(getInstanceCity(),this);
        mRecyclerView.setAdapter(mWeatherAdapter);

    }

    private List<City> getInstanceCity() {
        List<City>listCity =new ArrayList<>();
        String[]cities=getResources().getStringArray(R.array.initial_cities);
        for (String city : cities) {
            listCity.add(new City(city));
        }
        return listCity;
    }

    @Override
    public void onItemClick(@NonNull City city) {
// TODO:  create intent for another activity
    }
}
