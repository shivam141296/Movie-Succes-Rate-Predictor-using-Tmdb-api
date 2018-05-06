package com.example.android.moviesapi.api;

import com.example.android.moviesapi.model.MoviesResponse;
import com.example.android.moviesapi.model.TrailerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by user on 28-04-2018.
 */

public interface Service {
    @GET("movie/popular")
    Call<MoviesResponse>getPopularMovies(@Query("api_key")String apikey);

    @GET("movie/top_rated")
    Call<MoviesResponse>getTopRatedMovies(@Query("api_key")String apikey);

    @GET("movie/{movie_id}/videos")
    Call<TrailerResponse>getMovieTrailer(@Path("movie_id")int id, @Query("api_key")String apikey);
}
