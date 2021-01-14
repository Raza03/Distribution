  package com.raza.mydemo;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import static com.raza.mydemo.R.id.*;
import static com.raza.mydemo.R.id.myListview;

public class MainActivity extends AppCompatActivity {


    private TextInputEditText rate;
    private TextInputEditText qty;
    private Button btn_add;
    private Button btn_print;
    private ListView myList;

     ArrayList <MyItemView> items = new  ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn_add.setVisibility(View.VISIBLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        addData();


    }

    private void initView() {
        myList = (ListView) findViewById(myListview);
        rate= (TextInputEditText) findViewById(R.id.edit1);
        qty= (TextInputEditText) findViewById(R.id.edit2);
        btn_add= (Button) findViewById(R.id.btn_add);
        btn_print = (Button) findViewById(R.id.btn_print);

    }

    public void AddDataInAdaptor(){

        String finalrate= rate.getText().toString();
        String finalqty= qty.getText().toString();

       if (TextUtils.isEmpty(finalrate))
            {
                rate.setError("Kindly Enter rate");
                return;
            }
       else if (TextUtils.isEmpty(finalqty))
            {
                qty.setError("Kindly Enter Quantity");
                return;
            }
       else
           {
               rate.setError(null);
               qty.setError(null);
               rate.setText("");
               qty.setText("");
               Toast.makeText(this, "Task Sucessfull", Toast.LENGTH_SHORT).show();
           }

       // int subtotal = finalrate * finalqty;

         MyItemView item0 = new MyItemView(finalrate,finalqty);


        items.add(item0);



    ListViewAdaptor adaptor = new ListViewAdaptor(this,R.layout.customlayoutfile,items);
    myList.setAdapter(adaptor);


    }


    public void addData(){
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddDataInAdaptor();
            }
        });


    }




}
