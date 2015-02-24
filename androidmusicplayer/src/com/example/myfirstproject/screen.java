


package com.example.myfirstproject;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


/**
 * Created by nalanulusoyy on 7/10/14.
 */
public class screen extends Activity {


    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen);


        Thread screen = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    finish();
                } catch (Exception e) {

                }


            }
        };
        screen.start();
    }
}