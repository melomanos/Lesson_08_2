package com.example.androidfilippov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class EndlessTransition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endless_transition);
        Random random = new Random();

        final Button backBtn = (Button) findViewById(R.id.backBtn);
        final Button forwardBtn = (Button) findViewById(R.id.forwardBtn);
        final TextView randomImage = (TextView) findViewById(R.id.randomImage);

        randomImage.setText(String.valueOf(random.nextInt(100) + 1));

        forwardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndlessTransition.this, EndlessTransition.class);
                startActivity(intent);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
