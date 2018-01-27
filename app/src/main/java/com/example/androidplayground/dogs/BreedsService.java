package com.example.androidplayground.dogs;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BreedsService {
    @GET("api/breeds/list")
    Call<BreedsListResponse> getBreedsListResponse();
}
