package com.example.lab01;


import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

// Этот код служит как дополнение адаптера(здесь сохраняется текст к элементу)

public class CustomHolder extends RecyclerView.ViewHolder {
    private TextView ItemText;
    private ImageView ItemImage;

    public CustomHolder(View itemView) {
        super(itemView);
        ItemText = (TextView) itemView.findViewById(R.id.textView);
        ItemImage = (ImageView) itemView.findViewById(R.id.imageView2);
    }

    public void setItemText(String text) {
        ItemText.setText(text);
    }
    public void setItemImage(){ItemImage.setImageResource(R.drawable.picture);}
}