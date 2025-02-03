/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universidadeealunos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public class UniversidadeEAlunos {

    public static void main(String[] args) {
        
        Date dataDefesa = new Date();
        
        List<Disciplina> Disciplinas1 = new ArrayList<>();
        List<Disciplina> Disciplinas2 = new ArrayList<>();
        
        Disciplina Calculo1 = new Disciplina("Integral", 80, 60);
        Disciplina Calculo2 = new Disciplina("Integral Nível Pos-Graduação", 120, 70);
        
        Disciplinas1.add(Calculo1);
        Disciplinas2.add(Calculo2);
        
        Aluno a1 = new Aluno(Disciplinas1, 1, "Pedro");
        Aluno a2 = new Aluno(Disciplinas2, 2, "Victoria");
        
        Graduacao g1 = new Graduacao(1);
        a1.setNivel(g1);
        
        PosGraduacao p1 = new PosGraduacao(dataDefesa, 1);
        a2.setNivel(p1);
       
        System.out.println(a1.aprovado(Calculo1));
        
        System.out.println(a2.aprovado(Calculo2));
        
        System.out.println("Seu nome é: " + a2.getNome());
        
        System.out.println("Sua carga matrícula é: " + a2.getMatricula());
        
        a1.imprimirHistorico();
        a2.imprimirHistorico();
        
        
       
    }
}
