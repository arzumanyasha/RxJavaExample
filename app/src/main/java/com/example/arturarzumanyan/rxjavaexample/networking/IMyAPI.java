package com.example.arturarzumanyan.rxjavaexample.networking;

import com.example.arturarzumanyan.rxjavaexample.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {
    @GET("posts")
    Observable<List<Post>> getPosts();
}
