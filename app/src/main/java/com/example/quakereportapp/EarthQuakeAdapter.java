package com.example.quakereportapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthQuakeAdapter extends BaseAdapter {

    private ArrayList<Earthquake> earthquakes;
    private Context context;
    public EarthQuakeAdapter(ArrayList<Earthquake> earthquakes, Context context) {
        this.earthquakes = earthquakes;
        this.context = context;
    }
    @Override
    public int getCount() {
        return earthquakes.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return  0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=layoutInflater.inflate(R.layout.custom_list_view,null);
        RelativeLayout option;
        ImageView photo;
      //  if(view==null){
        //    photo=new ImageView(context);
       // }
        Earthquake earthquakeinfo= earthquakes.get(i);
        //photo=(ImageView)view.findViewById(R.id.photo);
       // option=(RelativeLayout)view.findViewById(R.id.option);
        TextView mag=(TextView)view.findViewById(R.id.tvMag);
        TextView place=(TextView)view.findViewById(R.id.tvPlace);
        TextView time=(TextView)view.findViewById(R.id.tvTime);


        mag.setText(earthquakeinfo.getMagnitude());
        place.setText(earthquakeinfo.getLocation());
        time.setText(earthquakeinfo.getDate());

        return view;
    }

}
