package com.example.sargiskh.retrofitandroidpub.rest;

import com.example.sargiskh.retrofitandroidpub.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sargiskh on 9/26/2017.
 */

public interface MovieApiService {

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

}
