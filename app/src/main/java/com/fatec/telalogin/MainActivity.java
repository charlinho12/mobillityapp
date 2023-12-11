package com.fatec.telalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    private SearchView EdtMapa;
    private ImageView ImgMapaBsb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImgMapaBsb = findViewById(R.id.ImgMapaBsb);
        EdtMapa = findViewById(R.id.EdtMapa);

    }
}