package com.example.l3alawi.belar;

import android.content.Context;
import android.view.MotionEvent;

import org.rajawali3d.renderer.RajawaliRenderer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by mohamed on 31/01/2017.
 */

public class rajawi extends RajawaliRenderer {

        public Context context;
    public rajawi(Context context){
    super(context);
        this.context = context;
        setFrameRate(60);
    }
    @Override
    protected void initScene() {

    }

    @Override
    public void onRenderSurfaceCreated(EGLConfig config, GL10 gl, int width, int height) {
        super.onRenderSurfaceCreated(config, gl, width, height);
    }

    @Override
    public void onTouchEvent(MotionEvent event) {

    }

    @Override
    public void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep, int xPixelOffset, int yPixelOffset) {

    }
}
