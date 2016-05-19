package com.yclim.image;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean change = true;

    public void clickFunction(View view) {

        ImageView catImage = (ImageView) findViewById(R.id.cat1);

        if (change) {
            change = false;
            catImage.setImageResource(R.drawable.cat2); //Change Image
        } else {
            catImage.setImageResource(R.drawable.cat1);
            change = true;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
