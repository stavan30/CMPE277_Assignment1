package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_c);
        TextView description = findViewById(R.id.textview_description);
        description.setText("Activity C occupies the complete window real-estate. The Android OS forces Activity A to be Paused. However, the background thread keep incrementing the counter.");
    }

    public void onFinishActivityC(View view) {
        finish();
    }
}