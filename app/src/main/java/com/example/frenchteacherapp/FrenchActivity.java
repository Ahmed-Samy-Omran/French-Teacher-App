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

public class FrenchActivity extends AppCompatActivity {
    CardView colorFrench,familyFrench;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_french);
        colorFrench=findViewById(R.id.card_view_french_colors);
        familyFrench=findViewById(R.id.card_view_french_family);


        colorFrench.setOnClickListener(new View.OnClickListener() {
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
                                                // Start the ColorFrenchActivity after the animation
                                                Intent intent = new Intent(FrenchActivity.this, ColorFranchActivity.class);
                                                startActivity(intent);
                                            }
                                        });
                            }
                        });
            }
        });
        familyFrench.setOnClickListener(new View.OnClickListener() {
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
                                                // Start the FamilyFrenchActivity after the animation
                                                Intent intent = new Intent(FrenchActivity.this, FamilyFranchActivity.class);
                                                startActivity(intent);
                                            }
                                        });
                            }
                        });
            }
        });
    }
}