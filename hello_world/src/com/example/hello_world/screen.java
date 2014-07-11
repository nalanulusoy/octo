package com.example.hello_world;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by nalanulusoyy on 7/11/14.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by sirkeksalot on 10.07.2014.
 */
public class screen extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void yazdir(View view) {

        final TextView cikti = (TextView) findViewById(R.id.lala);
        cikti.setText(getString(R.string.butonum));
    }
}


