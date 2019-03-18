package com.example.androidfilippov;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.GregorianCalendar;

public class CalendarViewActivity extends AppCompatActivity {

    private Button mChooseStartDate;
    private Button mChooseEndDate;
    private CalendarView mStartDateCalendar;
    private CalendarView mEndDateCalendar;
    private Button mBtnOK;
    private long mStartDate;
    private String mStartDateTxt;
    private long mEndDate;
    private String mEndDateTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);
        initViews();

        mChooseStartDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStartDateCalendar.setVisibility(View.VISIBLE);
                mEndDateCalendar.setVisibility(View.GONE);
            }
        });

        mChooseEndDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEndDateCalendar.setVisibility(View.VISIBLE);
                mStartDateCalendar.setVisibility(View.GONE);
            }
        });

        mStartDateCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                mStartDateTxt = i+"-"+i1+"-"+i2;
                mChooseStartDate.setText("Дата-время старта задачи: " + mStartDateTxt);
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.set(i, i1, i2);
                mStartDate = gregorianCalendar.getTimeInMillis();
                calendarView.setVisibility(View.GONE);
            }
        });

        mEndDateCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                mEndDateTxt = i+"-"+i1+"-"+i2;
                mChooseEndDate.setText("Дата-время окончания задачи: " + mEndDateTxt);
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.set(i, i1, i2);
                mEndDate = gregorianCalendar.getTimeInMillis();
                calendarView.setVisibility(View.GONE);
            }
        });

        mBtnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStartDate > mEndDate){
                    Toast.makeText(CalendarViewActivity.this, "Ошибка",
                            Toast.LENGTH_LONG).show();
                    mChooseStartDate.setText("Дата-время старта задачи:");
                    mChooseEndDate.setText("Дата-время окончания задачи:");
                } else {
                    Toast.makeText(CalendarViewActivity.this, "старт: "
                            + mStartDateTxt + " окончаниe: "
                            + mEndDateTxt, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void initViews() {
        mChooseStartDate = findViewById(R.id.chooseStartDate);
        mChooseEndDate = findViewById(R.id.chooseEndDate);
        mStartDateCalendar = findViewById(R.id.startDateCalendar);
        mEndDateCalendar = findViewById(R.id.endtDateCalendar);
        mBtnOK = findViewById(R.id.btnOK);

        mStartDateCalendar.setVisibility(View.GONE);
        mEndDateCalendar.setVisibility(View.GONE);
    }
}
