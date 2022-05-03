package com.example.navigation;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCapture;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {

    ArrayList<Image> previews;
    ArrayList<String> comments;
    Context context;

    public RVAdapter(Context ct, ArrayList<Image> images, ArrayList<String> comments){
        this.comments=comments;
        this.previews=images;
        this.context=ct;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.comments.setText(comments.get(position));
        //holder.images.setImageResource(position);
    }

    @Override
    public int getItemCount() {
        //return previews.size();
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView comments;
        ImageView images;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            comments= itemView.findViewById(R.id.comments_textView);
            images = itemView.findViewById(R.id.preview_photo);

        }
    }
}