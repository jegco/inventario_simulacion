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
public class Entrega {
    private int dias;
    private double minimo;
    private double maximo;

    public Entrega(int dias, double minimo, double maximo) {
        this.dias = dias;
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
    
    

    

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    
    
    
}
