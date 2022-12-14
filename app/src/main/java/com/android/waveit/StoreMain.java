package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class StoreMain extends AppCompatActivity {

    TextView btn_large;
    ImageButton tampon;
    ImageButton mark1;
    ImageButton mark2;

    ImageButton whome;
    ImageButton wreal;
    ImageButton wkeep;
    ImageButton bproduct;
    ImageButton wcompany;
    ImageButton rael;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_main);

        btn_large = findViewById(R.id.btn_large);
        btn_large.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StoreLarge.class);
                startActivity(intent);
            }
        });

        tampon = findViewById(R.id.tampon);
        tampon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StoreTampon.class);
                startActivity(intent);
            }
        });

        rael = findViewById(R.id.rael);
        rael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StoreDetailMain.class);
                startActivity(intent);
            }
        });



        mark1 = findViewById(R.id.mark1);
        mark1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark1.setImageResource(R.drawable.mark_fill);
            }
        });

        mark2 = findViewById(R.id.mark2);
        mark2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark2.setImageResource(R.drawable.mark_fill);
            }
        });



        whome=findViewById(R.id.whome);
        wreal=findViewById(R.id.wreal);
        wkeep=findViewById(R.id.wkeep);
        bproduct=findViewById(R.id.bproduct);
        wcompany=findViewById(R.id.wcompany);

        whome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        wreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information.class);
                startActivity(intent);
            }
        });

        wkeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Keep.class);
                startActivity(intent);
            }
        });

        bproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),StoreMain.class);
                startActivity(intent);
                finish();
            }
        });

        wcompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Company.class);
                startActivity(intent);
            }
        });
    }
}