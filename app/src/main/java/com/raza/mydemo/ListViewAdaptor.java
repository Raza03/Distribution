package com.raza.mydemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdaptor extends ArrayAdapter<MyItemView> {

private Context mycontext;
int myresource;


    public ListViewAdaptor(@NonNull Context context, int resource, @NonNull ArrayList<MyItemView> objects) {
        super(context, resource, objects);
        mycontext=context;
        myresource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

       String mytext= getItem(position).getText();

       MyItemView itemView = new MyItemView(mytext);

        LayoutInflater inflater = LayoutInflater.from(mycontext);
        convertView = inflater.inflate(myresource,parent,false);

        TextView txt = (TextView) convertView.findViewById(R.id.text);
        txt.setText(mytext);

        return convertView;
    }
}
