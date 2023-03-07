package com.example.intents_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.OnNewIntentProvider;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ApprovalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approval);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

}

    public void returnReply(View view){
        finish();
    }

    public void accept(View view){
        Intent intentToOverview = new Intent(this, OverviewActivity.class);
        TextView textView = findViewById(R.id.button3);
        textView.setText("Accepted");
        startActivity(intentToOverview);
    }

}