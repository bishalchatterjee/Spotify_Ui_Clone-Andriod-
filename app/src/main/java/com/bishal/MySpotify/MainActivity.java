package com.bishal.MySpotify;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Animation bounceAnim, expand;
    TextView startTime, endTime;
    ImageView play_iv,pause_iv, fav_iv, shuffle_iv, loop_iv, next_iv, prev_iv;
    SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        play_iv = findViewById(R.id.play_iv);
        pause_iv = findViewById(R.id.pause_iv);

        fav_iv = findViewById(R.id.fav_iv);
        shuffle_iv = findViewById(R.id.shuffle_iv);
        loop_iv = findViewById(R.id.loop_iv);
        prev_iv = findViewById(R.id.imageView6);
        next_iv = findViewById(R.id.imageView7);

        startTime = findViewById(R.id.textView2);
        endTime = findViewById(R.id.textView3);

        seekBar = findViewById(R.id.seekBar);


        //initial setup
        pause_iv.setVisibility(View.GONE);

        bounceAnim = AnimationUtils.loadAnimation(this, R.anim.bounce_interpolator);
        expand = AnimationUtils.loadAnimation(this, R.anim.expand_animation);





        play_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play_iv.setVisibility(View.GONE);
                pause_iv.setVisibility(View.VISIBLE);


            }
        });
        pause_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause_iv.setVisibility(View.GONE);
                play_iv.setVisibility(View.VISIBLE);

            }
        });


        next_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        prev_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




        fav_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fav_iv.startAnimation(bounceAnim);
            }
        });
        shuffle_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shuffle_iv.startAnimation(expand);
            }
        });
        loop_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loop_iv.startAnimation(expand);
            }
        });

    }


}