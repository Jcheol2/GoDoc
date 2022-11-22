package com.example.godoc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Page_7find_account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_7find_account);

        Handler handler = new Handler();
        Button button_id = (Button) findViewById(R.id.id_btn);
        button_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder id_view = new AlertDialog.Builder(Page_7find_account.this);

                id_view.setMessage("입력하신 휴대폰으로 ID를 발송하였습니다. \n3초 뒤 로그인 페이지로 돌아갑니다.");
                id_view.show();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(),Page_5login.class);
                        startActivity(intent);
                        finish();
                    }
                }, 3000);
            }
        });



        Button button_pw = (Button) findViewById(R.id.pw_btn);
        button_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder pw_view = new AlertDialog.Builder(Page_7find_account.this);

                pw_view.setMessage("입력하신 휴대폰으로 임시 비밀번호를 발송하였습니다. 3초 뒤 로그인 페이지로 돌아갑니다.");
                pw_view.show();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(),Page_5login.class);
                        startActivity(intent);
                        finish();
                    }
                }, 3000);
            }
        });
    }
}

