package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {


  private Paint mPaint = new Paint();
  private Path mPath = new Path();

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

//        练习内容：使用 canvas.drawPath() 方法画心形
    mPaint.setStyle(Paint.Style.FILL);
    mPath.addArc(200, 200, 400, 400, -225, 225);
    mPath.arcTo(400, 200, 600, 400, -180, 225, false);
    mPath.lineTo(400, 560);
//    mPath.close();
    canvas.drawPath(mPath, mPaint); // 绘制出 path 描述的图形（心形），大功告成

  }
}