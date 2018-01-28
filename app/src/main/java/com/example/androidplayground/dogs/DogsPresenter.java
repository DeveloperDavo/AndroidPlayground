package com.example.androidplayground.dogs;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DogsPresenter {

    private static final String TAG = DogsPresenter.class.getSimpleName();

    private final DogsContract.View dogsView;
    private final BreedsService breedsService;

    public DogsPresenter(DogsContract.View dogsView, BreedsService breedsService) {
        this.dogsView = dogsView;
        this.breedsService = breedsService;
    }

    public void populateBreeds() {
        Call<BreedsListResponse> breedsListResponseCall = breedsService.getBreedsListResponse();

        breedsListResponseCall.enqueue(new Callback<BreedsListResponse>() {
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
