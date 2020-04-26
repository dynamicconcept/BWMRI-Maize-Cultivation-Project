package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BarisixteenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisixteen);
        Button barisixteenPre=findViewById(R.id.barisixteenPre);
        Button barisixteenNe=findViewById(R.id.barisixteenNe);
        Button barisixteenhome=findViewById(R.id.barisixteenhome);
        Button barisixteenPrevious=findViewById(R.id.barisixteenPrevious);
        Button barisixteenNext=findViewById(R.id.barisixteenNext);
        barisixteenPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisixteenPre=new Intent(BarisixteenActivity.this,BarififteenActivity.class);
                startActivity(barisixteenPre);
            }
        });
        barisixteenNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisixteenNe=new Intent(BarisixteenActivity.this,KhoivuttaActivity.class);
                startActivity(barisixteenNe);
            }
        });
        barisixteenhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisixteenhome=new Intent(BarisixteenActivity.this,MainActivity.class);
                startActivity(barisixteenhome);
            }
        });
        barisixteenPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisixteenPrevious=new Intent(BarisixteenActivity.this,BarififteenActivity.class);
                startActivity(barisixteenPrevious);
            }
        });
        barisixteenNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisixteenNext=new Intent(BarisixteenActivity.this,KhoivuttaActivity.class);
                startActivity(barisixteenNext);
            }
        });
    }
}
