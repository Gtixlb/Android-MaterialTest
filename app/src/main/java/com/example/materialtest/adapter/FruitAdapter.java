package com.example.materialtest.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.materialtest.R;
import com.example.materialtest.cardview.FruitActivity;
import com.example.materialtest.dto.Fruit;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private List<Fruit> fruitList;

    private Context context;

    public FruitAdapter(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context parentContext = parent.getContext();
        context = parentContext;
        View view = LayoutInflater.from(parentContext).inflate(R.layout.fruit_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.itemView.setOnClickListener(v -> {
            int position = viewHolder.getAdapterPosition();
            Fruit fruit = fruitList.get(position);
            Intent intent = new Intent(context, FruitActivity.class);
            intent.putExtra(FruitActivity.FRUIT_NAME, fruit.getName());
            intent.putExtra(FruitActivity.FRUIT_IMAGE_ID, fruit.getImageId());
            context.startActivity(intent);
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);
        holder.fruitName.setText(fruit.getName());
        // holder.fruitImage.setImageResource(fruit.getImageId());
//            Glide.with(getApplicationContext()).load(fruit.getImageId()).into(holder.fruitImage);
        Glide.with(context).load(fruit.getImageId()).into(holder.fruitImage);
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitImage = itemView.findViewById(R.id.fruitImage);
            fruitName = itemView.findViewById(R.id.fruitName);
        }

    }

}