package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

  private Paint mPaint = new Paint();
  private Path mPath = new Path();

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

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

    mPaint.setColor(Color.WHITE);

    canvas.drawLine(100, 50, 100, 600, mPaint);
    canvas.drawLine(100, 600, 1000, 600, mPaint);

    mPaint.setColor(Color.GREEN);

    canvas.drawRect(120, 596, 220, 599, mPaint);
    canvas.drawRect(240, 569, 340, 599, mPaint);
    canvas.drawRect(360, 576, 460, 599, mPaint);
    canvas.drawRect(480, 416, 580, 599, mPaint);
    canvas.drawRect(600, 280, 700, 599, mPaint);
    canvas.drawRect(720, 200, 820, 599, mPaint);
    canvas.drawRect(840, 220, 940, 599, mPaint);

    mPaint.setColor(Color.WHITE);
    mPaint.setTextSize(28);
    canvas.drawText("Froyo",136, 626, mPaint);
    canvas.drawText("GB",270, 626, mPaint);
    canvas.drawText("ICS",388, 626, mPaint);
    canvas.drawText("JB",510, 626, mPaint);
    canvas.drawText("KitKat",610, 626, mPaint);
    canvas.drawText("L",765, 626, mPaint);
    canvas.drawText("M",880, 626, mPaint);

    mPaint.setTextSize(48);
    canvas.drawText("直方图",450, 700, mPaint);

  }
}
