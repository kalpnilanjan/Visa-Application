package com.example.android.fractal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Class myClass;

                    try {
                        myClass = Class.forName("com.example.android.fractal.LoginActivity");
                        Intent i = new Intent(SplashScreen.this,myClass);
                        startActivity(i);

                    }
                    catch (ClassNotFoundException c)
                    {
                        c.printStackTrace();
                    }
                }
            }
        };

        timer.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
