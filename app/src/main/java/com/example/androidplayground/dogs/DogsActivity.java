package com.example.androidplayground.dogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.androidplayground.dogs.model.BreedsListObject;

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
                .baseUrl("https://dog.ceo/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DogsService service = retrofit.create(DogsService.class);
        Call<BreedsListObject> jsonObject = service.getBreedsListObject();

        jsonObject.enqueue(new Callback<BreedsListObject>() {
            @Override
            public void onResponse(Call<BreedsListObject> call, Response<BreedsListObject> response) {
                Log.d(TAG, "call: " + call);
                Log.d(TAG, "response: " + response);
                Log.d(TAG, "responseBody: " + response.body());
            }

            @Override
            public void onFailure(Call<BreedsListObject> call, Throwable t) {
                // TODO: error handling
                Log.e(TAG, "call: " + call, t);
            }
        });
    }

}
