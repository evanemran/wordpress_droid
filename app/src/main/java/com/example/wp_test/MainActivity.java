package com.example.wp_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.wp_test.adapters.PostsRecyclerAdapter;
import com.example.wp_test.models.PostsResponse;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView_posts;
    PostsRecyclerAdapter adapter;
    RequestManager manager;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_posts = findViewById(R.id.recycler_posts);

        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading...");

        manager = new RequestManager(this);
        dialog.show();
        manager.GetAllBlogs(new ResponseListener<List<PostsResponse>>() {
            @Override
            public void didFetch(List<PostsResponse> response, String message) {
                dialog.dismiss();
                recyclerView_posts.setHasFixedSize(true);
                recyclerView_posts.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
                adapter = new PostsRecyclerAdapter(MainActivity.this, response, clickListener);
                recyclerView_posts.setAdapter(adapter);
            }

            @Override
            public void didError(String message) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

    }

    ClickListener<PostsResponse> clickListener = new ClickListener<PostsResponse>() {
        @Override
        public void didClick(PostsResponse data) {
            startActivity(new Intent(MainActivity.this, ArticleActivity.class)
            .putExtra("data", data));
        }
    };
}