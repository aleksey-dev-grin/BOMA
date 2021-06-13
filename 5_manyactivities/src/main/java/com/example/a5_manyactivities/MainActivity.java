package com.example.a5_manyactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMsg = findViewById(R.id.editTextMsg);
    }

    public void onClickSendMsg(View view) {
        String msg = editTextMsg.getText().toString();
    }

}