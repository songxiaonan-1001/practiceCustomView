package com.sxn.practicecustomview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author CSV
 * @describe:
 * @date: 2020/10/23
 */
public class Practice3DrawRectView extends View {
    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //使用 canvas.drawRect() 方法画矩形
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        /**
         * left,top,right,bottom 是矩形四条边的坐标
         */
        canvas.drawRect(100, 100, 500, 500, paint);
    }
}
