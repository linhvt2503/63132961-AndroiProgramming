package com.example.usingrecyclerview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder>{
    Context context;
    ArrayList<landScape> lstData;

    public LandScapeAdapter(Context context, ArrayList<landScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent,false);
        ItemLandHolder viewHolder = new ItemLandHolder(vItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        //lấy đối tượng hiển thị
        landScape landScapeHienThi = lstData.get(position);
        //trích thông tin
        String caption = landScapeHienThi.getLandCaption();
        String tenFileAnh = landScapeHienThi.getLandImageFileName();
        //đăặt vào các trường thông tin của holder
        holder.tvCaption.setText(caption);
        //dặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageId = holder.itemView.getResources().getIdentifier(tenFileAnh,"mipmap", packageName);
        holder.ivLandScape.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivLandScape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandScape = itemView.findViewById(R.id.imageViewLand);

        }
    }
}
