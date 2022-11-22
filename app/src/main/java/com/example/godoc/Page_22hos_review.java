package com.example.godoc;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Page_22hos_review extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_22hos_review);

        Button review_Yes = (Button) findViewById(R.id.imageButton2);
        review_Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"리뷰가 등록되었습니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Page_20last_treat.class);
                startActivity(intent);
            }
        });

        Button back11 = (Button) findViewById(R.id.imageButton);
        back11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_20last_treat.class);
                startActivity(intent);
            }
        });
    }
}