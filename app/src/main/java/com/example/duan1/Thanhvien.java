package com.example.duan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.duan1.adapter.thanhvienadapter;
import com.example.duan1.model.thanhvien;

import java.util.ArrayList;

public class Thanhvien extends AppCompatActivity {

    ArrayList<thanhvien> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhvien);
        ListView lvthanhvien = findViewById(R.id.lvthanhvien);
        themds();
        thanhvienadapter adapter = new thanhvienadapter(this,list);
        lvthanhvien.setAdapter(adapter);
    }
    public void themds(){
        list.add(new thanhvien("Lê Đăng Sang", "PH42693","Admin"));
        list.add(new thanhvien("Vũ Thị Vân Anh", "PH42837","Thủ kho"));
        list.add(new thanhvien("Sằm Nam Khánh", "PH42900","Admin"));
        list.add(new thanhvien("Nguyễn Thế Kỳ Anh", "PH42369","Thủ kho"));
        list.add(new thanhvien("Phạm Minh Hiếu", "PH43456","Thủ kho"));
    }
}