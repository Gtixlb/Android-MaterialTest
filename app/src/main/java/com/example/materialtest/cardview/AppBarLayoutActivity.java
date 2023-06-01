package com.example.materialtest.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.materialtest.R;
import com.example.materialtest.adapter.FruitAdapter;
import com.example.materialtest.dto.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class AppBarLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout);

        Toolbar toolbar = findViewById(R.id.appBarToolBar);
        setSupportActionBar(toolbar);

        initFruits();
        RecyclerView recyclerView = findViewById(R.id.appBarRecyclerView);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(tFruitList);
        recyclerView.setAdapter(adapter);
    }

    private List<Fruit> tFruitList = new ArrayList<>();

    private static List<Fruit> fruits = new ArrayList<>();


    static {
        fruits.add(new Fruit("Apple", R.drawable.apples));
        fruits.add(new Fruit("Orange", R.drawable.oranges));
        fruits.add(new Fruit("Pina", R.drawable.pina));
        fruits.add(new Fruit("Pear", R.drawable.pears));
        fruits.add(new Fruit("Blueberry", R.drawable.blueberries));
        fruits.add(new Fruit("Pitayya", R.drawable.pitaya));
        fruits.add(new Fruit("Tomato", R.drawable.tomatoes));

    }

    private void initFruits() {
        tFruitList.clear();
        IntStream.range(1, 50).forEach(i -> {
            Random random = new Random();
            int index = random.nextInt(fruits.size());
            tFruitList.add(fruits.get(index));
        });
    }


}