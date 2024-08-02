package com.example.frenchteacherapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EnglishActivity extends AppCompatActivity {
 CardView colorEnglish,familyEnglish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_english);
        colorEnglish=findViewById(R.id.card_view_english_colors);
        familyEnglish=findViewById(R.id.card_view_english_family);


        colorEnglish.setOnClickListener(new View.OnClickListener() {
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
                                                // Start the ColorEnglishActivity after the animation
                                                Intent intent = new Intent(EnglishActivity.this, ColorEnglishActivity.class);
                                                startActivity(intent);
                                            }
                                        });
                            }
                        });
            }
        });
        familyEnglish.setOnClickListener(new View.OnClickListener() {
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
                                                // Start the FamilyEnglishActivity after the animation
                                                Intent intent = new Intent(EnglishActivity.this, FamilyEnglishActivity.class);
                                                startActivity(intent);
                                            }
                                        });
                            }

                        });

            }
        });

    }
}
