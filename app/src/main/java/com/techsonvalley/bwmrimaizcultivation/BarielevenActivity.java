package com.techsonvalley.bwmrimaizcultivation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BarielevenActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barieleven);
        Button btnprevious=findViewById(R.id.btnprevious);
        Button btnnext=findViewById(R.id.btnnext);
        Button btneleven=findViewById(R.id.barieleven);
        Button preious=findViewById(R.id.preious);
        Button next=findViewById(R.id.next);

          btnprevious.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent btnprevious =new Intent(BarielevenActivity.this,BaritenActivity.class);
                  startActivity(btnprevious);
              }
          });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnnext =new Intent(BarielevenActivity.this,BaritwelveActivity.class);
                startActivity(btnnext);

            }
        });
//        btneleven.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent btneleven =new Intent(BarielevenActivity.this,MainActivity.class);
//                startActivity(btneleven);
//            }
//        });
        preious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previous =new Intent(BarielevenActivity.this,BaritenActivity.class);
                startActivity(previous);

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next =new Intent(BarielevenActivity.this,BaritwelveActivity.class);
                startActivity(next);
            }
        });
    }

    public void onClick(View view) {
        Intent btneleven =new Intent(BarielevenActivity.this,MainActivity.class);
               startActivity(btneleven);
    }
}
