package com.example.hometask.Adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hometask.R;

import java.util.ArrayList;

public class VarietyAdapter extends RecyclerView.Adapter<VarietyAdapter.VarietyViewHolder> {

    private int[] img;
    String[] strings;
    public VarietyAdapter(int[] img , String[] strings){
        this.img = img;
        this.strings = strings;
    }

    @NonNull
    @Override
    public VarietyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.varietyrecyclelayout,parent,false);
        return new VarietyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VarietyViewHolder holder, int position) {
        int Title = img[position];
        String str = strings[position];
        holder.imageView.setImageResource(Title);
        holder.s.setText(str);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class VarietyViewHolder extends RecyclerView.ViewHolder{
            TextView s;
            ImageView imageView;
        public VarietyViewHolder(@NonNull View itemView) {
            super(itemView);
            s = itemView.findViewById(R.id.listname);
            imageView = itemView.findViewById(R.id.listimg);
        }
    }
}
