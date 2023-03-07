package com.example.intents_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class OverviewActivity extends AppCompatActivity {
    private ArrayList<String> usernamesFakeDatabase = new ArrayList<>(
            Arrays.asList("kitkat","vincent","soy")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        LinearLayout linearLayout = findViewById(R.id.overview);
        TextView t = new TextView(getApplicationContext());


    }
}