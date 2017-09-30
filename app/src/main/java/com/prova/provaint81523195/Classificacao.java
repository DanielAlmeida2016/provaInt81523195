package com.prova.provaint81523195;

import android.support.annotation.NonNull;

import java.io.Serializable;

/**
 * Created by Daniel Almeida on 29/09/2017.
 * RA 81523195
 */

public class Classificacao implements Serializable{

    private String time;
    private String emblemaPequeno;
    private String emblemaGrande;
    private int pontos;
    private int jogos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsMarcados;
    private int golsSofridos;
    private int saldoGols;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEmblemaPequeno() {
        return emblemaPequeno;
    }

    public void setEmblemaPequeno(String emblemaPequeno) {
        this.emblemaPequeno = emblemaPequeno;
    }

    public String getEmblemaGrande() {
        return emblemaGrande;
    }

    public void setEmblemaGrande(String emblemaGrande) {
        this.emblemaGrande = emblemaGrande;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getJogos() {
        return jogos;
    }

    public void setJogos(int jogos) {
        this.jogos = jogos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

}
