package com.osna.project2;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, ageEditText, occupationEditText, addressEditText;
    private ArrayList<Person> personList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.editTextName);
        ageEditText = findViewById(R.id.editTextAge);
        occupationEditText = findViewById(R.id.editTextOccupation);
        addressEditText = findViewById(R.id.editTextAddress);

        Button addButton = findViewById(R.id.buttonAdd);
        Button listViewButton = findViewById(R.id.buttonListView);
        Button gridViewButton = findViewById(R.id.buttonGridView);
        Button recyclerViewButton = findViewById(R.id.buttonRecyclerView);


        personList = new ArrayList<>();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

            });
        listViewButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                intent.putParcelableArrayListExtra("personList", personList);
                startActivity(intent);
            }
            });
        gridViewButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                intent.putParcelableArrayListExtra("personList", personList);
                startActivity(intent);
            }
            });

        recyclerViewButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                intent.putParcelableArrayListExtra("personList", personList);
                startActivity(intent);
            }
            });
    }

    }