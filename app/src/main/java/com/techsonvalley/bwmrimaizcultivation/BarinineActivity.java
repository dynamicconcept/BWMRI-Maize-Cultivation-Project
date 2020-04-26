package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BarinineActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barinine);
        Button barininePre=findViewById(R.id.barininePre);
        Button barinineNe=findViewById(R.id.barinineNe);
        Button barininehome=findViewById(R.id.barininehome);
        Button barinineprevious=findViewById(R.id.barinineprevious);
        Button barinineNext=findViewById(R.id.barinineNext);
        barininePre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barininePre=new Intent(BarinineActivity.this,BarisevenActivity.class);
                startActivity(barininePre);
            }
        });
        barinineNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barinineNe=new Intent(BarinineActivity.this,BaritenActivity.class);
                startActivity(barinineNe);
            }
        });
        barininehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barininehome=new Intent(BarinineActivity.this,MainActivity.class);
                startActivity(barininehome);
            }
        });
        barinineprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barinineprevious=new Intent(BarinineActivity.this,BarisevenActivity.class);
                startActivity(barinineprevious);
            }
        });
        barinineNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barinineNext=new Intent(BarinineActivity.this,BaritenActivity.class);
                startActivity(barinineNext);
            }
        });
    }
}
