package br.edu.ifto.formpessoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifto.formpessoa.entities.Pessoa;
import br.edu.ifto.formpessoa.enums.EstiloMusical;
import br.edu.ifto.formpessoa.enums.Sexo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_enviar = findViewById(R.id.bt_enviar);
        bt_enviar.setOnClickListener(v -> {
            Intent infoPessoa = new Intent(getActivity(),InfoPessoa.class);
            EditText nome = findViewById(R.id.input_nome);
            EditText idade = findViewById(R.id.input_idade);
            RadioGroup rgsexo = findViewById(R.id.rg_sexo);
            Sexo sexo = Sexo.OUTRO;
            switch (rgsexo.getCheckedRadioButtonId()) {
                case (R.id.rb_sexo_masculino):
                    sexo = Sexo.MASCULINO;
                    break;
                case (R.id.rb_sexo_feminino):
                    sexo = Sexo.FEMININO;
                    break;
                case (R.id.rb_sexo_outro):
                    sexo = Sexo.OUTRO;
                    break;
            }
            List<EstiloMusical> estilosMusicais = new ArrayList<>();
            CheckBox cb_rock = findViewById(R.id.cb_rock);
            if(cb_rock.isChecked()){
                estilosMusicais.add(EstiloMusical.ROCK);
            }
            CheckBox cb_sertanejo = findViewById(R.id.cb_sertanejo);
            if(cb_sertanejo.isChecked()){
                estilosMusicais.add(EstiloMusical.SERTANEJO);
            }
            CheckBox cb_pagode = findViewById(R.id.cb_pagode);
            if(cb_pagode.isChecked()){
                estilosMusicais.add(EstiloMusical.PAGODE);
            }
            CheckBox cb_forro = findViewById(R.id.cb_forro);
            if(cb_forro.isChecked()){
                estilosMusicais.add(EstiloMusical.FORRO);
            }
            CheckBox cb_outros = findViewById(R.id.cb_outros);
            if(cb_outros.isChecked()){
                estilosMusicais.add(EstiloMusical.OUTROS);
            }
            Pessoa pessoa = new Pessoa(
                    nome.getText().toString(),
                    Integer.parseInt(idade.getText().toString()),
                    sexo,
                    estilosMusicais
            );
            infoPessoa.putExtra("pessoa", pessoa);
            startActivity(infoPessoa);
        });

    }

    public Context getActivity(){
        return this;
    }

}