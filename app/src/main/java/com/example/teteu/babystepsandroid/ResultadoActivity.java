package com.example.teteu.babystepsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {

    Button btn;
    int resultado, qtd_erro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();
        Bundle dados = intent.getExtras();
        resultado = dados.getInt("resultado");
        qtd_erro = dados.getInt("erros");

        //Toast.makeText(getApplicationContext(), "valor resultado final: " + resultado, Toast.LENGTH_SHORT).show();

        if(resultado == 1){
            WebView view = new WebView(this);
            view.setVerticalScrollBarEnabled(false);
            ((LinearLayout)findViewById(R.id.linearlayout_resposta)).addView(view);
            view.loadData(getString(R.string.resposta1_part1) + qtd_erro + getString(R.string.resposta_partfinal),"text/html; charset=utf-8", "utf-8");
        }else if (resultado == 2){
            WebView view = new WebView(this);
            view.setVerticalScrollBarEnabled(false);
            ((LinearLayout)findViewById(R.id.linearlayout_resposta)).addView(view);
            view.loadData(getString(R.string.resposta2),"text/html; charset=utf-8", "utf-8");
        }else if(resultado == 3){
            WebView view = new WebView(this);
            view.setVerticalScrollBarEnabled(false);
            ((LinearLayout)findViewById(R.id.linearlayout_resposta)).addView(view);
            view.loadData(getString(R.string.resposta3) + qtd_erro + getString(R.string.resposta_partfinal),"text/html; charset=utf-8", "utf-8");
        }else if(resultado == 4){
            WebView view = new WebView(this);
            view.setVerticalScrollBarEnabled(false);
            ((LinearLayout)findViewById(R.id.linearlayout_resposta)).addView(view);
            view.loadData(getString(R.string.resposta4),"text/html; charset=utf-8", "utf-8");
        }else if(resultado == 5){
            WebView view = new WebView(this);
            view.setVerticalScrollBarEnabled(false);
            ((LinearLayout)findViewById(R.id.linearlayout_resposta)).addView(view);
            view.loadData(getString(R.string.resposta5),"text/html; charset=utf-8", "utf-8");
        }else{
            WebView view = new WebView(this);
            view.setVerticalScrollBarEnabled(false);
            ((LinearLayout)findViewById(R.id.linearlayout_resposta)).addView(view);
            view.loadData(getString(R.string.resposta6),"text/html; charset=utf-8", "utf-8");
        }


        btn = (Button)findViewById(R.id.btn_inicio);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChamarMainActivity();
            }
        });
    }

    private void ChamarMainActivity(){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
        finish();
    }


}
