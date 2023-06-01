package com.example.materialtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class CoordinatorLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);

        FloatingActionButton floatingActionButton = findViewById(R.id.coordinatorBtn);

        floatingActionButton.setOnClickListener(v -> {
//            Toast.makeText(this, "FAB clicked", Toast.LENGTH_SHORT).show();
            Snackbar.make(floatingActionButton, "Data deleted", Snackbar.LENGTH_SHORT)
                    .setAction("Undo", v1 -> {
                        Toast.makeText(this, "Data restored", Toast.LENGTH_SHORT).show();
                    }).show();

        });
    }
}