/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagemaviao;

/**
 *
 * @author Pedro Henrique
 */
public class Tripulante implements IViajante{

    private int idTripulante;

    public Tripulante(int idTripulante) {
        this.idTripulante = idTripulante;
    }


    public int getIdTripulante() {
        return idTripulante;
    }

    public void setIdTripulante(int idTripulante) {
        this.idTripulante = idTripulante;
    }

    
    @Override
    public double precoPassagem(Passagem outro) {
        return outro.getPrecoBase() * 0.6;
    }
}
