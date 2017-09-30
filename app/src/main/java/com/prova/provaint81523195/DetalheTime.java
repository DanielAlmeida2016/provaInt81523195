package com.prova.provaint81523195;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Daniel Almeida on 29/09/2017.
 * RA 81523195
 */

public class DetalheTime extends AppCompatActivity {

    private TextView time;
    private ImageView escudo;
    private TextView jogos;
    private TextView empates;
    private TextView derrotas;
    private TextView golsMarcados;
    private TextView golsSofridos;
    private TextView saldoGols;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_time);

        Intent intent = getIntent();
        Classificacao classificacao = (Classificacao) intent.getSerializableExtra("TIME");

        time = (TextView) findViewById(R.id.time_detalhe);
        escudo = (ImageView) findViewById(R.id.escudo_detalhe);
        jogos = (TextView) findViewById(R.id.jogos_detalhe);
        empates = (TextView) findViewById(R.id.empates_detalhe);
        derrotas = (TextView) findViewById(R.id.derrotas_detalhe);
        golsMarcados = (TextView) findViewById(R.id.gols_marcados_detalhe);
        golsSofridos = (TextView) findViewById(R.id.gols_sofridos_detalhe);
        saldoGols = (TextView) findViewById(R.id.saldo_gols_detalhe);

        Drawable drawable = Util.getDrawable(this, classificacao.getEmblemaGrande().toLowerCase());

        time.setText(classificacao.getTime());
        escudo.setImageDrawable(drawable);
        jogos.setText(classificacao.getJogos());
        empates.setText(classificacao.getEmpates());
        derrotas.setText(classificacao.getDerrotas());
        golsMarcados.setText(classificacao.getGolsMarcados());
        golsSofridos.setText(classificacao.getGolsSofridos());
        saldoGols.setText(classificacao.getSaldoGols());
    }
}
