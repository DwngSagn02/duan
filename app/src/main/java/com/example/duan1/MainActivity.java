package com.example.duan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btndangnhap;
    private Button btndangky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getView();
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, dangnhap.class);
                startActivity(intent);
            }
        });
        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, dangky.class);
                startActivity(intent);
            }
        });
    }
    public void getView(){
        btndangnhap = findViewById(R.id.btndangnhap);
        btndangky = findViewById(R.id.btndangky);
    }
}