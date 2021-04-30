package com.example.hometask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hometask.Adapter.Adapterhotel;
import com.example.hometask.Adapter.TopListAdapter;
import com.example.hometask.Adapter.VarietyAdapter;

public class MainActivity extends AppCompatActivity {

    String[] TopListItem = {"Max safety","Offers","Fastest Delivery","Takeaway","Ratings"};
    String[] varityitem = {"healthy","pizza","burger","thali","rolls","biryani","panner","chiken"};

    private  int[] img = { R.drawable.healthy , R.drawable.pizza ,
                  R.drawable.burger , R.drawable.thali ,
                  R.drawable.rols , R.drawable.biryani,
                  R.drawable.panner , R.drawable.chiken};

    String[] itemlast = {"sethi Dhaba","burger King","MC Donald","Birayani Special","rolls","Healthy Zaica","panner ka Wasta","pasta da Wasta"};
    String[] itemlastprice = {"$20","$50","$90","$20","$60","$20","$200","$250"};

    private  int[] imglast = { R.drawable.thali , R.drawable.burger ,
                  R.drawable.sec , R.drawable.biryani ,
                  R.drawable.rols , R.drawable.healthy,
                  R.drawable.panner , R.drawable.tri};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView TopList = (RecyclerView) findViewById(R.id.maintoplist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        TopList.setLayoutManager(layoutManager);
        TopList.setAdapter(new TopListAdapter(TopListItem));

        RecyclerView varity = (RecyclerView) findViewById(R.id.variety);
        RecyclerView.LayoutManager layoutManager1 = new GridLayoutManager(this,4);
        varity.setHasFixedSize(true);
        varity.setLayoutManager(layoutManager1);
        varity.setAdapter(new VarietyAdapter(img,varityitem));


        RecyclerView LastList = (RecyclerView) findViewById(R.id.hotels);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        LastList.setLayoutManager(layoutManager2);
        LastList.setAdapter(new Adapterhotel(imglast,itemlast,itemlastprice));
    }
}