package com.example.l3alawi.belar;

import android.graphics.SurfaceTexture;

import org.rajawali3d.renderer.RajawaliRenderer;

/**
 * Created by mohamed on 31/01/2017.
 */

public class Rajawali extends RajawaliRenderer {


    @Override
    protected void initScene() {

    }

    @Override
    public void onRenderSurfaceDestroyed(SurfaceTexture surface) {
        super.onRenderSurfaceDestroyed(surface);
    }
}
