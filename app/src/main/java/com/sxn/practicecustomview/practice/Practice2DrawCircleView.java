package com.sxn.practicecustomview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author CSV
 * @describe:
 * @date: 2020/10/23
 */
public class Practice2DrawCircleView extends View {
    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //使用 canvas.drawCircle()方法画圆
        //1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为20的空心圆
        Paint paint = new Paint();
        canvas.drawCircle(300, 300, 150, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(650, 300, 150, paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300, 650, 150, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(30);
        canvas.drawCircle(650, 650, 150, paint);

    }
}
