package com.example.pratikummd11_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audioBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioBackground = MediaPlayer.create(this, R.raw.lagu);
        audioBackground.setLooping(true);
        audioBackground.setVolume(1,1);
        audioBackground.start();
    }
}
