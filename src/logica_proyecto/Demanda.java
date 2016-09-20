/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_proyecto;

/**
 *
 * @author j
 */
public class Demanda {
    private int diraria;
    private double minimo;
    private double maximo;

    public Demanda(int diraria, double minimo, double maximo) {
        this.diraria = diraria;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public double getMinimo() {
        return minimo;
    }

    public void setMinimo(double minimo) {
        this.minimo = minimo;
    }

    public double getMaximo() {
        return maximo;
    }

    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }
    public int getDiraria() {
        return diraria;
    }

    public void setDiraria(int diraria) {
        this.diraria = diraria;
    }

   
    
    
}
