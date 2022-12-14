package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class SignUp_disease extends AppCompatActivity {

    ImageButton back3;
    private CheckBox DcheckBox1;
    private CheckBox DcheckBox2;
    private CheckBox DcheckBox3;
    private CheckBox DcheckBox4;
    private CheckBox DcheckBox5;
    private CheckBox DcheckBox6;
    private CheckBox DcheckBox7;
    private CheckBox DcheckBox8;
    private CheckBox DcheckBox9;
    Button skip1;
    Button Next3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_disease);

        back3 = findViewById(R.id.back3);
        DcheckBox1 = findViewById(R.id.DcheckBox1);
        DcheckBox2 = findViewById(R.id.DcheckBox2);
        DcheckBox3 = findViewById(R.id.DcheckBox3);
        DcheckBox4 = findViewById(R.id.DcheckBox4);
        DcheckBox5 = findViewById(R.id.DcheckBox5);
        DcheckBox6 = findViewById(R.id.DcheckBox6);
        DcheckBox7 = findViewById(R.id.DcheckBox7);
        DcheckBox8 = findViewById(R.id.DcheckBox8);
        DcheckBox9 = findViewById(R.id.DcheckBox9);
        skip1 = findViewById(R.id.skip1);
        Next3 = findViewById(R.id.Next3);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUp_pwd.class);
                startActivity(intent);
            }
        });

        skip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUp_complete.class);
                startActivity(intent);
            }
        });



        Next3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Next3.setClickable(false);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Next3.setClickable(false);
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (DcheckBox1.isChecked() || DcheckBox2.isChecked() || DcheckBox3.isChecked() || DcheckBox4.isChecked() || DcheckBox5.isChecked() || DcheckBox6.isChecked() || DcheckBox7.isChecked() || DcheckBox8.isChecked() || DcheckBox9.isChecked()) {
                    Next3.setClickable(true);
                    Next3.setBackgroundColor(Color.parseColor("#85776D"));
                    Next3.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUp_sickness.class);
                startActivity(intent);
            }
        });
    }
}