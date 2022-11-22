package com.example.godoc;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Page_13hos_resv extends AppCompatActivity {

    DatePickerDialog datePickerDialog;

    Calendar calendar = Calendar.getInstance();
    Calendar minDate = Calendar.getInstance();
    Calendar maxDate = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_13hos_resv);

        TextView dateText = findViewById(R.id.date_textView);
        dateText.setText("날짜 : " + calendar.get(Calendar.YEAR) + "년 " + (calendar.get(Calendar.MONTH)+1)
                + "월 " + calendar.get(Calendar.DAY_OF_MONTH) + "일");
        ImageButton datePickerBtn = (ImageButton) findViewById(R.id.date_picker_button);
        Button button_900 = (Button) findViewById(R.id.button9_00);
        Button.OnClickListener acceptListener;

        datePickerBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int pYear = calendar.get(Calendar.YEAR);
                int pMonth = calendar.get(Calendar.MONTH);
                int pDay = calendar.get(Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(Page_13hos_resv.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                month = month + 1;
                                String date = "날짜 : " + year + "년 " + month + "월 " + day + "일";

                                dateText.setText(date);
                            }
                        }, pYear, pMonth, pDay);
                minDate.set(pYear, pMonth, pDay);
                datePickerDialog.getDatePicker().setMinDate(minDate.getTime().getTime());

                maxDate.set(pYear, pMonth, pDay+6);
                datePickerDialog.getDatePicker().setMaxDate(maxDate.getTimeInMillis());

                datePickerDialog.show();
            }
        });

        acceptListener = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Page_14agree.class);
                startActivity(intent);
            }
        };

        button_900.setOnClickListener(acceptListener);
    }
}