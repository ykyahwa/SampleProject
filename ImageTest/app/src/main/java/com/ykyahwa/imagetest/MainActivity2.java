package com.ykyahwa.imagetest;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Integer> imageViewId = new ArrayList<>();
    ArrayList<Integer> textViewId = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initializeIds();
        setMode();
    }

    private void initializeIds() {
        imageViewId.add(R.id.image1);
        imageViewId.add(R.id.image2);
        imageViewId.add(R.id.image3);
        imageViewId.add(R.id.image4);
        imageViewId.add(R.id.image5);
        imageViewId.add(R.id.image6);
        imageViewId.add(R.id.image7);
        imageViewId.add(R.id.image8);
        imageViewId.add(R.id.image9);
        imageViewId.add(R.id.image10);
        imageViewId.add(R.id.image11);
        imageViewId.add(R.id.image12);
        imageViewId.add(R.id.image13);
        imageViewId.add(R.id.image14);
        imageViewId.add(R.id.image15);
        imageViewId.add(R.id.image16);
        imageViewId.add(R.id.image17);
        imageViewId.add(R.id.image18);

        textViewId.add(R.id.text1);
        textViewId.add(R.id.text2);
        textViewId.add(R.id.text3);
        textViewId.add(R.id.text4);
        textViewId.add(R.id.text5);
        textViewId.add(R.id.text6);
        textViewId.add(R.id.text7);
        textViewId.add(R.id.text8);
        textViewId.add(R.id.text9);
        textViewId.add(R.id.text10);
        textViewId.add(R.id.text11);
        textViewId.add(R.id.text12);
        textViewId.add(R.id.text13);
        textViewId.add(R.id.text14);
        textViewId.add(R.id.text15);
        textViewId.add(R.id.text16);
        textViewId.add(R.id.text17);
        textViewId.add(R.id.text18);

    }

    private void setMode() {
        PorterDuff.Mode[] modes = PorterDuff.Mode.values();

        for (int i = 0; i < modes.length; i++) {
            PorterDuff.Mode mode = modes[i];
            ImageView iv = findViewById(imageViewId.get(i));
            iv.setImageResource(R.drawable.and); // Android 아이콘
//            iv.setImageResource(R.drawable.bro); // 형이 왜 거기서 나와 짤
            iv.setColorFilter(new PorterDuffColorFilter(0xffff0000, mode));

            ((TextView) findViewById(textViewId.get(i))).setText(mode.toString());
        }
    }


}
