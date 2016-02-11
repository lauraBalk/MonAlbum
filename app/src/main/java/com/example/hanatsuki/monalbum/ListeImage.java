package com.example.hanatsuki.monalbum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.io.File;

public class ListeImage extends AppCompatActivity {
    public static String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_image);
        TextView chocobo2 = (TextView) findViewById(R.id.textView);
        chocobo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connexionChocobo2 = new Intent(ListeImage.this, Main2Activity.class);
                connexionChocobo2.putExtra(message, R.drawable.chocobo2);
                startActivity(connexionChocobo2);
            }
        });

        TextView chocobo3 = (TextView) findViewById(R.id.textView2);
        chocobo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connexionChocobo3 = new Intent(ListeImage.this, Main2Activity.class);
                connexionChocobo3.putExtra(message, R.drawable.chocobo3);
                startActivity(connexionChocobo3);
            }
        });


    }
}
