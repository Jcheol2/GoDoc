package com.example.godoc;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page_14agree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_14agree);

        Button button_agree = (Button) findViewById(R.id.hos_agree);
        button_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_15resv_suc.class);
                startActivity(intent);
            }
        });

        Button button_cancel = (Button) findViewById(R.id.hos_cancel);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_13hos_resv.class);
                startActivity(intent);
            }
        });
    }
}