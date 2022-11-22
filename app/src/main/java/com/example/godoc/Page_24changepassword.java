package com.example.godoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Page_24changepassword extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_24changepassword);


        ImageButton Yes = (ImageButton) findViewById(R.id.imageButton5);
        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"비밀번호가 변경되었습니다.",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Page_19mypage.class);
                startActivity(intent);
            }
        });
    }
}