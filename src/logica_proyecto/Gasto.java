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
public class Gasto {
    
    private int faltante;
    private double gastos;
    private int entregas_perdidas;
    private int inventario;
    private int reorden;
    private int orden_inicial;


    public Gasto( int faltante, double gastos, int entregas_perdidas,int orden,int reorden) {
        this.faltante = faltante;
        this.gastos = gastos;
        this.entregas_perdidas = entregas_perdidas;
        this.inventario=100;
        this.reorden=reorden;
        this.orden_inicial=orden;

    }
    public Gasto(int orden,int reorden) {
        this.inventario=100;
        this.faltante = 0;
        this.gastos = 0;
        this.entregas_perdidas = 0;
        this.orden_inicial=orden;
        this.inventario=100;
        this.reorden=reorden;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public int getReorden() {
        return reorden;
    }

    public void setReorden(int reorden) {
        this.reorden = reorden;
    }

    public int getFaltante() {
        return faltante;
    }

    public void setFaltante(int faltante) {
        this.faltante = faltante;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public int getEntregas_perdidas() {
        return entregas_perdidas;
    }

    public void setEntregas_perdidas(int entregas_perdidas) {
        this.entregas_perdidas = entregas_perdidas;
    }

    public int getOrden_inicial() {
        return orden_inicial;
    }

    public void setOrden_inicial(int orden_inicial) {
        this.orden_inicial = orden_inicial;
    }

    
    
}
