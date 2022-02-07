package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVw = findViewById(R.id.txtWv);
        Button btn = findViewById(R.id.btn);
        EditText edTxt = findViewById(R.id.edTxt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String given_text = edTxt.getText().toString();

                txtVw.setText(given_text);
            }
        });


    }
}