package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaritwelveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baritwelve);
        Button baritwelvePre=findViewById(R.id.baritwelvePre);
        Button baritwelveNe=findViewById(R.id.baritwelveNe);
        Button baritwelveHome=findViewById(R.id.baritwelveHome);
        Button baritwelvePrevious=findViewById(R.id.baritwelvePrevious);
        Button baritwelveNext=findViewById(R.id.baritwelveNext);
        baritwelvePre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritwelvePre=new Intent(BaritwelveActivity.this,BarielevenActivity.class);
                startActivity(baritwelvePre);
            }
        });
        baritwelveNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritwelveNe=new Intent(BaritwelveActivity.this,BarithirteenActivity.class);
                startActivity(baritwelveNe);
            }
        });
        baritwelveHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritwelveHome=new Intent(BaritwelveActivity.this,MainActivity.class);
                startActivity(baritwelveHome);
            }
        });
        baritwelvePrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritwelvePrevious=new Intent(BaritwelveActivity.this,BarielevenActivity.class);
                startActivity(baritwelvePrevious);

            }
        });
        baritwelveNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baritwelveNext=new Intent(BaritwelveActivity.this,BarithirteenActivity.class);
                startActivity(baritwelveNext);
            }
        });
    }
}
