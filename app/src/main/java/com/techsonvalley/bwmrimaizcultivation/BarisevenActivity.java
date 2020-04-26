package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BarisevenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bariseven);
        Button barisevenPre=findViewById(R.id.barisevenPre);
        Button barisevenNe=findViewById(R.id.barisevenNe);
        Button barisevenhome=findViewById(R.id.barisevenhome);
        Button barisevenPrevious=findViewById(R.id.barisevenPrevious);
        Button barisevenNext=findViewById(R.id.barisevenNext);
        barisevenPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisevenPre=new Intent(BarisevenActivity.this,BarifiveActivity.class);
                startActivity(barisevenPre);
            }
        });
        barisevenNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisevenNe=new Intent(BarisevenActivity.this,BarinineActivity.class);
                startActivity(barisevenNe);
            }
        });
        barisevenhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  barisevenhome=new Intent(BarisevenActivity.this,MainActivity.class);
                startActivity( barisevenhome);
            }
        });
        barisevenPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisevenPrevious=new Intent(BarisevenActivity.this,BarifiveActivity.class);
                startActivity(barisevenPrevious);
            }
        });
        barisevenNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisevenNext=new Intent(BarisevenActivity.this,BarinineActivity.class);
                startActivity(barisevenNext);
            }
        });
    }
}
