package com.example.gaja.SMART_TASK_MANAGER;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash_screen extends Activity {

    private static int SPLASH_TIME_OUT = 6000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ImageView griveLogo = (ImageView) findViewById(R.id.splashimg);
        Animation logoFadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        griveLogo.startAnimation(logoFadeIn);
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(splash_screen.this, login.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);

        }
}
