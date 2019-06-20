package com.example.retrofitdemo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_search_guangzhou)
    Button btnSearchGuangzhou;
    @BindView(R.id.btn_search_beijing)
    Button btnSearchBeijing;
    @BindView(R.id.weather)
    TextView weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_search_guangzhou, R.id.btn_search_beijing})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_search_guangzhou:
                break;
            case R.id.btn_search_beijing:
                break;
        }
    }
}
