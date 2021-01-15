package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    TextView mTitle,mDes,fecha,fect;
    public MyHolder(@NonNull View itemView) {
        super(itemView);

       //this.mImageView = itemView.findViewById(R.id.imageIv);
       this.mTitle= itemView.findViewById(R.id.titleIv);
       this.mDes = itemView.findViewById(R.id.descripcionV);
       this.fecha = itemView.findViewById(R.id.fechaV);
       this.fect = itemView.findViewById(R.id.fecha_select);

    }
}
