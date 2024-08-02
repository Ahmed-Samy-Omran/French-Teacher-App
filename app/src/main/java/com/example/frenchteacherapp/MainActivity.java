package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
CardView franceImg,englishImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        franceImg=findViewById(R.id.card_view_french);
        englishImg=findViewById(R.id.card_view_english);

        franceImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a scale animation
                v.animate()
                        .scaleX(0.9f) // Scale down to 90% of the original size
                        .scaleY(0.9f)
                        .setDuration(100) // Duration of scaling down
                        .withEndAction(new Runnable() { // Action to perform after scaling down
                            @Override
                            public void run() {
                                v.animate()
                                        .scaleX(1f) // Scale back to original size
                                        .scaleY(1f)
                                        .setDuration(100) // Duration of scaling up
                                        .withEndAction(new Runnable() {
                                            @Override
                                            public void run() {
                                                // Start the FrenchActivity after the animation
                                                Intent intent = new Intent(MainActivity.this, FrenchActivity.class);
                                                startActivity(intent);
                                            }
                                        });
                            }
                        });
            }
        });

        englishImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a scale animation
                v.animate()
                        .scaleX(0.9f) // Scale down to 90% of the original size
                        .scaleY(0.9f)
                        .setDuration(100) // Duration of scaling down
                        .withEndAction(new Runnable() { // Action to perform after scaling down
                            @Override
                            public void run() {
                                v.animate()
                                        .scaleX(1f) // Scale back to original size
                                        .scaleY(1f)
                                        .setDuration(100) // Duration of scaling up
                                        .withEndAction(new Runnable() {
                                            @Override
                                            public void run() {
                                                // Start the FrenchActivity after the animation
                                                Intent intent = new Intent(MainActivity.this, EnglishActivity.class);
                                                startActivity(intent);
                                            }
                                        });
                            }
                        });
            }
        });

    }




}