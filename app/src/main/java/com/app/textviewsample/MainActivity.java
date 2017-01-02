package com.app.textviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView animatedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animatedTextView= (TextView) findViewById(R.id.animatedTextView);
        animatedTextView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.sample));
    }
}
