package com.example.androidplayground.dogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.androidplayground.R;

public class DogsActivity extends AppCompatActivity implements DogsContract.View {

    private static final String TAG = DogsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);

        DogsPresenter dogsPresenter = new DogsPresenter(this);
        dogsPresenter.populateBreeds();
    }

}
