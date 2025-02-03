/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioabstractjava;

/**
 *
 * @author Pedro Henrique
 */
public class Gerente extends Funcionario {

    private String nomeUsuario;
    private int senha;

    public Gerente(String nomeUsuario, int senha, String nome, double salario) {
        super(nome, salario);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double calculaBonificacao() {
        return super.getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "nome = " + super.getNome() + "\n"
                + "salario = " + super.getSalario() + "\n"
                + "nome de usuario = " + nomeUsuario + "\n"
                + "senha = " + senha;
    }
}
