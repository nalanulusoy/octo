package com.example.welcomee;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
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
        setContentView(R.layout.main);
    }



    public void yaz(View view) {

        final TextView print = (TextView) findViewById(R.id.yeap);
        print.setText(getString(R.string.button));
    }

}
