package com.example.godoc;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Page_19mypage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_19mypage);

        Button Medical_history = (Button) findViewById(R.id.hos_reserve);
        Medical_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_20last_treat.class);
                startActivity(intent);
            }
        });

        Button Payment_method = (Button) findViewById(R.id.imageButton20);
        Payment_method.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_23payment.class);
                startActivity(intent);
            }
        });

        Button Password_reset = (Button) findViewById(R.id.imageButton21);
        Password_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Page_24changepassword.class);
                startActivity(intent);
            }
        });

        Button Logout = (Button) findViewById(R.id.imageButton22);
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder logout = new AlertDialog.Builder(Page_19mypage.this);

                logout.setMessage("정말 로그아웃 하시겠습니까?");

                logout.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getApplicationContext(), "로그아웃 하였습니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),Page_5login.class);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });
                logout.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                logout.show();
            }
        });
    }
}