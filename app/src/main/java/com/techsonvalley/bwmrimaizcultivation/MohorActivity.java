package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MohorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohor);
        Button mohorPre=findViewById(R.id.mohorPre);
        Button mohorNe=findViewById(R.id.mohorNe);
        Button mohorHome=findViewById(R.id.mohorHome);
        Button mohorPrevious=findViewById(R.id.mohorPrevious);
        Button mohorNext=findViewById(R.id.mohorNext);
        mohorPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mohorPre=new Intent(MohorActivity.this,KhoivuttaActivity.class);
                startActivity(mohorPre);
            }
        });
        mohorNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mohorNe=new Intent(MohorActivity.this,BarifiveActivity.class);
                startActivity(mohorNe);
            }
        });
        mohorHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mohorHome=new Intent(MohorActivity.this,MainActivity.class);
                startActivity(mohorHome);
            }
        });
        mohorPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mohorPrevious=new Intent(MohorActivity.this,KhoivuttaActivity.class);
                startActivity(mohorPrevious);
            }
        });
        mohorNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mohorNext=new Intent(MohorActivity.this,BarifiveActivity.class);
                startActivity(mohorNext);
            }
        });
    }
}
