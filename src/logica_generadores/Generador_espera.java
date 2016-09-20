/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_generadores;

import java.util.ArrayList;
import logica_proyecto.Entrega;
import logica_proyecto.Espera;

/**
 *
 * @author j
 */
public class Generador_espera {
    private ArrayList<Espera> espera;

    public Generador_espera() {
        this.espera = new ArrayList<>();
        llenar_arrayList(0,0, 0.3999);
        llenar_arrayList(1, 0.4,0.5999);
        llenar_arrayList(2, 0.6,0.7499);
        llenar_arrayList(3, 0.21,0.8999);
        llenar_arrayList(4, 0.9,0.9999);
        
    }
    
    private void llenar_arrayList(int espera,double minimo,double maximo){
        this.espera.add(new Espera(espera, minimo, maximo));
    }

    public ArrayList<Espera> getEspera() {
        return espera;
    }

    public void setEspera(ArrayList<Espera> espera) {
        this.espera = espera;
    }
    public int dias_espera(double dato){
        for(int i=0;i<espera.size();i++){
            if(espera.get(i).getMaximo()>=dato&&espera.get(i).getMinimo()<=dato) return espera.get(i).getDias();
        }
        return -1;
    }
    
}
