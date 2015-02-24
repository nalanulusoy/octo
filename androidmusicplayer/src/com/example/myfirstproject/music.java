package com.example.myfirstproject;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nalanulusoy on 15.07.2014.
 */
public class music  extends Activity{

    MediaPlayer mediaPlayer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        mediaPlayer= MediaPlayer.create(this,R.raw.tarkan);
    }

    public void Start(View view){

        this.mediaPlayer.start();
    }

    public void Stop(View view) {
        if(this.mediaPlayer.isPlaying()) {
            this.mediaPlayer.pause();
            this.mediaPlayer.seekTo(0);
        }
    }

    @Override
    protected void onDestroy() {
        mediaPlayer.stop();
        super.onDestroy();
    }
}

