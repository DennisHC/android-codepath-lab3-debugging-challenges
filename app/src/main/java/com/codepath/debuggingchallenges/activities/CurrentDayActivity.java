package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;

import com.codepath.debuggingchallenges.R;

import java.util.Calendar;

public class CurrentDayActivity extends AppCompatActivity {
    public static final String TAG = "CurrentDayActivity";
    TextView tvDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_day);
        Log.i(TAG, "I crashed here!");
        tvDay = (TextView) findViewById(R.id.tvDay);

        // The original bug was trying to call setText()
        // on an integer. The fix was to type cast from an int
        // to a String using Integer.toString();
        tvDay.setText(Integer.toString(getDayOfMonth()));
    }

    private int getDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH);
    }
}
