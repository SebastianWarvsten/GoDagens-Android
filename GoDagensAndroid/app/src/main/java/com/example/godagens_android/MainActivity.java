package com.example.godagens_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomizeFood(View view) {
        TextView headerTV = findViewById(R.id.header);
        headerTV.setText("New food surggested");
        headerTV.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        ImageView imageView = findViewById(R.id.imagefield);
        imageView.setImageResource(R.drawable.hotdog);
    }

}