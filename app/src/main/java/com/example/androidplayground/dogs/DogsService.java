package com.example.androidplayground.dogs;

import com.example.androidplayground.dogs.model.BreedsListObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogsService {
    @GET("api/breeds/list")
    Call<BreedsListObject> getBreedsListObject();
}
