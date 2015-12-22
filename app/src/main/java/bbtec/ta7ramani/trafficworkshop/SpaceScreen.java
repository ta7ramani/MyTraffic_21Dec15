package bbtec.ta7ramani.trafficworkshop;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpaceScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_screen);
        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SpaceScreen.this,MainActivity.class));
                finish();

            }
        }, 8000);

        MediaPlayer introMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.intro_tata);
        introMediaPlayer.start();
    } //Main Method
} // Main Class

