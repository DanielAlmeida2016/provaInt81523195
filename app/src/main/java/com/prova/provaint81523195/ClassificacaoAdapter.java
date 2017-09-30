package com.prova.provaint81523195;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Daniel Almeida on 29/09/2017.
 * RA 81523195
 */

public class ClassificacaoAdapter extends BaseAdapter{

    private Classificacao[] tabelaClassificacao;
    private Activity activity;

    public ClassificacaoAdapter(Classificacao[] classificacaos, Activity activity){
        this.tabelaClassificacao = classificacaos;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return tabelaClassificacao.length;
    }

    @Override
    public Object getItem(int position) {
        return tabelaClassificacao[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.linha_classificacao, parent, false);
            TextView posicao = (TextView) view.findViewById(R.id.posicao);
            ImageView escudo = (ImageView) view.findViewById(R.id.escudo);
            TextView time = (TextView) view.findViewById(R.id.time);
            TextView pontos = (TextView) view.findViewById(R.id.pontos);

            ViewHolder viewHolder = new ViewHolder(posicao, escudo, time, pontos);
            view.setTag(viewHolder);
        }

        Drawable drawable = Util.getDrawable(activity, tabelaClassificacao[position].getEmblemaPequeno().toLowerCase());

        ViewHolder viewHolder = (ViewHolder)view.getTag();
        viewHolder.getPosicao().setText(position + "º");
        viewHolder.getEmblema().setImageDrawable(drawable);
        viewHolder.getTime().setText(tabelaClassificacao[position].getTime());
        viewHolder.getPontos().setText(tabelaClassificacao[position].getPontos());

        return view;
    }
}
