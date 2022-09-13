package com.example.it2019111_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPage extends AppCompatActivity {

    public Button btnBeach;
    public Button btnHistorical;
    public Button btnForest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        //To handle the beach button
        btnBeach = (Button) findViewById(R.id.btnBeach);
        btnBeach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPage.this, BeachPage.class);
                startActivity(intent);
            }
        });

        //To handle the historical button
        btnHistorical = (Button) findViewById(R.id.btnHistorical);
        btnHistorical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPage.this, historical.class);
                startActivity(intent);
            }
        });


        //To handle the forest button
        btnForest = (Button) findViewById(R.id.btnForest);
        btnForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPage.this, Forest.class);
                startActivity(intent);
            }
        });

        //To handle the culture button
        btnForest = (Button) findViewById(R.id.btnCulture);
        btnForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPage.this, Culture.class);
                startActivity(intent);
            }
        });


    }
}