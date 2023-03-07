package com.example.intents_example;

import androidx.annotation.Nullable;
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

        startActivityForResult(intentToApprovalActivity,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        System.out.println("Toelfmkrfm");
    }
}