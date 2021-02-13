package com.codepath.debuggingchallenges.activities;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.codepath.debuggingchallenges.R;

public class ChangeBackgroundActivity extends AppCompatActivity {

    public static final String TAG = "ChangeBackgroundActivity";
    private int oldColor = Color.BLUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);
    }

    @SuppressLint("LongLogTag")
    public void onGoClick(View view) {
        View mainView = findViewById(android.R.id.content);
        mainView.setBackgroundColor(getNextColor());
        Log.i(TAG, "Clicked");
        // Toast.makeText(TAG, "Aasdf", Toast.LENGTH_SHORT).show();
    }

    private int getNextColor() {
        int newColor = (oldColor == Color.BLUE) ? Color.RED : Color.BLUE;
        oldColor = newColor;
        return newColor;
    }
}
