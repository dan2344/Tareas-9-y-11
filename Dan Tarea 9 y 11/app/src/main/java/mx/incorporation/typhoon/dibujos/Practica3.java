package mx.incorporation.typhoon.dibujos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class Practica3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica3);

        TextView texto = (TextView) findViewById(R.id.textView);
        Animation animacion = AnimationUtils.loadAnimation(this, R.Anim.animacion);
        texto.startAnimation(animacion);

    }

}
