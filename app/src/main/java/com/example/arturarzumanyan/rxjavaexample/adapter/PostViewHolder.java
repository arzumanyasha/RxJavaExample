package com.example.arturarzumanyan.rxjavaexample.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.arturarzumanyan.rxjavaexample.R;

public class PostViewHolder extends RecyclerView.ViewHolder{
    TextView txt_title, txt_content, txt_author;
    public PostViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_author = itemView.findViewById(R.id.txt_author);
        txt_content = itemView.findViewById(R.id.txt_content);
        txt_title = itemView.findViewById(R.id.txt_title);
    }
}
