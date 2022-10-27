package com.gabriel.alarmku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView tvOnceTime, tvOnceDate, tvRepeatingTime;
    private ImageButton ibOnceTime, ibOnceDate, ibRepeatingTime;
    private EditText etOnceMessage, etRepeatingMessage;
    private Button btnSetOnceAlarm, btnSetRepeatAlarm, btnCancelRepeatingAlarm;

    private AlarmReceiver alarmReceiver;
    private int mYear, mMonth, mDay, mHour, mMinute;
    private int mHourRepeat, mMinuteRepeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOnceTime = findViewById(R.id.tv_once_time);
        tvOnceDate = findViewById(R.id.tv_once_date);
        tvRepeatingTime = findViewById(R.id.tv_repeating_time);
        ibOnceTime = findViewById(R.id.ib_once_time);
        ibOnceDate = findViewById(R.id.ib_once_date);
        ibRepeatingTime = findViewById(R.id.ib_repeating_time);
        etOnceMessage = findViewById(R.id.et_once_message);
        etRepeatingMessage = findViewById(R.id.et_repeating_message);
        btnSetOnceAlarm = findViewById(R.id.btn_set_once_alarm);
        btnSetRepeatAlarm = findViewById(R.id.btn_set_repeating_alarm);
        btnCancelRepeatingAlarm = findViewById(R.id.btn_cancel_repeating_alarm);

        alarmReceiver = new AlarmReceiver();

        Calendar calendar = Calendar.getInstance();
        mYear = calendar.get(Calendar.YEAR);
        mMonth = calendar.get(Calendar.MONTH);
        mDay = calendar.get(Calendar.DAY_OF_MONTH);
        mHour = calendar.get(Calendar.HOUR_OF_DAY);
        mMinute = calendar.get(Calendar.MINUTE);

        mHourRepeat = mHour;
        mMinuteRepeat = mMinute;

    }
}