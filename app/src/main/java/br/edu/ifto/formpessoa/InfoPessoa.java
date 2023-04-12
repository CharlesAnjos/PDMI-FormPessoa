package br.edu.ifto.formpessoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import br.edu.ifto.formpessoa.entities.Pessoa;

public class InfoPessoa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pessoa);
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        Pessoa pessoa = (Pessoa) getIntent().getSerializableExtra("pessoa");

        TextView detalhesPessoa = findViewById(R.id.detalhesPessoa);
        detalhesPessoa.append("\n");
        detalhesPessoa.append("Dados da Pessoa\n");
        detalhesPessoa.append("Nome: "+pessoa.getNome()+"\n");
        detalhesPessoa.append("Idade: "+pessoa.getIdade()+" anos\n");
        detalhesPessoa.append("Genero: "+pessoa.getSexo().toString()+"\n");
        detalhesPessoa.append("Dados da Pessoa\n");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //identificar a ação de voltar a tela
            case android.R.id.home:
                //encerra a activity
                finish();
                break;
        }

        return super.onOptionsItemSelected( item );
    }
}