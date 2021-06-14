package com.example.a5_manyactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecievedMessageActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);

        Bundle args = getIntent().getExtras();
        String msg = args.getString("message").toString();
        tvResult = findViewById(R.id.tvResult);
        tvResult.setText(msg);
    }
}