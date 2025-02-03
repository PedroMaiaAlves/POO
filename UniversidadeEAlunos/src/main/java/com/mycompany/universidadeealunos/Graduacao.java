/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidadeealunos;

/**
 *
 * @author Pedro Henrique
 */
public class Graduacao implements IEstudante {
    private static final int NOTA_MINIMA;
    private int SimOuNao; // para ganhar tempo e definir se está formado
    
    static{
        NOTA_MINIMA = 60;
    }

    public Graduacao(int SimOuNao) {
        this.SimOuNao = SimOuNao;
    }

    public static int getNOTA_MINIMA() {
        return NOTA_MINIMA;
    }

    public int getSimOuNao() {
        return SimOuNao;
    }

    public void setSimOuNao(int SimOuNao) {
        this.SimOuNao = SimOuNao;
    }
    
    @Override
    public boolean aprovado(Disciplina materia){
        return materia.getNota()>= NOTA_MINIMA;
    }
    
    @Override
    public boolean formado(){
        return getSimOuNao()>=1;
    }
}
