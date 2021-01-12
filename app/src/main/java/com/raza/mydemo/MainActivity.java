  package com.raza.mydemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import static com.raza.mydemo.R.id.*;
import static com.raza.mydemo.R.id.myListview;

public class MainActivity extends AppCompatActivity {


    private TextInputEditText edit1;
    private TextInputEditText edit2;
    private Button btn_recipt;
    private Button btn_print;
    private ListView myList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        AddDataInAdaptor();


    }

    private void initView() {
        myList = (ListView) findViewById(myListview);
        edit1= (TextInputEditText) findViewById(R.id.edit1);
        edit2= (TextInputEditText) findViewById(R.id.edit2);
        btn_recipt= (Button) findViewById(R.id.btn_recipt);
        btn_print = (Button) findViewById(R.id.btn_print);

    }

    public void AddDataInAdaptor(){

        MyItemView item0 = new MyItemView("300*9");
        MyItemView item1 = new MyItemView("300*2");
        MyItemView item2 = new MyItemView("300*8");
        MyItemView item3 = new MyItemView("300*5");
        MyItemView item4 = new MyItemView("300*7");
        MyItemView item5 = new MyItemView("300*9");
        MyItemView item6 = new MyItemView("300*9");
        MyItemView item7 = new MyItemView("300*9");
        MyItemView item8 = new MyItemView("300*9");
        MyItemView item9 = new MyItemView("300*9");



        ArrayList <MyItemView> items = new  ArrayList<>();

        items.add(item0);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);



    ListViewAdaptor adaptor = new ListViewAdaptor(this,R.layout.customlayoutfile,items);
    myList.setAdapter(adaptor);
    }
}
