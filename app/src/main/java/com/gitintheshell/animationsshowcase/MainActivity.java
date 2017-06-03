package com.gitintheshell.animationsshowcase;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.basic).setOnClickListener(new TransitionButtonClickListener(BasicAnimActivity.class));
        findViewById(R.id.image_transform).setOnClickListener(new TransitionButtonClickListener(ImageTransformActivity.class));
        findViewById(R.id.interpolator).setOnClickListener(new TransitionButtonClickListener(InterpolatorActivity.class));
        findViewById(R.id.color_interpolator).setOnClickListener(new TransitionButtonClickListener(ColorInterpolationActivity.class));
    }

    private class TransitionButtonClickListener implements View.OnClickListener {

        private Class<? extends Activity> clazz;

        public TransitionButtonClickListener(final Class<? extends Activity> clazz) {
            this.clazz = clazz;
        }

        @Override
        public void onClick(final View v) {
            final Activity activity = MainActivity.this;
            Intent intent = new Intent(activity, clazz);
            startActivity(intent);
        }
    }
}
