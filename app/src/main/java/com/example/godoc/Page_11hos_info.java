package com.example.godoc;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Page_11hos_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_11hos_info);

        TextView hos_name = findViewById(R.id.hos_name);
        TextView hos_tel = findViewById(R.id.hos_tel);
        TextView hos_doc = findViewById(R.id.hos_doc);
        Button button_call = (Button) findViewById(R.id.hos_call);

        button_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ad = new AlertDialog.Builder(Page_11hos_info.this);

                ad.setMessage("010-XXXX-OOOO로 전화하시겠습니까?");
                ad.setTitle("올리브내과병원으로 전화하기");

                ad.setPositiveButton("전화하기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-XXXX-OOOO"));
                        startActivity(intent);
                    }
                });

                ad.setNegativeButton("취소하기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                ad.show();
            }
        });

        Button button_resu = (Button) findViewById(R.id.hos_resu);
        button_resu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_13hos_resv.class);
                startActivity(intent);
            }
        });
    }

}