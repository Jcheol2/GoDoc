package com.example.godoc;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page_20last_treat extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_20last_treat);

        Button Prescription1 = (Button) findViewById(R.id.prescription_1);
        Prescription1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_21prescription.class);
                startActivity(intent);
            }
        });

        Button Prescription2 = (Button) findViewById(R.id.prescription_2);
        Prescription2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_21prescription.class);
                startActivity(intent);
            }
        });

        Button Prescription3 = (Button) findViewById(R.id.prescription_3);
        Prescription3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_21prescription.class);
                startActivity(intent);
            }
        });

        Button hos_view1 = (Button) findViewById(R.id.hos_view_1);
        hos_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_11hos_info.class);
                startActivity(intent);
            }
        });

        Button hos_view2 = (Button) findViewById(R.id.hos_view_2);
        hos_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_11hos_info.class);
                startActivity(intent);
            }
        });

        Button hos_view3 = (Button) findViewById(R.id.hos_view_3);
        hos_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_11hos_info.class);
                startActivity(intent);
            }
        });

        Button hos_review1 = (Button) findViewById(R.id.review_1);
        hos_review1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_22hos_review.class);
                startActivity(intent);
            }
        });

        Button hos_review2 = (Button) findViewById(R.id.review_2);
        hos_review2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_22hos_review.class);
                startActivity(intent);
            }
        });

        Button hos_review3 = (Button) findViewById(R.id.review_3);
        hos_review3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_22hos_review.class);
                startActivity(intent);
            }
        });
    }
}