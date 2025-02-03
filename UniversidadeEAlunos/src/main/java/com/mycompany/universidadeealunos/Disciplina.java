/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidadeealunos;

/**
 *
 * @author Pedro Henrique
 */
public class Disciplina {

    private String nome;
    private int cargaHoraria;
    private int nota;

    public Disciplina(String nome, int cargaHoraria, int nota) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "Disciplina: " + nome +
               " | Carga Horária: " + cargaHoraria +
               " | Nota Mínima: " + nota;
    }

}
