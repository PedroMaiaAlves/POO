/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro Henrique
 */
public class Etapa {
    private int numero;
    private Data data;
    private Duracao duracao;
    private  Hora horaInicial;
    
public Etapa(int numero, Data data, Duracao duracao, Hora horaInicial) {
        this.numero = numero;
        this.data = data;
        this.duracao = duracao;
        this.horaInicial = horaInicial;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setDuracao(Duracao duracao) {
        this.duracao = duracao;
    }

    public void setHoraInicial(Hora horaInicial) {
        this.horaInicial = horaInicial;
    }

    public int getNumero() {
        return numero;
    }

    public Data getData() {
        return data;
    }

    public Duracao getDuracao() {
        return duracao;
    }

    public Hora getHoraInicial() {
        return horaInicial;
    }

}
