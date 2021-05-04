package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvPantalla;
    double n1, n2, resultado;
    String operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt0(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"0");
    }
    public void bt1(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"1");
    }

    public void bt2(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"2");
    }

    public void bt3(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"3");
    }

    public void bt4(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"4");
    }

    public void bt5(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"5");
    }

    public void bt6(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"6");
    }

    public void bt7(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"7");
    }

    public void bt8(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"8");
    }

    public void bt9(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+"9");
    }

    public void btPunto(View view){
        tvPantalla =  (TextView) findViewById(R.id.tvPantalla);
        tvPantalla.setText(tvPantalla.getText()+".");
    }

    public  void pulsarNumeroUnoClick(View view){
        tvPantalla = (TextView) findViewById(R.id.tvPantalla);
        n1 = Double.parseDouble(tvPantalla.getText().toString());//Obtiene el numero de la pantall ay lo guarda en N1
        tvPantalla.setText(" "); //Vacia la pantalla, cuando se guarda el número
    }

    //Introducen el simbolo de la opeacion
    public void sumar(View view){
        operador = "+";
        pulsarNumeroUnoClick(view);
    }

    public void restar(View view){
        operador = "-";
        pulsarNumeroUnoClick(view);
    }

    public void multiplicar(View view){
        operador = "*";
        pulsarNumeroUnoClick(view);
    }

    public void dividir(View view){
        operador = "/";
        pulsarNumeroUnoClick(view);
    }

    /**
     * Recoje los datos de la pantalla, los mete en n2, y realiza las operaciones matematicas, segun el valor de la variable operador
     * @param view
     */
    public void btIgual(View view){
        tvPantalla = (TextView)findViewById(R.id.tvPantalla);
        n2 = Double.parseDouble(tvPantalla.getText().toString());
        if(operador.equals("+")){
            resultado =  n1 + n2;
        }   else  if(operador.equals("-")){
            resultado =  n1 - n2;
        }   else  if(operador.equals("*")){
            resultado =  n1 * n2;
        }   else  if(operador.equals("/")){
            resultado =  n1 / n2;
        }
        tvPantalla.setText(" " + resultado);
    }

}