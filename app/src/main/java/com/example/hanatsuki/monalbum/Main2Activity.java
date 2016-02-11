package com.example.hanatsuki.monalbum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int message=intent.getIntExtra(MainActivity.message, 0);
        ImageView image = (ImageView) findViewById(R.id.imageView4);
        image.setImageResource(message);
        Button bouton1 = (Button) findViewById(R.id.button);
        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main2Activity.this.finish();

            }
        });


    }
}
