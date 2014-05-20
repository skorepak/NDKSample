package com.skorepak.ndksample.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    static {
        System.loadLibrary("myLib");
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long startTime = System.currentTimeMillis();
                Log.i("NDK", "Start");
                Log.i("NDK", "Java: " + compute());
                long middleTime = System.currentTimeMillis();
                Log.i("NDK", "Middle");
                Log.i("NDK", "Ndk: " + getStringFromNative());
                long endTime = System.currentTimeMillis();
                Log.i("NDK", "End");
                Log.i("NDK", String.format("Start: %d, middle: %d, end: %d",startTime, middleTime, endTime));
                ((TextView) findViewById(R.id.text_view)).setText(String.format("Java: %dms\nNDK:  %dms", middleTime - startTime, endTime - middleTime));
            }
        });
    }



    public int compute() {
        int i, j, x = 0;
        int value = 100000;
        for (i = 0; i < value; i++) {
            for (j = 0; j < value; j++) {
                if (i > j*j) {
                    x++;
                }
            }
        }
        return x;
    }

    public native int getStringFromNative();
}
