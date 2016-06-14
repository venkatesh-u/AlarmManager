package com.example.venkatesh.broadcastreceiver;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread thread = new Thread() {
            public void run()
            {
                try
                {
                        sleep(1500);
                }
                catch (InterruptedException e)
                {
                        e.printStackTrace();
                }
                finally
                {
//                        Intent intent = new Intent("com.example.venkatesh.broadcastreceiver.MainActivity");
                        Intent intent1 = new Intent(SplashScreenActivity.this, MainActivity.class);
                        startActivity(intent1);
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d("closing","");
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
