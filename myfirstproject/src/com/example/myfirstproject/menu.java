package com.example.myfirstproject;


import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by nalanulusoyy on 7/11/14.
 */
public class menu extends ListActivity {

   ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ekran);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        String[] values = new String[]{
                "OPEN",
                "OPERATION"
        };
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(this, screen.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this, welcome.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }


    }
