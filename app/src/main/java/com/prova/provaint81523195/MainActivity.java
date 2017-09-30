package com.prova.provaint81523195;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Daniel Almeida on 29/09/2017.
 * RA 81523195
 */

public class MainActivity extends AppCompatActivity {

    Classificacao[] classificacao;
    Activity activity;
    ClassificacaoService classificacaoService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        classificacaoService = new ClassificacaoService();

        classificacao = null;
        activity = this;

        ListView tabelaClassificacao = (ListView) findViewById(R.id.classificacao_tabela);
        ClassificacaoAdapter adapter = new ClassificacaoAdapter(classificacao, activity);
        tabelaClassificacao.setAdapter(adapter);

        /**
         * Created by Daniel Almeida on 29/09/2017.
         * RA 81523195
         */
        tabelaClassificacao.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(activity, DetalheTime.class);
                intent.putExtra("TIME", classificacao[position]);

                startActivity(intent);
            }
        });
    }
}
