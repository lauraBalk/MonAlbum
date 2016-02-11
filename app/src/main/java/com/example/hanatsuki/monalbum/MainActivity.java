package com.example.hanatsuki.monalbum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageGauche = (ImageView) findViewById(R.id.imageView);
        imageGauche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connexionImageGauche = new Intent(MainActivity.this, Main2Activity.class);
                connexionImageGauche.putExtra(message, R.drawable.chocobo2);
                startActivity(connexionImageGauche);

            }
        });

        ImageView imageDroite = (ImageView) findViewById(R.id.imageView2);
        imageDroite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connexionImageDroite = new Intent(MainActivity.this, Main2Activity.class);
                connexionImageDroite.putExtra(message, R.drawable.chocobo2);
                startActivity(connexionImageDroite);

            }
        });

        ImageView imageBas = (ImageView) findViewById(R.id.imageView3);
        imageBas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connexionImageBas = new Intent(MainActivity.this, GeoMap.class);

                startActivity(connexionImageBas);

            }
        });
    }
}
