package com.example.lesson611.data.remote;

import com.example.lesson611.data.models.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GhibliApi {

    @GET("films/")
    Call<List<Film>> getAllFilms();

    @GET("films/{id}")
    Call<Film> getFilms(@Path("id") String id);

}
