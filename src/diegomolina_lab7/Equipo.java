/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegomolina_lab7;

/**
 *
 * @author diego
 */
public class Equipo {
    private String nombre;
    private int pGanados, pEmpatados,pPerdidos, golFavor, golContra, puntos;

    public Equipo() {
    }

    public Equipo(String nombre, int pGanados, int pEmpatados, int pPerdidos, int golFavor, int golContra) {
        this.nombre = nombre;
        this.pGanados = pGanados;
        this.pEmpatados = pEmpatados;
        this.pPerdidos = pPerdidos;
        this.golFavor = golFavor;
        this.golContra = golContra;
    }

    public Equipo(String nombre, int pGanados, int pEmpatados, int pPerdidos, int golFavor, int golContra, int puntos) {
        this.nombre = nombre;
        this.pGanados = pGanados;
        this.pEmpatados = pEmpatados;
        this.pPerdidos = pPerdidos;
        this.golFavor = golFavor;
        this.golContra = golContra;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getpGanados() {
        return pGanados;
    }

    public void setpGanados(int pGanados) {
        this.pGanados = pGanados;
    }

    public int getpEmpatados() {
        return pEmpatados;
    }

    public void setpEmpatados(int pEmpatados) {
        this.pEmpatados = pEmpatados;
    }

    public int getpPerdidos() {
        return pPerdidos;
    }

    public void setpPerdidos(int pPerdidos) {
        this.pPerdidos = pPerdidos;
    }

    public int getGolFavor() {
        return golFavor;
    }

    public void setGolFavor(int golFavor) {
        this.golFavor = golFavor;
    }

    public int getGolContra() {
        return golContra;
    }

    public void setGolContra(int golContra) {
        this.golContra = golContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
