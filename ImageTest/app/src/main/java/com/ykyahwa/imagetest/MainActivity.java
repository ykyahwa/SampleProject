package com.ykyahwa.imagetest;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private ImageView image;

    PorterDuff.Mode[] modes = PorterDuff.Mode.values();
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        image = findViewById(R.id.image);


        findViewById(R.id.buttonRight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PorterDuff.Mode mode = modes[index];
                image.getDrawable().setColorFilter(new PorterDuffColorFilter(0xffff0000, mode));
                text.setText(mode.toString());

                if (index >= (modes.length -1)) {
                    index = 0;
                } else {
                    index++;
                }
            }
        });

        findViewById(R.id.buttonLeft).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PorterDuff.Mode mode = modes[index];
                image.getDrawable().setColorFilter(new PorterDuffColorFilter(0xffff0000, mode));
                text.setText(mode.toString());

                if (index <= 0) {
                    index = modes.length - 1;
                } else {
                    index--;
                }
            }
        });
    }
}
