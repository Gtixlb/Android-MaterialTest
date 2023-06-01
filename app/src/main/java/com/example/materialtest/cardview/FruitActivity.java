package com.example.materialtest.cardview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.materialtest.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.stream.IntStream;

public class FruitActivity extends AppCompatActivity {

    public static final String FRUIT_NAME = "fruit_name";

    public static final String FRUIT_IMAGE_ID = "fruit_image_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        Intent intent = getIntent();
        String fruitName = intent.getStringExtra(FRUIT_NAME);
        int fruitImageId = intent.getIntExtra(FRUIT_IMAGE_ID, 0);
        Toolbar toolbar = findViewById(R.id.fruitToolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingToolbar);
        ImageView fruitImageView = findViewById(R.id.fruitImageView);
        TextView fruitContentText = findViewById(R.id.fruitContentText);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbarLayout.setTitle(fruitName);
        Glide.with(this).load(fruitImageId).into(fruitImageView);
        generateFruitContent(fruitName, fruitContentText);
    }

    private static void generateFruitContent(String fruitName, TextView fruitContentText) {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, 500).forEach(i -> stringBuilder.append(fruitName));
        fruitContentText.setText(stringBuilder.toString());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (android.R.id.home == itemId){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}