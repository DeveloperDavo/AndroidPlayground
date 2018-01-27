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

        BreedsService service = retrofit.create(BreedsService.class);
        Call<BreedsListResponse> jsonObject = service.getBreedsListResponse();

        jsonObject.enqueue(new Callback<BreedsListResponse>() {
            @Override
            public void onResponse(Call<BreedsListResponse> call, Response<BreedsListResponse> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "responseBody: " + response.body());
                } else {
                    Log.e(TAG, "Response unsuccessful. Response code:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<BreedsListResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: ", t);
            }
        });
    }

}
