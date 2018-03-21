package com.example.alunos.mudartela2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityNova extends AppCompatActivity {
    TextView textView;
    Button btn2;
    String valFromAct1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);

        btn2 = (Button) findViewById(R.id.butt2);
        textView = (TextView) findViewById(R.id.text2);
        valFromAct1 = getIntent().getExtras().getString("Value");
        textView.setText(valFromAct1);
    }
    public void btnClick2(View v){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
