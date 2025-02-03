/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quicksortinterface;

import java.util.Date;

/**
 *
 * @author Pedro Henrique
 */
public class Aluno implements IOrdenavel {

    private static final int QTAVALIACOES;
    private String nome;
    private int matricula;
    private Date nascimento;

    static {
        QTAVALIACOES = 4;
    }

    public static int getQTAVALIACOES() {
        return QTAVALIACOES;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public boolean menorQue(IOrdenavel outro) {
        if (outro instanceof Aluno outroAluno) {
            return this.matricula < outroAluno.matricula;
        }
        {
            return false;
        }
    }

    @Override
    public boolean igual(IOrdenavel outro) {
        if (outro instanceof Aluno outroAluno) {
            return this.matricula == outroAluno.matricula;
        }
        {
            return false;
        }
    }

}
