package com.osna.project2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class GridViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) GridView gridView = findViewById(R.id.gridView);
        String[] data = getIntent().getStringArrayExtra("data");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        gridView.setAdapter(adapter);
    }
}
