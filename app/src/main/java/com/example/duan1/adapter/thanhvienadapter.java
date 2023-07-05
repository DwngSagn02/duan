package com.example.duan1.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.duan1.R;
import com.example.duan1.model.thanhvien;

import java.util.ArrayList;

public class thanhvienadapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<thanhvien> list;

    public thanhvienadapter(Context context, ArrayList<thanhvien> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.item_thanhvien,parent,false);

        TextView txtten = convertView.findViewById(R.id.txtten);
        TextView txtma = convertView.findViewById(R.id.txtma);
        TextView txtchucvu = convertView.findViewById(R.id.txtchucvu);

        txtten.setText(list.get(position).getTen());
        txtchucvu.setText(list.get(position).getChucvu());
        txtma.setText(list.get(position).getMa());
        return convertView;
    }
}
