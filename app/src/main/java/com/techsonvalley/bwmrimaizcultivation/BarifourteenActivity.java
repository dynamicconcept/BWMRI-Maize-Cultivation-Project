package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.nio.channels.InterruptedByTimeoutException;

public class BarifourteenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barifourteen);
        Button barifourteenPre=findViewById(R.id.barifourteenPre);
        Button barifourteenNext=findViewById(R.id.barifourteenNext);
        Button barifourteenHome=findViewById(R.id.barifourteenHome);
        Button barifourteenPrevious=findViewById(R.id.barifourteenPrevious);
        Button barifourteenNex=findViewById(R.id.barifourteenNex);
        barifourteenPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barifourteenPre=new Intent(BarifourteenActivity.this,BarithirteenActivity.class);
                startActivity(barifourteenPre);
            }
        });
        barifourteenNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barifourteenNext=new Intent(BarifourteenActivity.this,BarififteenActivity.class);
                startActivity(barifourteenNext);
            }
        });
        barifourteenHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barifourteenHome=new Intent(BarifourteenActivity.this,MainActivity.class);
                startActivity(barifourteenHome);
            }
        });
        barifourteenPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  barifourteenPrevious=new Intent(BarifourteenActivity.this,BarithirteenActivity.class);
                startActivity(barifourteenPrevious);
            }
        });
        barifourteenNex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barifourteenNex=new Intent(BarifourteenActivity.this,BarififteenActivity.class);
                startActivity(barifourteenNex);
            }
        });
    }
}
