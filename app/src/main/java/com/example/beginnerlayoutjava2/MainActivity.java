package com.example.beginnerlayoutjava2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText login = findViewById(R.id.login);
        EditText parol = findViewById(R.id.pw);
        TextView res = findViewById(R.id.res);
        Button signin = findViewById(R.id.signin);

        signin.setOnClickListener(view -> {
            res.setText("Login: "+login.getText()+"\nParol: "+parol.getText());
        });
    }
}