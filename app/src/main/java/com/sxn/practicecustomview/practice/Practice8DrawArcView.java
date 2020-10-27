package com.sxn.practicecustomview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/**
 * @author CSV
 * @describe:
 * @date: 2020/10/23
 */
public class Practice8DrawArcView extends View {
    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //使用 canvas.drawArc() 方法画圆弧和扇形

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        /**
         * drawArc()是使用一个椭圆来描述弧形的.
         * left,top,right,bottom 描述的是这个弧形所在的椭圆
         * startAngle 是弧形的起始角度(x轴正方形,即正右方向,是0度的位置,顺时针为正角度)
         * sweepAngle 是弧形划过的角度
         * useCenter 表示是否连接到圆心,如果连接到圆心,就是扇形,如果不连接到圆心,就是扇形
         */
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint);
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint);
        //画线模式
        paint.setStyle(Paint.Style.STROKE);
        //绘制不封口的弧形
        canvas.drawArc(200, 100, 800, 500, 180, 60, true, paint);
    }
}
