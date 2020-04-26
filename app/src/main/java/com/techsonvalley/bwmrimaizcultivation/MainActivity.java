package com.techsonvalley.bwmrimaizcultivation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  vutta= findViewById(R.id.vutta);
        Button  khoivutta= findViewById(R.id.khoivutta);
        Button  mohor= findViewById(R.id.mohor);
        Button  barifive= findViewById(R.id.barifive);
        Button  bariseven= findViewById(R.id.bariseven);
        Button  barinine= findViewById(R.id.barinine);
        Button  bariten= findViewById(R.id.bariten);
        Button barieleven= findViewById(R.id.barieleven);
        Button baritwelve= findViewById(R.id.baritwelve);
        Button barithirteen=findViewById(R.id.barithirteen);
        Button  barifourteen= findViewById(R.id.barifourteen);
        Button  barififteen= findViewById(R.id.barififteen);
        Button  barisixteen= findViewById(R.id.barisixteen);
//          proTech.setOnClickListener(this);
        vutta.setOnClickListener(this);
        khoivutta.setOnClickListener(this);
        mohor.setOnClickListener(this);
        barifive.setOnClickListener(this);
        bariseven.setOnClickListener(this);
        barinine.setOnClickListener(this);
        bariten.setOnClickListener(this);
        barieleven.setOnClickListener(this);
        baritwelve.setOnClickListener(this);
        barithirteen.setOnClickListener(this);
        barifourteen.setOnClickListener(this);
        barififteen.setOnClickListener(this);
        barisixteen.setOnClickListener(this);


//
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.vutta:
//                Toast.makeText(this,"protech1",Toast.LENGTH_SHORT).show();
//
//                break;
            case R.id.khoivutta:
                Intent khoi =new Intent(MainActivity.this,KhoivuttaActivity.class);
                startActivity(khoi);
                break;
            case R.id.mohor:
                Intent mohor =new Intent(MainActivity.this,MohorActivity.class);
                startActivity(mohor);
                break;
            case R.id.barifive:
                Intent barifive =new Intent(MainActivity.this,BarifiveActivity.class);
                startActivity(barifive);
                break;
            case R.id.bariseven:
                Intent bariseven =new Intent(MainActivity.this,BarisevenActivity.class);
                startActivity(bariseven);
                break;
            case R.id.barinine:
                Intent barinine=new Intent(MainActivity.this,BarinineActivity.class);
                startActivity(barinine);
                break;
            case R.id.bariten:
                Intent bariten =new Intent(MainActivity.this,BaritenActivity.class);
                startActivity(bariten);
                break;
            case R.id.barieleven:
                Intent barieleven =new Intent(MainActivity.this,BarielevenActivity.class);
                startActivity(barieleven);
                break;
            case R.id.baritwelve:
                Intent baritwelve =new Intent(MainActivity.this,BaritwelveActivity.class);
                startActivity(baritwelve);
                break;
            case R.id.barithirteen:
                Intent barithirteen =new Intent(MainActivity.this,BarithirteenActivity.class);
                startActivity(barithirteen);
//                Intent intent=new Intent(MainActivity.this,JatojaterActivity.class);
//                startActivity(intent);
                break;
            case R.id.barifourteen:
                Intent barifourteen =new Intent(MainActivity.this,BarifourteenActivity.class);
                startActivity(barifourteen);
                break;
            case R.id.barififteen:
                Intent barififteen =new Intent(MainActivity.this,BarififteenActivity.class);
                startActivity(barififteen);
                break;
            case R.id.barisixteen:
                Intent barisixteen =new Intent(MainActivity.this,BarisixteenActivity.class);
                startActivity(barisixteen);
                break;
        }


    }
}
