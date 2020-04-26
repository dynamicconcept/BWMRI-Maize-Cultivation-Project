package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BarifiveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barifive);
        Button barifivepre=findViewById(R.id.barifivepre);
        Button barifivene=findViewById(R.id.barifivene);
        Button barifivehome=findViewById(R.id.barifivehome);
        Button barifiveprevious=findViewById(R.id.barifiveprevious);
        Button barifivenext=findViewById(R.id.barifivenext);
        barifivepre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barifivepre=new Intent(BarifiveActivity.this,MohorActivity.class);
                startActivity(barifivepre);
            }
        });
        barifivene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barifivene=new Intent(BarifiveActivity.this,BarisevenActivity.class);
                startActivity(barifivene);
            }
        });
        barifivehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barifivehome=new Intent(BarifiveActivity.this,MainActivity.class);
                startActivity(barifivehome);
            }
        });
        barifiveprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barifiveprevious=new Intent(BarifiveActivity.this,MohorActivity.class);
                startActivity(barifiveprevious);
            }
        });
        barifivenext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barifivenext=new Intent(BarifiveActivity.this,BarisevenActivity.class);
                startActivity(barifivenext);
            }
        });
    }
}
