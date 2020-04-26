package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BarififteenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barififteen);
        Button barififteenPre=findViewById(R.id.barififteenPre);
        Button barififteenNe=findViewById(R.id.barififteenNe);
        Button barififteenHome=findViewById(R.id.barififteenHome);
        Button barififteenPrevoius=findViewById(R.id.barififteenPrevoius);
        Button barififteenNext=findViewById(R.id.barififteenNext);
        barififteenPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barififteenPre=new Intent(BarififteenActivity.this,BarifourteenActivity.class);
                startActivity(barififteenPre);
            }
        });
        barififteenNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barififteenNe=new Intent(BarififteenActivity.this,BarisixteenActivity.class);
                startActivity(barififteenNe);
            }
        });
        barififteenHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  barififteenHome=new Intent(BarififteenActivity.this,MainActivity.class);
                startActivity( barififteenHome);
            }
        });
        barififteenPrevoius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barififteenPrevoius=new Intent(BarififteenActivity.this,BarifourteenActivity.class);
                startActivity(barififteenPrevoius);
            }
        });
        barififteenNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  barififteenNext=new Intent(BarififteenActivity.this,BarisixteenActivity.class);
                startActivity( barififteenNext);
            }
        });
    }
}
