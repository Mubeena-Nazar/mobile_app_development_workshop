package com.example.adichpoyiguyss;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = (Button) findViewById(R.id.playsong_1);
        b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.sri);
                        mp.start();
                    }
        });

        Button b2 = (Button) findViewById(R.id.playsong_2);
        b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp= MediaPlayer.create(MainActivity.this,R.raw.pp);
                        mp.start();
                }
        });
    }
}