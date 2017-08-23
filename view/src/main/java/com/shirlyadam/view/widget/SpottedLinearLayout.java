package com.shirlyadam.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Description：com.shirlyadam.view.widget <br>
 * Author：Adam <br>
 * Date：2017/8/23 11:29 <br>
 */

public class SpottedLinearLayout extends LinearLayout {

    private Paint mPaint;

    public SpottedLinearLayout(Context context) {
        super(context);
        init();
    }

    public SpottedLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SpottedLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(1);
        mPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawCircle(100, 100, 10, mPaint);
        canvas.drawCircle(300, 200, 20, mPaint);
        canvas.drawCircle(400, 500, 40, mPaint);

    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

    }
}
