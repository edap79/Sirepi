package com.edap.sirepi.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.edap.sirepi.MainActivity;

/**
 * Created by edap on 30/9/17.
 */
public class SplashActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
