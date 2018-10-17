package com.vinsofts.training.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.vinsofts.training.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by macOS on 10/17/18.
 */

public class LoginActivity extends BaseActivity {

    @BindView(R.id.tvYourLogo)
    TextView tvYourLogo;
    @BindView(R.id.imgContact)
    ImageView imgContact;
    @BindView(R.id.etEmail)
    AppCompatEditText etEmail;
    @BindView(R.id.imgPassword)
    ImageView imgPassword;
    @BindView(R.id.etPassword)
    AppCompatEditText etPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnRegister)
    Button btnRegister;
    @BindView(R.id.tvForgotPassword)
    TextView tvForgotPassword;
    @BindView(R.id.tvLabelSignInWith)
    TextView tvLabelSignInWith;
    @BindView(R.id.imgFacebook)
    ImageView imgFacebook;
    @BindView(R.id.vFacebook)
    RelativeLayout vFacebook;
    @BindView(R.id.imgGoogle)
    ImageView imgGoogle;
    @BindView(R.id.vGoogle)
    RelativeLayout vGoogle;

    public static void start(Context context) {
        Intent starter = new Intent(context, LoginActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnLogin, R.id.btnRegister, R.id.tvForgotPassword, R.id.vFacebook, R.id.vGoogle})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                break;

            case R.id.btnRegister:
                break;

            case R.id.tvForgotPassword:
                break;

            case R.id.vFacebook:
                break;

            case R.id.vGoogle:
                break;
        }
    }
}
