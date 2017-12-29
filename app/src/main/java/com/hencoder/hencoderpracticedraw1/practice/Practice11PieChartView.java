package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

  private Paint mPaint = new Paint();

  public Practice11PieChartView(Context context) {
    super(context);
  }

  public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

    mPaint.setColor(Color.WHITE);
    canvas.drawLine(500, 400, 280, 140, mPaint);
    canvas.drawLine(280, 140, 150, 140, mPaint);

    mPaint.setColor(Color.RED);
    canvas.drawArc(200,100,800,700, -180, 120, true, mPaint);

    mPaint.setColor(Color.BLUE);
    canvas.drawArc(230,130,830,730, 70, 110, true, mPaint);

    mPaint.setColor(Color.CYAN);
    canvas.drawArc(230,130,830,730, 0, 8, true, mPaint);

    mPaint.setColor(Color.LTGRAY);
    canvas.drawArc(230,130,830,730, 10, 6, true, mPaint);

    mPaint.setColor(Color.GREEN);
    canvas.drawArc(230,130,830,730, 18, 50, true, mPaint);

    mPaint.setColor(Color.YELLOW);
    canvas.drawArc(230,130,830,730, -60, 58, true, mPaint);


  }
}
