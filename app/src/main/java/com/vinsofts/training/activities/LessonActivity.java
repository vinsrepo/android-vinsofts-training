package com.vinsofts.training.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.vinsofts.training.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LessonActivity extends AppCompatActivity {

    @BindView(R.id.btnUnit1)
    Button btnUnit1;
    @BindView(R.id.btnUnit2)
    Button btnUnit2;
    @BindView(R.id.btnUnit3)
    Button btnUnit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.btnUnit1, R.id.btnUnit2, R.id.btnUnit3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnUnit1:
                LoginActivity.start(this);
                break;

            case R.id.btnUnit2:
                break;

            case R.id.btnUnit3:
                break;
        }
    }
}
