package com.example.godoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page_5login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_5login);

        Button button_find_acc = (Button) findViewById(R.id.find_btn);
        button_find_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_7find_account.class);
                startActivity(intent);
            }
        });

        Button button_sign = (Button) findViewById(R.id.sign_btn);
        button_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_6sign_up.class);
                startActivity(intent);
            }
        });

        Button button_check = (Button) findViewById(R.id.hos_view_1);
        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_8main.class);
                startActivity(intent);
            }
        });
    }
}
