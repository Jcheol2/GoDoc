package com.example.godoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page_8main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_8main);

        Button button_resu = (Button) findViewById(R.id.imageButton20);
        button_resu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_9sub_choose.class);
                startActivity(intent);
            }
        });

        Button button_find = (Button) findViewById(R.id.hos_find_btn);
        button_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_16find_hos.class);
                startActivity(intent);
            }
        });

        Button button_check = (Button) findViewById(R.id.hos_check_btn);
        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_17resv_check.class);
                startActivity(intent);
            }
        });

        Button button_myp = (Button) findViewById(R.id.hos_my_btn);
        button_myp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_19mypage.class);
                startActivity(intent);
            }
        });

        Button button_cen = (Button) findViewById(R.id.hos_cen_btn);
        button_cen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_25center.class);
                startActivity(intent);
            }
        });
    }

}