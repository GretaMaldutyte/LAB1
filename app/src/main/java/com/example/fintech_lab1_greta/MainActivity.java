package com.example.fintech_lab1_greta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button btn_Change_Color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        this.btn_Change_Color = findViewById(R.id.btn_Change_Color);

    }

    public void OnBtnClick(View view) {
        this.tvMain.setText(R.string.changed_label_text);
    }

    @SuppressLint("ResourceAsColor")
    public void OnBtnClickColor(View view) {
        this.btn_Change_Color.setTextColor(R.color.teal_200);
        this.btn_Change_Color.setBackgroundColor(R.color.purple_200);
        this.tvMain.setTextColor(R.color.teal_200);

    }
}