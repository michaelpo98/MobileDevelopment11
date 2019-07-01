package com.example.pratikummd11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Mendefenisikan MediaPlayer sebagai audioBacksound
    private MediaPlayer player;
    private Button lagu1, lagu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //ambil button dari activity_main.xmk
    lagu1 = findViewById(R.id.btnlagu1);
    lagu1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            playSound(1);
        }
    });

    lagu2 = findViewById(R.id.btnlagu2);
    lagu2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            playSound(2);
        }
    });
    }

    public void onPause() {
        try {
            super.onPause();
            player.pause();
        }catch (Exception e){
        }
    }

    private void playSound(int arg){
        try{
            if (player.isPlaying()){
                player.stop();
                player.release();
            }
        }catch (Exception e){
            Toast.makeText(this, "Masuk Exception", Toast.LENGTH_LONG).show();
        }

        if (arg == 1){
            Toast.makeText(this, "Sedang maikan lagu1", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.lagu);
        } else  if (arg == 2){
            Toast.makeText(this, "Sedang maikan lagu2", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.lagu2);
        }
        player.setLooping(false);
        player.start();
    }

}
