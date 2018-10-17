package com.vinsofts.training.adapters.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vinsofts.training.R;
import com.vinsofts.training.pojo.Country;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by macOS on 10/17/18.
 */

public class CountryHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.imgFlag)
    ImageView imgFlag;
    @BindView(R.id.tvCountryNameVi)
    TextView tvCountryNameVi;
    @BindView(R.id.tvCountryNameEn)
    TextView tvCountryNameEn;

    public CountryHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bindView(Country country){
        
    }
}
