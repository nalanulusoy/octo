package com.example.hello_world;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */


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
                finally {
                    Intent i = new Intent(getBaseContext(), screen.class);
                    startActivity(i);
                }
            }
        };
        screen.start();
    }



    }



