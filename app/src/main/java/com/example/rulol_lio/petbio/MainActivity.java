package com.example.rulol_lio.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView dogImg;
    private ImageView catImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogImg = (ImageView)findViewById(R.id.dogImageView);
        catImg = (ImageView)findViewById(R.id.catImageView);

        dogImg.setOnClickListener(this);
        catImg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dogImageView:
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Dufus");
                dogIntent.putExtra("bio", "Great dog. Loves people and barks and eats a lot!");
                startActivity(dogIntent);
                break;

            case R.id.catImageView:
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Jarvis");
                catIntent.putExtra("bio", "Great cat. Loves people and meows a lot!");
                startActivity(catIntent);
                break;
        }
    }
}
