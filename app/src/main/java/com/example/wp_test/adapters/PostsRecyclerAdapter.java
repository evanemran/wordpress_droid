package com.example.wp_test.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wp_test.ClickListener;
import com.example.wp_test.R;
import com.example.wp_test.models.PostsResponse;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PostsRecyclerAdapter extends RecyclerView.Adapter<PostsRecyclerViewHolder>{

    Context context;
    List<PostsResponse> list;
    ClickListener<PostsResponse> listener;

    public PostsRecyclerAdapter(Context context, List<PostsResponse> list, ClickListener<PostsResponse> listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PostsRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostsRecyclerViewHolder(LayoutInflater.from(context).inflate(R.layout.list_posts, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostsRecyclerViewHolder holder, int position) {

        final PostsResponse response = list.get(position);
        holder.textView_title.setText(response.title.rendered);
        holder.textView_title.setSelected(true);
        holder.textView_desc.setText(response.yoast_head_json.description);
        holder.textView_author.setText("evanemran");

        holder.post_holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.didClick(response);
            }
        });

        Picasso.get().load(response.yoast_head_json.og_image.get(0).url).into(holder.imageView_post);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class PostsRecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView textView_title, textView_desc, textView_date, textView_author;
    ImageView imageView_post;
    CardView post_holder;

    public PostsRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView_post = itemView.findViewById(R.id.imageView_post);
        textView_title = itemView.findViewById(R.id.textView_title);
        textView_desc = itemView.findViewById(R.id.textView_desc);
        textView_date = itemView.findViewById(R.id.textView_date);
        textView_author = itemView.findViewById(R.id.textView_author);
        post_holder = itemView.findViewById(R.id.post_holder);
    }
}