package com.example.godoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page_17resv_check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_17resv_check);

        Button button_write = (Button) findViewById(R.id.hos_write);
        button_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_18before_question.class);
                startActivity(intent);
            }
        });
        Button button_write2 = (Button) findViewById(R.id.prescription_2);
        button_write2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_18before_question.class);
                startActivity(intent);
            }
        });
        Button button_write3 = (Button) findViewById(R.id.prescription_3);
        button_write3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_18before_question.class);
                startActivity(intent);
            }
        });
    }
}