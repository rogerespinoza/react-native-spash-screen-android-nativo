package com.appreactnative_69_6;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;
// -- splash_screen
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

import com.facebook.react.ReactActivity;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.launch_screen);
    
    setContentView(R.layout.launch_screen);

    new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
        Intent i = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(i);
        finish();
      }
    }, 1500);





  }
}
