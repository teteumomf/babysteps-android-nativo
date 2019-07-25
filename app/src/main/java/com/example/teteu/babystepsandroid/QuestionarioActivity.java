package com.example.teteu.babystepsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import controller.Calculo;

public class QuestionarioActivity extends AppCompatActivity {

    Button btn1, btn2;
    Spinner spn1, spn2, spn3, spn4, spn5, spn6, spn7;
    ArrayAdapter adapter;
    String a, b, c, d, e, f, g, selec = "Selecione", sim = "Sim", nao = "Não";
    Calculo calc;
    int contador, erroHabDesenv, resultado_final, id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent it = getIntent();
        Bundle idade = it.getExtras();
        id = idade.getInt("idade");

        if(id == 1)
            setContentView(R.layout.activity_um_mes);
        else if(id == 2)
            setContentView(R.layout.activity_dois_meses);
        else if(id == 3)
            setContentView(R.layout.activity_tres_meses);
        else if(id == 4)
            setContentView(R.layout.activity_quatro_meses);
        else if(id == 5)
            setContentView(R.layout.activity_cinco_meses);
        else if(id == 6)
            setContentView(R.layout.activity_seis_meses);
        else if(id == 7)
            setContentView(R.layout.activity_sete_meses);
        else if(id == 8)
            setContentView(R.layout.activity_oito_meses);
        else if(id == 9)
            setContentView(R.layout.activity_nove_meses);
        else if(id == 10)
            setContentView(R.layout.activity_dez_a_doze_meses);
        else if(id == 11)
            setContentView(R.layout.activity_treze_meses);
        else if(id == 12)
            setContentView(R.layout.activity_quat_a_vinte_meses);
        else if(id == 13)
            setContentView(R.layout.activity_vinte_a_vintetres_meses);
        else
            setContentView(R.layout.activity_vinte_quatro_meses);

        //Toast.makeText(getApplicationContext(), "valor idade: " + id, Toast.LENGTH_SHORT).show();

        btn1 = (Button)findViewById(R.id.btn_inicio);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChamarMainActivity();
            }
        });

        spn1 = (Spinner)findViewById(R.id.spinner_UmMes_Primeira);
        adapter = ArrayAdapter.createFromResource(this, R.array.questionario, android.R.layout.simple_spinner_dropdown_item);
        spn1.setAdapter(adapter);

        spn2 = (Spinner)findViewById(R.id.spinner_UmMes_Segunda);
        adapter = ArrayAdapter.createFromResource(this, R.array.questionario, android.R.layout.simple_spinner_dropdown_item);
        spn2.setAdapter(adapter);

        spn3 = (Spinner)findViewById(R.id.spinner_UmMes_Terceira);
        adapter = ArrayAdapter.createFromResource(this, R.array.questionario, android.R.layout.simple_spinner_dropdown_item);
        spn3.setAdapter(adapter);

        spn4 = (Spinner)findViewById(R.id.spinner_UmMes_Quarta);
        adapter = ArrayAdapter.createFromResource(this, R.array.questionario, android.R.layout.simple_spinner_dropdown_item);
        spn4.setAdapter(adapter);

        spn5 = (Spinner)findViewById(R.id.spinner_UmMes_Quinta);
        adapter = ArrayAdapter.createFromResource(this, R.array.questionario, android.R.layout.simple_spinner_dropdown_item);
        spn5.setAdapter(adapter);

        spn6 = (Spinner)findViewById(R.id.spinner_UmMes_Sexta);
        adapter = ArrayAdapter.createFromResource(this, R.array.questionario, android.R.layout.simple_spinner_dropdown_item);
        spn6.setAdapter(adapter);

        spn7 = (Spinner)findViewById(R.id.spinner_UmMes_Setima);
        adapter = ArrayAdapter.createFromResource(this, R.array.questionario, android.R.layout.simple_spinner_dropdown_item);
        spn7.setAdapter(adapter);

        btn2 = (Button)findViewById(R.id.btn_confirmar);

    }

    public void Resultado(View view){

        a = spn1.getSelectedItem().toString();
        b = spn2.getSelectedItem().toString();
        c = spn3.getSelectedItem().toString();
        d = spn4.getSelectedItem().toString();
        e = spn5.getSelectedItem().toString();
        f = spn6.getSelectedItem().toString();
        g = spn7.getSelectedItem().toString();

        if((a.equals("Selecione")) || (b.equals("Selecione")) || (c.equals("Selecione")) || (d.equals("Selecione")) || (e.equals("Selecione")) || (f.equals("Selecione")) || (g.equals("Selecione"))){
            Toast.makeText(getApplicationContext(), getString(R.string.erro_quest), Toast.LENGTH_SHORT).show();
        }
        else {
            //cont = calc.Questions(a, b, c, d, e, f, g);
            calc = new Calculo();
            contador = calc.Questions(a, b, c, d, e, f, g);
            //Toast.makeText(getApplicationContext(), "valor contador: " + contador, Toast.LENGTH_SHORT).show();
            erroHabDesenv = calc.QtdErroHabDesenvolv();
            //Toast.makeText(getApplicationContext(), "valor contador: " + erroHabDesenv, Toast.LENGTH_SHORT).show();
            resultado_final = calc.resultado(contador, erroHabDesenv);
            //Toast.makeText(getApplicationContext(), "valor resultado final: " + resultado_final, Toast.LENGTH_SHORT).show();

            ChamarResultadoActivity(resultado_final, erroHabDesenv);
        }

    }
    private void ChamarMainActivity(){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }

    private void ChamarResultadoActivity(int r, int error){
        Intent intent = new Intent(this, ResultadoActivity.class);
        Bundle bundle = new Bundle();
        int result = r;
        int erro = error;

        bundle.putInt("resultado", result);
        bundle.putInt("erros", erro);
        intent.putExtras(bundle);

        startActivity(intent);
    }

}
