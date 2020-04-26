package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class KhoivuttaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khoivutta);
        Button khoivuttaPre=findViewById(R.id.khoivuttaPre);
        Button khoivuttaNe=findViewById(R.id.khoivuttaNe);
        Button khoivuttaHome=findViewById(R.id.khoivuttaHome);
        Button khoivuttaPrevious=findViewById(R.id.khoivuttaPrevious);
        Button khoivuttaNext=findViewById(R.id.khoivuttaNext);
        khoivuttaPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khoivuttaPre=new Intent(KhoivuttaActivity.this,MainActivity.class);
                startActivity(khoivuttaPre);
            }
        });
        khoivuttaNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khoivuttaNe=new Intent(KhoivuttaActivity.this,MohorActivity.class);
                startActivity(khoivuttaNe);
            }
        });
        khoivuttaHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khoivuttaHome=new Intent(KhoivuttaActivity.this,MainActivity.class);
                startActivity(khoivuttaHome);
            }
        });
        khoivuttaPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khoivuttaPrevious=new Intent(KhoivuttaActivity.this,MainActivity.class);
                startActivity(khoivuttaPrevious);
            }
        });
        khoivuttaNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khoivuttaNext=new Intent(KhoivuttaActivity.this,MohorActivity.class);
                startActivity(khoivuttaNext);
            }
        });
    }
}
