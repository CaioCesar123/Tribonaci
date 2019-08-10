package com.example.tribonaci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Tribonaci(View v){
        EditText editText = findViewById(R.id.Numero);
        int Numero = Integer.parseInt(editText.getText().toString());
        int valor = (new Tribonacci(Numero).tribo(Numero));
        Toast.makeText(this,String.valueOf(valor),Toast.LENGTH_LONG).show();

    }
}
