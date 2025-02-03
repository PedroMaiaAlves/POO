/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro Henrique
 */
abstract class Participante {
    private String nome;
    private int numero;
    private String cidadeOrigem;

    public Participante(String nome, int numero, String cidadeOrigem) {
        this.nome = nome;
        this.numero = numero;
        this.cidadeOrigem = cidadeOrigem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }
}
