package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        TextView description = findViewById(R.id.textview_description);
        description.setText("Activity B occupies the complete window real-estate. The Android OS forces Activity A to be Paused. However, the background thread keep incrementing the counter.");
    }

    public void onFinishActivityB(View view) {
        finish();
    }
}