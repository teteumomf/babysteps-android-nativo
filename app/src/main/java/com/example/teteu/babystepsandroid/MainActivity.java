package com.example.teteu.babystepsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner telainicial;
    Button confirmar;
    WebView view;
    ArrayAdapter adapter;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = new WebView(this);
        view.setVerticalScrollBarEnabled(false);
        ((LinearLayout)findViewById(R.id.linearlayout_principal)).addView(view);
        view.loadData(getString(R.string.txt_final),"text/html; charset=utf-8", "utf-8");

        telainicial = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this,R.array.spinner_inicial, android.R.layout.simple_spinner_dropdown_item);
        telainicial.setAdapter(adapter);

        confirmar = (Button)findViewById(R.id.btn_confirmar);
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String opcao = telainicial.getSelectedItem().toString();
                //Toast.makeText(getApplicationContext(), "Item escolhido: " + opcao, Toast.LENGTH_SHORT).show();
                ChamarActivity(opcao);
            }
        });
    }

    private void ChamarActivity(String op){
        if(op.equals("1 Mês")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 1;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("2 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 2;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("3 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 3;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("4 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 4;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("5 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 5;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("6 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 6;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("7 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 7;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("8 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 8;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("9 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 9;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("10 a 12 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 10;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("13 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 11;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("14 a 20 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 12;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("21 a 23 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 13;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }else if(op.equals("24 Meses")){
            Intent it = new Intent(this, QuestionarioActivity.class);
            Bundle bundle = new Bundle();
            i = 14;
            bundle.putInt("idade", i);
            it.putExtras(bundle);
            startActivity(it);
        }

    }
}
