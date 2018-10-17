package com.vinsofts.training.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vinsofts.training.R;
import com.vinsofts.training.adapters.CountryAdapter;
import com.vinsofts.training.globals.Constants;
import com.vinsofts.training.listeners.IOnClickListener;
import com.vinsofts.training.pojo.Country;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by macOS on 10/17/18.
 */

public class CountryActivity extends BaseActivity implements IOnClickListener<Country> {

    @BindView(R.id.rvCountry)
    RecyclerView rvCountry;

    private List<Country> countries = new ArrayList<>();

    public static void start(Context context) {
        Intent starter = new Intent(context, CountryActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        ButterKnife.bind(this);

        initView();
        fetchData();
        initAdapter();
    }

    private void initAdapter() {
        CountryAdapter adapter = new CountryAdapter(this, countries, this);
        rvCountry.setAdapter(adapter);
    }

    private void fetchData() {
        for(int i=0; i< Constants.COUNTRY_FLAGS.length; i++){
            Country country = new Country(Constants.COUNTRY_FLAGS[i],
                    Constants.COUNTRY_NAME_VI[i], Constants.COUNTRY_NAME_EN[i]);
            countries.add(country);
        }
    }

    private void initView() {
        rvCountry.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onItemClicked(Country item) {
        showMessage(item.getNameEn());
    }
}
