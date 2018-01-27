package com.example.androidplayground.dogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.androidplayground.model.Repo;
import com.example.androidplayground.service.GitHubService;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.androidplayground.R;

public class DogsActivity extends AppCompatActivity {

    private static final String TAG = DogsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        Call<List<Repo>> repos = service.listRepos("developerdavo");

        repos.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                Log.d(TAG, "call: " + call);
                Log.d(TAG, "response: " + response);
                Log.d(TAG, "responseBody: " + response.body());
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                // TODO: error handling
            }
        });
    }

}
