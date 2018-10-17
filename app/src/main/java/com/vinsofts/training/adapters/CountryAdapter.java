package com.vinsofts.training.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vinsofts.training.R;
import com.vinsofts.training.adapters.holder.CountryHolder;
import com.vinsofts.training.listeners.IOnClickListener;
import com.vinsofts.training.pojo.Country;

import java.util.List;

/**
 * Created by macOS on 10/17/18.
 */

public class CountryAdapter extends RecyclerView.Adapter<CountryHolder> {

    private Context context;
    private List<Country> countries;
    private LayoutInflater inflater;
    private IOnClickListener<Country> listener;

    public CountryAdapter(Context context, List<Country> countries, IOnClickListener<Country> listener) {
        this.context = context;
        this.countries = countries;
        this.listener = listener;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CountryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_country, parent, false);
        return new CountryHolder(view, countries, listener);
    }

    @Override
    public void onBindViewHolder(CountryHolder holder, int position) {
        holder.bindView(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}
