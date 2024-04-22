package com.example.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<landScape> recyclerViewData;
    RecyclerView recyclerViewLandScape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewData = getRecylerViewDatas();
        //4
        recyclerViewLandScape=findViewById(R.id.recyclerLand);
        //5
//        RecyclerView.LayoutManager layoutLinear=new LinearLayoutManager(this);
//        recyclerViewLand.setLayoutManager(layoutLinear);
//        RecyclerView.LayoutManager layoutLinearHorizon=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerViewLand.setLayoutManager(layoutLinearHorizon);
        RecyclerView.LayoutManager layoutLinearGrid=new GridLayoutManager(this,2);
        recyclerViewLandScape.setLayoutManager(layoutLinearGrid);
        //6
        landScapeAdapter=new LandScapeAdapter(this,recyclerViewData);
        //7
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }
    ArrayList<landScape>getRecylerViewDatas(){
        ArrayList<landScape>dsdulieu=new ArrayList<landScape>();
        landScape landScape=new landScape("meo2","Meooo meoo meoo");
        dsdulieu.add(landScape);
        dsdulieu.add(new landScape("meo1","Con mèo ngu ngốc"));
        dsdulieu.add(new landScape("meo3","Đáng yêu, ngọt ngào"));
        dsdulieu.add(new landScape("meo4","Cute phô mai que xin chào cả nhà"));
        return dsdulieu;
    }
}