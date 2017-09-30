package com.prova.provaint81523195;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Daniel Almeida on 29/09/2017.
 * RA 81523195
 */

public class ViewHolder {

    private TextView posicao;
    private ImageView emblema;
    private TextView time;
    private TextView pontos;

    public ViewHolder(){
        //
    }

    public ViewHolder(TextView posicao, ImageView emblema, TextView time, TextView pontos) {
        this.posicao = posicao;
        this.emblema = emblema;
        this.time = time;
        this.pontos = pontos;
    }

    public TextView getPosicao() {
        return posicao;
    }

    public void setPosicao(TextView posicao) {
        this.posicao = posicao;
    }

    public ImageView getEmblema() {
        return emblema;
    }

    public void setEmblema(ImageView emblema) {
        this.emblema = emblema;
    }

    public TextView getTime() {
        return time;
    }

    public void setTime(TextView time) {
        this.time = time;
    }

    public TextView getPontos() {
        return pontos;
    }

    public void setPontos(TextView pontos) {
        this.pontos = pontos;
    }
}
