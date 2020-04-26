package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaritenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bariten);
        Button baritenPre=findViewById(R.id.baritenPre);
        Button baritenNe=findViewById(R.id.baritenNe);
        Button baritenHome=findViewById(R.id.baritenHome);
        Button baritenPrevious=findViewById(R.id.baritenPrevious);
        Button baritenNext=findViewById(R.id.baritenNext);
        baritenPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritenPre=new Intent(BaritenActivity.this,BarinineActivity.class);
                startActivity(baritenPre);
            }
        });
        baritenNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritenNe=new Intent(BaritenActivity.this,BarielevenActivity.class);
                startActivity(baritenNe);
            }
        });
        baritenHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritenHome=new Intent(BaritenActivity.this,MainActivity.class);
                startActivity(baritenHome);
            }
        });
        baritenPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritenPrevious=new Intent(BaritenActivity.this,BarinineActivity.class);
                startActivity(baritenPrevious);
            }
        });
        baritenNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritenNext=new Intent(BaritenActivity.this,BarielevenActivity.class);
                startActivity(baritenNext);
            }
        });
    }
}
