package com.example.materialtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.materialtest.cardview.AppBarLayoutActivity;
import com.example.materialtest.cardview.MaterialCardViewActivity;
import com.example.materialtest.cardview.SwipeRefreshLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toolBarBtn = findViewById(R.id.tool_bar_btn);
        toolBarBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ToolBarActivity.class);
            startActivity(intent);
        });

        Button drawerLayoutBtn = findViewById(R.id.drawer_layout_btn);
        drawerLayoutBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, DrawerLayoutActivity.class);
            startActivity(intent);
        });

        Button navViewBtn = findViewById(R.id.nav_view_btn);
        navViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NavigationViewActivity.class);
            startActivity(intent);
        });

        Button floatActionBtn = findViewById(R.id.float_action_btn);
        floatActionBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FloatingActionButtonActivity.class);
            startActivity(intent);
        });

        Button snackbarBtn = findViewById(R.id.snackbar_btn);
        snackbarBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SnackbarActivity.class);
            startActivity(intent);
        });

        Button coordinatorBtn = findViewById(R.id.coordinator_btn);
        coordinatorBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CoordinatorLayoutActivity.class);
            startActivity(intent);
        });

        Button cardViewBtn = findViewById(R.id.cardViewBtn);
        cardViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MaterialCardViewActivity.class);
            startActivity(intent);
        });

        Button refreshLayoutBtn = findViewById(R.id.refreshLayoutBtn);
        refreshLayoutBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SwipeRefreshLayoutActivity.class);
            startActivity(intent);
        });


    }

}