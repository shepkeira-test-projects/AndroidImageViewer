package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int myCount = 1;
    private int myNum = 0;
    private TextView myShowCount;
    private ImageView myPic;

    int[] pics = {R.drawable.butterfly, R.drawable.forest, R.drawable.green, R.drawable.road};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myShowCount = (TextView) findViewById(R.id.imageCount);
        myPic = (ImageView) findViewById(R.id.imageView);
    }

    public void next(View view) {
        myNum++;
        myCount++;
        if (myNum >= 4) {
            myNum = 0;
            myCount = 1;
        }
        myPic.setImageResource(pics[myNum]);
        myShowCount.setText(Integer.toString(myCount) + " of 4");
    }

    public void prev(View view) {
        myNum--;
        myCount--;
        if (myNum < 0) {
            myNum = 3;
            myCount = 4;
        }
        myPic.setImageResource(pics[myNum]);
        myShowCount.setText(Integer.toString(myCount) + " of 4");
    }

    public void random(View view) {
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        myNum = rand.nextInt(4);
        myCount = myNum + 1;
        myPic.setImageResource(pics[myNum]);
        myShowCount.setText(Integer.toString(myCount) + " of 4");
    }


}
