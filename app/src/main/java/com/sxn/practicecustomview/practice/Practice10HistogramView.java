package com.sxn.practicecustomview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.sxn.practicecustomview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CSV
 * @describe:
 * @date: 2020/10/23
 */
public class Practice10HistogramView extends View {
    Paint mPaint = new Paint();
    Rect mRect = new Rect();

    List<WeatherModel> weatherModels = new ArrayList<>();

    {
        weatherModels.add(new WeatherModel(29, "Mon"));
        weatherModels.add(new WeatherModel(39, "Tue"));
        weatherModels.add(new WeatherModel(35, "Wed"));
        weatherModels.add(new WeatherModel(25, "Thu"));
        weatherModels.add(new WeatherModel(43, "Fri"));
        weatherModels.add(new WeatherModel(37, "Sat"));
        weatherModels.add(new WeatherModel(35, "Sun"));
    }

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //使用各种 canvas.drawXXX() 方法画直方图
        int x = 980, y = 560;

        // 绘制坐标系(横竖两条线)
        float[] coordinateSystem = {
                100, 60, 100, y,
                100, y, x, y
        };
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(2);
        canvas.drawLines(coordinateSystem, mPaint);

        // 绘制标题(绘制文字)
        String title = "一周温度变化";
        mPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setTextSize(48);
        canvas.drawText(title, getWidth() / 2, y + 140, mPaint);

        int start = 30;
        int width = 100;
        int gap = 20;
        int top;
        int bottom;
        int left = 100 + start;
        int right = left + width;

        for (int i = 0; i < weatherModels.size(); i++) {
            // 当前温度对应直方图数值「1 度对应 10 像素」
            top = y - weatherModels.get(i).temp * 10;
            // -1 为了露出 X 轴
            bottom = y - 1;
            if (i > 0) {
                left += width + gap;
                right += width + gap;
            }

            // 绘制文字（星期几）
            mPaint.setColor(Color.WHITE);
            mPaint.setTextSize(24);
            canvas.drawText(weatherModels.get(i).week, left + (right - left) / 2, y + 20, mPaint);

            // 绘制直方图
            if (40 <= weatherModels.get(i).temp) {
                mPaint.setColor(getResources().getColor(R.color.colorLv4));
            } else if (37 <= weatherModels.get(i).temp) {
                mPaint.setColor(getResources().getColor(R.color.colorLv3));
            } else if (35 <= weatherModels.get(i).temp) {
                mPaint.setColor(getResources().getColor(R.color.colorLv2));
            } else {
                mPaint.setColor(getResources().getColor(R.color.colorLv1));
            }
            mRect.set(left, top, right, bottom);
            canvas.drawRect(mRect, mPaint);
        }

    }

    private class WeatherModel {
        int temp;
        String week;

        WeatherModel(int temp, String week) {
            this.temp = temp;
            this.week = week;
        }
    }
}
