/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro Henrique
 */
public class Hora {

    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void Ajustar(int horas, int minutos, int segundos) {

        this.segundos += segundos;
        if (this.segundos >= 60) {
            this.minutos += this.segundos / 60;
            this.segundos = this.segundos % 60;
        }

        this.minutos += minutos;
        if (this.minutos >= 60) {
            this.horas += this.minutos / 60;
            this.minutos = this.minutos % 60;
        }

        this.horas += horas;
        if (this.horas >= 24) {
            this.horas = this.horas % 24;
        }
    }

    public boolean Validar() {
        return (this.segundos >= 0 && this.segundos < 60) && (this.minutos >= 0 && this.minutos < 60) && (this.horas >= 0 && this.horas < 24);
    }

    public Hora Incrementar(int quantidadeSegundos) {
        
        this.segundos += quantidadeSegundos;
        if (this.segundos >= 60) {
            this.minutos += this.segundos / 60;
            this.segundos = this.segundos % 60;
        }

         this.minutos += minutos;
        if (this.minutos >= 60) {
            this.horas += this.minutos / 60;
            this.minutos = this.minutos % 60;
        }
        return this;
    }

    public boolean EstahNaFrenteDe(Hora outra) {
        if (this.horas > outra.getHoras()) {
            return true;
        } else if (this.horas == outra.getHoras()) {
            if (this.minutos > outra.getMinutos()) {
                return true;
            } else if (this.minutos == outra.getMinutos()) {
                return this.segundos > outra.getSegundos();
            }
        }
        return false;
    }
    
    public String HoraFormatada(){
        String horasFormatadas = String.format("%02d", this.horas);
        String minutosFormatados = String.format("%02d", this.minutos);
        String segundosFormatados = String.format("%02d", this.segundos);    
        
        return horasFormatadas + ":" + minutosFormatados + ":" + segundosFormatados; 
    }
}