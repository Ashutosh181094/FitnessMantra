package com.example.kiit.fitness1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    TextView textView;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView= (TextView) findViewById(R.id.textView4);
        textView1= (TextView) findViewById(R.id.textView5);
        Typeface Customfont=Typeface.createFromAsset(getAssets(), "fonts/pi.ttf");
        textView.setTypeface(Customfont);
        Typeface Customfont1=Typeface.createFromAsset(getAssets(), "fonts/To.ttf");
        textView1.setTypeface(Customfont1);
        Thread t=new Thread(){
            public void run(){
                try {
                    sleep(3000);
                } catch (InterruptedException e) {}
                finally {
                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        t.start();
    }
}
