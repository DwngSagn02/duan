package com.example.duan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.android.material.textfield.TextInputEditText;

public class dangnhap extends AppCompatActivity {

    private TextInputEditText Email;
    private TextInputEditText Password;
    private CheckBox chkGhi;
    private Button btndn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        getView();
        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dangnhap.this, Menu.class);
                startActivity(intent);
            }
        });
    }
    public void getView(){
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        chkGhi = findViewById(R.id.chkGhi);
        btndn = findViewById(R.id.btndn);
    }
}