/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_generadores;

import java.util.ArrayList;
import logica_proyecto.Entrega;

/**
 *
 * @author j
 */
public class Generador_entrega {
    private ArrayList<Entrega> entregas;

    public Generador_entrega() {
        this.entregas = new ArrayList<>();
        llenar_arrayList(1, 0, 0.1999);
        llenar_arrayList(2, 0.2,0.4999);
        llenar_arrayList(3, 0.5, 0.7499);
        llenar_arrayList(4, 0.75, 0.9999);
        
    }

    
    private void llenar_arrayList(int dias,double minimo, double maximo){
       entregas.add(new Entrega(dias, minimo, maximo));
    } 

    public ArrayList<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(ArrayList<Entrega> entregas) {
        this.entregas = entregas;
    }
    
    public int dias_entrega(double dato){
        for(int i=0;i<entregas.size();i++){
            if(entregas.get(i).getMinimo()<=dato&&entregas.get(i).getMaximo()>=dato) return entregas.get(i).getDias();
        }
         return -1;
    }
}
