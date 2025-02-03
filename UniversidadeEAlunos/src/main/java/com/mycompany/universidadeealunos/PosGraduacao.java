/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidadeealunos;

import java.util.Date;

/**
 *
 * @author Pedro Henrique
 */
public class PosGraduacao implements IEstudante{
    private static final int NOTA_MINIMA;
    private Date dataDefesa;
    private int SimOuNao; // para ganhar tempo e definir se está formado
    
    static{
        NOTA_MINIMA = 70;
    }

    public PosGraduacao(Date dataDefesa, int SimOuNao) {
        this.dataDefesa = dataDefesa;
        this.SimOuNao = SimOuNao;
    }

    public static int getNOTA_MINIMA() {
        return NOTA_MINIMA;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public int getSimOuNao() {
        return SimOuNao;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public void setSimOuNao(int SimOuNao) {
        this.SimOuNao = SimOuNao;
    }
    
    
    
    @Override
    public boolean aprovado(Disciplina materia){
        return materia.getNota()>=70;
    }
    
    @Override
    public boolean formado(){
        return SimOuNao >= 1;
    }
}
