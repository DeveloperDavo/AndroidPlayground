package com.example.androidplayground.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidplayground.R;
import com.example.androidplayground.dogs.DogsActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void showDogsScreen(View view) {
        Intent intent = new Intent(this, DogsActivity.class);
        startActivity(intent);
    }
}
