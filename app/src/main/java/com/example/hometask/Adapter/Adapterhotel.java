package com.example.hometask.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hometask.R;

public class Adapterhotel extends RecyclerView.Adapter<Adapterhotel.AdapterhotelViewHolder> {

    private int[] img;
    String[] strings;
    String[] stringsprice;
    public Adapterhotel(int[] img , String[] strings,String[] stringsprice){
        this.img = img;
        this.strings = strings;
        this.stringsprice = stringsprice;
    }

    @NonNull
    @Override
    public AdapterhotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.hotel,parent,false);
        return new AdapterhotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterhotelViewHolder holder, int position) {
        String name = strings[position];
        String price = stringsprice[position];
        int imgg = img[position];

        holder.imageView.setImageResource(imgg);
        holder.s.setText(name);
        holder.price.setText(price);

    }



    @Override
    public int getItemCount() {
        return img.length;
    }

    public class AdapterhotelViewHolder extends RecyclerView.ViewHolder{

        TextView s,price;
        ImageView imageView;
        public AdapterhotelViewHolder(@NonNull View itemView) {
            super(itemView);
            s = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            imageView = itemView.findViewById(R.id.img1);
        }
    }
}
