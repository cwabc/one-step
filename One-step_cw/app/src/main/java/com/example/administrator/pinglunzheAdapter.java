package com.example.administrator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class pinglunzheAdapter extends ArrayAdapter<pinglunzhe> {
    private int resourceid;
    public pinglunzheAdapter(Context context, int textViewResourceId, List<pinglunzhe>objects){
        super(context,textViewResourceId,objects);
        resourceid=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        pinglunzhe pinglunzhe=getItem(position);
        View view=LayoutInflater.from(getContext()).inflate(resourceid,parent,false);
        ImageView pinglunzhetouxiang=(ImageView)view.findViewById(R.id.pingluntouxiang);
        TextView pinglunzhename=(TextView)view.findViewById(R.id.guestname);
        TextView pinglunneirong=(TextView)view.findViewById(R.id.comment);
        pinglunzhename.setText(pinglunzhe.getPinglunname());
        pinglunzhetouxiang.setImageResource(pinglunzhe.getPinglunid());
        pinglunneirong.setText(pinglunzhe.getPingluncomment());
        return view;
    }
}
