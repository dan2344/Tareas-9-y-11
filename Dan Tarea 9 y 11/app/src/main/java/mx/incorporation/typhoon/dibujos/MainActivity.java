package mx.incorporation.typhoon.dibujos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Uno, Dos, Tres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uno = (Button) findViewById(R.id.button1);
        Dos = (Button) findViewById(R.id.button2);
        Tres = (Button) findViewById(R.id.button3);

    }

    public void UNO(View miView){
        Intent envia = new Intent(this, Practica1.class);
        startActivity(envia);

    }
    public void DOS(View miView){
        Intent envia = new Intent(this, Practica2.class);
        startActivity(envia);

    }
    public void TRES(View miView){
        Intent envia = new Intent(this, Practica3.class);
        startActivity(envia);

    }
}
