package com.example.a4_colordescriptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button button;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        tv = findViewById(R.id.tv);

    }


    public void showDescription(View view) {
        int position = spinner.getSelectedItemPosition();
        tv.setText(getDecription(position));
    }

    private String getDecription(int position) {
        String[] descriptions = getResources().getStringArray(R.array.descript_of_temp);
        return descriptions[position];
    }


}