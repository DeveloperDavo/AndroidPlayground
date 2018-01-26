package com.example.androidplayground.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidplayground.R;
import com.example.androidplayground.dogs.DogsActivity;

public class HomeActivity extends AppCompatActivity implements HomeContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button dogsButton = findViewById(R.id.btn_dogs);
        dogsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDogsScreen();
            }
        });
    }

    @Override
    public void showDogsScreen() {
        Intent intent = new Intent(this, DogsActivity.class);
        startActivity(intent);
    }
}
