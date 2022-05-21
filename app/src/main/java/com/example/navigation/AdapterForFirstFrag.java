package com.example.navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterForFirstFrag extends RecyclerView.Adapter<AdapterForFirstFrag.MyViewHolder> {


    String[] list;

    public AdapterForFirstFrag(String[] list){
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterForFirstFrag.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterForFirstFrag.MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.
                card_view_editting_filter, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(list[position]);
    }



    @Override
    public int getItemCount() {
        return list.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.card_view_filters_text);
        }
    }
}