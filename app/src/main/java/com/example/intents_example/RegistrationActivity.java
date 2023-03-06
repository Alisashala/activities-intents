package com.example.intents_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void submitUsername(View view){
        //Intent going to ApprovalActivity
        Intent intentToApprovalActivity = new Intent(this, ApprovalActivity.class);

        EditText input = findViewById(R.id.editTextTextPersonName);
        String inputAsString = input.getText().toString();

        intentToApprovalActivity.putExtra("message",inputAsString);

        startActivity(intentToApprovalActivity);
    }
}