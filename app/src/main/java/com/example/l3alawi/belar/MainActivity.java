package com.example.l3alawi.belar;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.widget.Button;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends Activity {
    /* private GLSurfaceView glView;                   // use GLSurfaceView
    // Call back when the activity is started, to initialize the view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        glView = new GLSurfaceView(this);           // Allocate a GLSurfaceView
        glView.setRenderer(new MyGLRenderer(this)); // Use a custom renderer
        this.setContentView(glView);                // This activity sets to GLSurfaceView
    }

    // Call back when the activity is going into the background
    @Override
    protected void onPause() {
        super.onPause();
        glView.onPause();
    }

    // Call back after onPause()
    @Override
    protected void onResume() {
        super.onResume();
        glView.onResume();
    } */

    private static final String TAG = "MainActivity";

    static {
        if(OpenCVLoader.initDebug()){
            Log.d(TAG, "OpenCV mzyaaaaaaaan");
        }
        else{
            Log.d(TAG,"seeer t9awed");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
