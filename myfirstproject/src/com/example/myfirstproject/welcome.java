package com.example.myfirstproject;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nalanulusoyy on 7/12/14.
 */
public class welcome extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT );

    }


    public void yazdir(View view) {

        final TextView cikti = (TextView) findViewById(R.id.text);
        cikti.setText(getString(R.string.write));
    }

}