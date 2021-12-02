package com.fantatrail.bolognatrailteam.extension;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.fantatrail.bolognatrailteam.ui.FantaTrail;

public class SplashActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(SplashActivity.this, FantaTrail.class));
        finish();
    }
}