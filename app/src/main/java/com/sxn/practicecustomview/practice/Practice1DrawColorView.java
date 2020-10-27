package com.sxn.practicecustomview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author CSV
 * @describe:
 * @date: 2020/10/23
 */
public class Practice1DrawColorView extends View {
    public Practice1DrawColorView(Context context) {
        super(context);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //使用 canvas.drawColor()方法 把View 涂成黄色
        canvas.drawColor(Color.YELLOW);
    }
}
