package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
        private static int SPLASH_DURATION = 2000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Thread closeActivity = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(SPLASH_DURATION);
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);

                        finish();

                    } catch (Exception e) {
                        e.getLocalizedMessage();
                    }
                }
            });
            closeActivity.start();
        }

        @Override
         protected void onRestart(){
            super.onRestart();
            MainActivity.this.finish();
        }

    }
