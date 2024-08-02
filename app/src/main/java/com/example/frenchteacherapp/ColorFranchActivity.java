package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ColorFranchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_color_franch);
    }
    public void SayTheColorFranch(View view) {
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