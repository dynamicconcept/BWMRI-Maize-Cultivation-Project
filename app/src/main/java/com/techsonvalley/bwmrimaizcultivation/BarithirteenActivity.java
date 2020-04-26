package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BarithirteenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barithirteen);
        Button barithirteenPre=findViewById(R.id.barithirteenPre);
        Button barithirteenNe=findViewById(R.id.barithirteenNe);
        Button barithirteenhome=findViewById(R.id.barithirteenhome);
        Button barithirteenPrevious=findViewById(R.id.barithirteenPrevious);
        Button barithirteenNext=findViewById(R.id.barithirteenNext);
        barithirteenPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barithirteenPre=new Intent(BarithirteenActivity.this,BaritwelveActivity.class);
                startActivity(barithirteenPre);
            }
        });
        barithirteenNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barithirteenNe=new Intent(BarithirteenActivity.this,BarifourteenActivity.class);
                startActivity(barithirteenNe);
            }
        });
        barithirteenhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barithirteenhome=new Intent(BarithirteenActivity.this,MainActivity.class);
                startActivity(barithirteenhome);
            }
        });
        barithirteenPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barithirteenPrevious=new Intent(BarithirteenActivity.this,BaritwelveActivity.class);
                startActivity(barithirteenPrevious);
            }
        });
        barithirteenNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barithirteenNext=new Intent(BarithirteenActivity.this,BarifourteenActivity.class);
                startActivity(barithirteenNext);
            }
        });
    }
}
