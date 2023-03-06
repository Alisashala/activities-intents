package com.example.intents_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ApprovalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approval);
        Intent intentFromRegistration = getIntent();

        String greeting = intentFromRegistration.getStringExtra("message");
        Toast.makeText(getApplicationContext(),greeting,Toast.LENGTH_LONG).show();
    }

    public void returnReply(View view){
    }
}