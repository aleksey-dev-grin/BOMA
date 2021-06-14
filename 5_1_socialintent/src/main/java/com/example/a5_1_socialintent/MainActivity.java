package com.example.a5_1_socialintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMsg = findViewById(R.id.etMsg);
    }

    public void sendMsg(View view) {
        String msg = etMsg.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        Intent choosenIntent = Intent.createChooser(intent, getString(R.string.chooser_title));
        startActivity(choosenIntent);
    }
}