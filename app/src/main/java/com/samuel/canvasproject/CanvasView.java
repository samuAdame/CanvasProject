package com.samuel.canvasproject;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import java.util.Random;

public class CanvasView extends View {
    private Random rnd;
    private int width, height;
    private int color;
    private float startX, startY, stopX, stopY, strokeWidth;
    private int[] colores;
    private Paint pincel;

    public CanvasView(Activity activity){
        super(activity.getBaseContext());
        rnd = new Random();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pincel = new Paint();

        for(int i=0;i<5;i++){
            colores = getResources().getIntArray(R.array.colors);
            color = rnd.nextInt(colores.length);
            startX = rnd.nextInt(canvas.getWidth()-100)+50;
            startY = rnd.nextInt(canvas.getHeight()-100)+50;
            stopX = rnd.nextInt(canvas.getWidth()-100)+150;
            stopY = rnd.nextInt(canvas.getHeight()-100)+ 150;
            strokeWidth = rnd.nextInt(20);
            pincel.setColor(colores[color]);
            pincel.setStrokeWidth(strokeWidth);
            canvas.drawLine(startX,startY,stopX,stopY,pincel);
         }


    }
}
