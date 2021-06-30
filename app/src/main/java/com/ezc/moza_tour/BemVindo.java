package com.ezc.moza_tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class BemVindo extends AppCompatActivity {

    ImageView logo, splashImage;
    TextView appName;
    LottieAnimationView lottieAnimationView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.bem_vindo);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.appName);
        splashImage = findViewById(R.id.back);
        lottieAnimationView = findViewById(R.id.lottie);

        splashImage.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        new Handler().postDelayed(() -> {
            Intent i = new Intent(BemVindo.this, ActivityMain.class);
            startActivity(i);
            finish();
        }, 4900);
    }
}