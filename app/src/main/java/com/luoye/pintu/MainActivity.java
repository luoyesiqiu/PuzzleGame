package com.luoye.pintu;

import android.app.Activity;
import android.content.pm.FeatureInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends Activity {

    private static   int screenWidth;
    private static int screenHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024,1024);
        DisplayMetrics metrics =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(metrics);
        screenWidth = metrics.widthPixels;
        screenHeight = metrics.heightPixels;
        setContentView(new MainView(this));

    }

    public static int getScreenWidth() {
        return screenWidth;
    }

    public static int getScreenHeight() {
        return screenHeight;
    }

}
