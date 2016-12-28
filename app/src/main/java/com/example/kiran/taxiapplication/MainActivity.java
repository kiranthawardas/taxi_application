package com.example.kiran.taxiapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void requestPickup(View view) {
        Intent intent = new Intent(MainActivity.this, RequestPageActivity.class);
        String address = view.getTag().toString();
        intent.putExtra("address", address);
        startActivity(intent);
    }

    public void requestPickup_enter(View view) {
        Intent intent = new Intent(this, RequestPageActivity.class);
        EditText editText = (EditText) findViewById(R.id.enter_address);
        String message = editText.getText().toString();
        intent.putExtra("address", message);

        startActivity(intent);
    }
}
