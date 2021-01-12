package com.raza.mydemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GetInformation extends AppCompatActivity implements View.OnClickListener {


    private Button btn_bill;
    private Button btn_dash;
    private Button btn_Rejoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_information);
        initView();

    }

    private void initView() {
        btn_bill = (Button) findViewById(R.id.btn_bill);
        btn_dash = (Button) findViewById(R.id.btn_dash);
        btn_Rejoin = (Button) findViewById(R.id.btn_Rejoin);

        btn_bill.setOnClickListener(this);
        btn_dash.setOnClickListener(this);
        btn_Rejoin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_bill:

                break;
            case R.id.btn_dash:

                break;
            case R.id.btn_Rejoin:

                break;
        }
    }
}