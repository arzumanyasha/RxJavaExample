package com.example.arturarzumanyan.rxjavaexample.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arturarzumanyan.rxjavaexample.R;
import com.example.arturarzumanyan.rxjavaexample.model.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    Context context;
    List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.post_layout, viewGroup, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder postViewHolder, int i) {
        postViewHolder.txt_author.setText(String.valueOf(postList.get(i).userId));
        postViewHolder.txt_title.setText(String.valueOf(postList.get(i).title));
        postViewHolder.txt_content.setText(new StringBuilder(postList.get(i).body.substring(0,20))
                .append("...").toString());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
