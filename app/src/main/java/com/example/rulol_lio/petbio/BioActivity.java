package com.example.rulol_lio.petbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView bioImage;
    private TextView bioName;
    private TextView bioText;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        bioImage = (ImageView)findViewById(R.id.petBioImageView);
        bioName = (TextView)findViewById(R.id.nameID);
        bioText = (TextView)findViewById(R.id.bioTextID);

        extras = getIntent().getExtras();

        if (extras != null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name, bio);
        }
    }

    public void setUp(String name, String bio){
        if (name.equals("Dufus")){
            bioImage.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            bioName.setText(name);
            bioText.setText(bio);
        }
        else if (name.equals("Jarvis")){
            bioImage.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            bioName.setText(name);
            bioText.setText(bio);
        }
    }
}
