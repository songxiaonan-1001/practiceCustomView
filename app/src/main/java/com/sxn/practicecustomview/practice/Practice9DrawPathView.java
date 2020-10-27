package com.sxn.practicecustomview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
public class Practice9DrawPathView extends View {
    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //使用 canvas.drawPath() 方法画心形

        Paint paint = new Paint();
        /**
         * Path 可以描述直线,二次曲线,三次曲线,圆,椭圆,弧形,矩形,圆角矩形
         * 把这些图形结合起来,就可以描述出很多复杂的图形
         * Path 有两类方法,一类是直接描述路径的,另一类是辅助的设置或计算
         */
        Path path = new Path();

        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);

        canvas.drawPath(path, paint);
    }
}
