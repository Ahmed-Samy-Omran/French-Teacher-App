package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FamilyEnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_family_english);

    }
    public void SayTheFamilyEnglish(View view) {
        // Cast the view to a CardView instead of Button
        CardView clicked_card = (CardView) view;

        // Get the tag from the CardView, which should correspond to the sound file name
        int soundResourceId = getResources().getIdentifier(
                clicked_card.getTag().toString(),
                "raw",
                getPackageName()
        );

        // Create and start the MediaPlayer with the obtained sound resource
        MediaPlayer mediaPlayer = MediaPlayer.create(this, soundResourceId);
        mediaPlayer.start();
    }
}