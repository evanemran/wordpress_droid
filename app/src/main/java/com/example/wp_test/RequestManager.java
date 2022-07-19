package com.example.wp_test;

import android.content.Context;

import com.example.wp_test.models.PostsResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class RequestManager {

    Context context;
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://codingwithevan.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public RequestManager(Context context) {
        this.context = context;
    }

    public void GetAllBlogs(ResponseListener<List<PostsResponse>> listener){
        GetPosts getPosts = retrofit.create(GetPosts.class);
        Call<List<PostsResponse>> call = getPosts.callPosts();
        call.enqueue(new Callback<List<PostsResponse>>() {
            @Override
            public void onResponse(Call<List<PostsResponse>> call, Response<List<PostsResponse>> response) {
                if (!response.isSuccessful()){
                    listener.didError(response.message());
                    return;
                }
                listener.didFetch(response.body(), response.message());
            }

            @Override
            public void onFailure(Call<List<PostsResponse>> call, Throwable t) {
                listener.didError(t.getMessage());
            }
        });
    }


    private interface GetPosts{
        @GET("wp-json/wp/v2/posts")
        Call<List<PostsResponse>> callPosts();
    }
}
