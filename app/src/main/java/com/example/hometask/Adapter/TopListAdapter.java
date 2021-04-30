package com.example.hometask.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hometask.R;

public class TopListAdapter extends RecyclerView.Adapter<TopListAdapter.TopListViewHolder> {

    private String[] Data;
    public TopListAdapter(String[] Data){
        this.Data = Data;
    }

    @NonNull
    @Override
    public TopListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.toplist,parent,false);
        return new TopListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopListViewHolder holder, int position) {

        String Title = Data[position];
        holder.title.setText(Title);
    }

    @Override
    public int getItemCount() {
        return Data.length;
    }

    public class TopListViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        public TopListViewHolder(@NonNull View itemView) {

            super(itemView);
            title = itemView.findViewById(R.id.topList);
        }
    }
}
