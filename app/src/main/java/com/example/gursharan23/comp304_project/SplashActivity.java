package com.example.gursharan23.comp304_project;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    public static final int Splash_Display_Time=2500;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        //Initializing view
        final ImageView logo=findViewById(R.id.logo_image);


        Drawable icon= ContextCompat.getDrawable(getApplicationContext(),R.drawable.logo);
        //         icon.setColorFilter(ContextCompat.getColor(getApplicationContext(),R.color.colorAccent),PorterDuff.Mode.MULTIPLY);
        Animation shake= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.shake);
        logo.startAnimation(shake);
        logo.setImageDrawable(icon);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent();
                intent.setClass(SplashActivity.this,MainActivity.class);

                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();

            }
        },Splash_Display_Time);

    }
}
