/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_proyecto;

import java.util.ArrayList;
import logica_generadores.Generador_demanda;
import logica_generadores.Generador_entrega;
import logica_generadores.Generador_espera;

/**
 *
 * @author j
 */
public class Inventario {
    private Generador_demanda gen_demanda;
    private Generador_espera gen_espera;
    private Generador_entrega gen_entrega;
    private ArrayList<Gasto> gastos;
    private int orden_min;
    private int orden_max;
    private int reorden_min;
    private int reorden_max;
    private int corrida;
    private int inventario_inicial;
    

    public Inventario(int corrida,int orden_min,int orden_max,int reorden_min,int reorden_max) {
        this.gen_demanda = new Generador_demanda();
        this.gen_espera = new Generador_espera();
        this.gen_entrega = new Generador_entrega();
        this.gastos = new ArrayList<>();
        this.corrida=corrida;
        this.orden_min=orden_min;
        this.orden_max=orden_max;
        this.reorden_min=reorden_min;
        this.reorden_max=reorden_max;
        this.inventario_inicial=100;
    }

    public int getInventario_inicial() {
        return inventario_inicial;
    }

    public void setInventario_inicial(int inventario_inicial) {
        this.inventario_inicial = inventario_inicial;
    }
    

    public int getOrden_min() {
        return orden_min;
    }

    public void setOrden_min(int orden_min) {
        this.orden_min = orden_min;
    }

    public int getOrden_max() {
        return orden_max;
    }

    public void setOrden_max(int orden_max) {
        this.orden_max = orden_max;
    }

    public int getReorden_min() {
        return reorden_min;
    }

    public void setReorden_min(int reorden_min) {
        this.reorden_min = reorden_min;
    }

    public int getReorden_max() {
        return reorden_max;
    }

    public void setReorden_max(int reorden_max) {
        this.reorden_max = reorden_max;
    }
    
    public Generador_demanda getGen_demanda() {
        return gen_demanda;
    }

    public void setGen_demanda(Generador_demanda gen_demanda) {
        this.gen_demanda = gen_demanda;
    }

    public Generador_espera getGen_espera() {
        return gen_espera;
    }

    public void setGen_espera(Generador_espera gen_espera) {
        this.gen_espera = gen_espera;
    }

    public Generador_entrega getGen_entrega() {
        return gen_entrega;
    }

    public void setGen_entrega(Generador_entrega gen_entrega) {
        this.gen_entrega = gen_entrega;
    }

    public ArrayList<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList<Gasto> gastos) {
        this.gastos = gastos;
    }

    public int getCorrida() {
        return corrida;
    }

    public void setCorrida(int corrida) {
        this.corrida = corrida;
    }
    
    
    
    
}
