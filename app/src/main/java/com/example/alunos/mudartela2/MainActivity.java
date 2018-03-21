package com.example.alunos.mudartela2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText editText1;
    String editTextVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.butt1);
        editText1 = (EditText) findViewById(R.id.edit1);

    }
    public void btnClick1(View v){

        Intent i = new Intent(this, ActivityNova.class);
        editTextVal = editText1.getText().toString();
        i.putExtra("Value", editTextVal);
        startActivity(i);
        finish();
    }
}
