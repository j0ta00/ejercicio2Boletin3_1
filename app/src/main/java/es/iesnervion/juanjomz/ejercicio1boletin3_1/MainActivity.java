package es.iesnervion.juanjomz.ejercicio1boletin3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btnGreen);
        btn2=findViewById(R.id.btnRed);
        btn3=findViewById(R.id.btnBlue);
        btn1.setOnClickListener(x->cambiarColor(btn1));
        btn2.setOnClickListener(x->cambiarColor(btn2));
        btn3.setOnClickListener(x->cambiarColor(btn3));
    }

    public void cambiarColor(View v){

    }

}