/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidadeealunos;

import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public class Aluno implements IEstudante {

    private List<Disciplina> disciplinas;
    private int matricula;
    private String nome;
    private IEstudante nivel;

    public Aluno(List<Disciplina> disciplinas, int matricula, String nome) {
        this.disciplinas = disciplinas;
        this.matricula = matricula;
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public IEstudante getNivel() {
        return nivel;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(IEstudante nivel) {
        this.nivel = nivel;
    }

    @Override
    public boolean aprovado(Disciplina materia) {

        return nivel.aprovado(materia);

    }

    @Override
    public boolean formado() {

        return nivel.formado();

    }

    public void imprimirHistorico() {
        System.out.println("Histórico do Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Disciplinas cursadas:");

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);  // Chama o toString de Disciplina
        }
    }
}
