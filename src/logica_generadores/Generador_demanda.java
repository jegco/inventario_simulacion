/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_generadores;

import java.util.ArrayList;
import logica_proyecto.Demanda;

/**
 *
 * @author j
 */
public class Generador_demanda {
    private ArrayList<Demanda> demandas;

    public Generador_demanda() {
        this.demandas = new ArrayList<>();
        llenar_arrayList(25, 0,0.0199);
        llenar_arrayList(26, 0.02,0.05999);
        llenar_arrayList(27, 0.06,0.1199);
        llenar_arrayList(28, 0.12,0.2399);
        llenar_arrayList(29, 0.24,0.4399);
        llenar_arrayList(30, 0.44,0.6799);
        llenar_arrayList(31, 0.68,0.8299);
        llenar_arrayList(32, 0.83,0.9299);
        llenar_arrayList(33, 0.93,0.9799);
        llenar_arrayList(34, 0.98,0.9999);
        
        
    }
    private void llenar_arrayList(int demanda,double minimo,double maximo){
        demandas.add(new Demanda(demanda, minimo,maximo));
    }

    public ArrayList<Demanda> getDemandas() {
        return demandas;
    }

    public void setDemandas(ArrayList<Demanda> demandas) {
        this.demandas = demandas;
    }
    
    public int demanda_diaria(double dato){
        for(int i=0;i<demandas.size();i++){
            if(demandas.get(i).getMaximo()>=dato&&demandas.get(i).getMinimo()<=dato) return demandas.get(i).getDiraria();
        }
        return -1;
    }
    
    
    
}
