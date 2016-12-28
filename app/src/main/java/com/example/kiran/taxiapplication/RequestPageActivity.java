package com.example.kiran.taxiapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kiran on 12/27/2016.
 */

public class RequestPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_page);
        TextView address_name_change = (TextView) findViewById(R.id.address_name);
        Intent intent_in = getIntent();
        Bundle b = intent_in.getExtras();
        String address_in = (String) b.get("address");
        address_name_change.setText(address_in);
    }
}