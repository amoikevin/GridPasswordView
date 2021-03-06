package com.jungly.gridpasswordview.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import com.jungly.gridpasswordview.GridPasswordView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnCheckedChanged;


public class MainActivity extends ActionBarActivity {

    @InjectView(R.id.gpv_normal)
    GridPasswordView gpvNormal;
    @InjectView(R.id.gpv_length)
    GridPasswordView gpvLength;
    @InjectView(R.id.gpv_transformation)
    GridPasswordView gpvTransformation;
    @InjectView(R.id.gpv_passwordType)
    GridPasswordView gpvPasswordType;
    @InjectView(R.id.gpv_customUi)
    GridPasswordView gpvCustomUi;
    @InjectView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);
        ButterKnife.inject(this);

        toolbar.setTitle(R.string.app_name);
    }

    @OnCheckedChanged(R.id.psw_visibility_switcher)
    void onCheckedChanged(boolean isChecked) {
        gpvPasswordType.togglePasswordVisibility();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.reset(this);
    }
}
