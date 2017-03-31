package mx.incorporation.typhoon.dibujos;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        //.drawRect(left, top, right, bottom, paint)
       // paint.setColor(Color.RED);
       // canvas.drawRect(30, 30, 80, 80, paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(20, 20, 300, 300, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawRect(44, 44, 120, 120, paint);
        paint.setColor(Color.RED);
        canvas.drawRect(80, 80, 120, 120, paint);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(100, 100, 10, paint);




        Path trazo = new Path();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(470, 730, 199, paint);
        trazo.addCircle(470, 730, 200, Path.Direction.CCW);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(50);

        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Leonardo García Martínez - Grupo: 6IM8", trazo, 200, 70, paint);

    }

}
