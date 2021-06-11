package com.example.catjava;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholderApi {

    @GET("breeds")
    Call<List<Post>> getPosts();
}
