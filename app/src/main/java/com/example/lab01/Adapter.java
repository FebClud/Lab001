package com.example.lab01;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;

import android.graphics.Color;

// Адаптер нужен чтобы правильно реализовать список для конкретно нашей задачи

public class Adapter extends RecyclerView.Adapter<CustomHolder> {
    private LayoutInflater LInflater;
    public int Count;

    public Adapter(Context context, int count) {
        LInflater = LayoutInflater.from(context);
        Count = count;
    }

    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CustomHolder(LInflater.inflate(R.layout.item_res, parent, false));
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) { // Метод для создания элемента списка
        if (position % 2 == 0) { // Если позиция элемента четная фон белый, иначе серый
            holder.itemView.setBackgroundColor(Color.WHITE);
        } else {
            holder.itemView.setBackgroundColor(Color.GRAY);
        }
        holder.setItemText(IntoText.digitsToText(position + 1)); // Устанавливаем текст для элемента
        holder.setItemImage();
    }

    @Override
    public int getItemCount() {
        return Count;
    }
}