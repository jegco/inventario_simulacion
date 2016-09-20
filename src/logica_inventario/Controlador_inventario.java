/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_inventario;

import java.util.ArrayList;
import logica_proyecto.Gasto;
import logica_proyecto.Inventario;

/**
 *
 * @author j
 */
public class Controlador_inventario {
    
    public static void demandas(Inventario inventario,ArrayList<Double> aleatorios_demanda,ArrayList<Double> aleatorios_entregas,ArrayList<Double> aleatorios_espera){
        //n=identificador de la posicion del ciclio de orden*reorden*corrida
        //l=identificador de la posicion del ciclo de orden*reorden
        int n=0,l=0,dias_entrega=0,demandas_en_espera=0;
        //ciclo de orden, en el cual va pasando desde el orden minimo hasta el maximo
        for(int j=0;j<(inventario.getOrden_max()-inventario.getOrden_min());j++){
            //ciclo de reorden, en el cual va pasando desde el reorden minimo hasta el maximo
            for(int h=0;h<(inventario.getReorden_max()-inventario.getReorden_min());h++){
                //gastos de cada año, inicializados en 0 porque todavia no empieza la corrida, pero llevan el punto de orden y reorden
                inventario.getGastos().add(new Gasto(inventario.getOrden_min()+j, inventario.getReorden_min()+h));
                //ciclo de inicio de corrida hecha de forma generica, para efectos del proyecto lo mas probable es que sea 1 año
                for(int i=0;i<inventario.getCorrida();i++){
                    //empieza el ciclo diario, y se toman aleatorios de cada dia para los dias de entrega y demanda diaria
                    int demanda=inventario.getGen_demanda().demanda_diaria(aleatorios_demanda.get(n));
                    
                    int entrega=inventario.getGen_entrega().dias_entrega((aleatorios_entregas.get(n)));
                    
                    int espera=inventario.getGen_espera().dias_espera((aleatorios_entregas.get(n)));
                    //Controlador_faltante.faltantes(inventario, l, espera, entrega,demanda,demandas_en_espera);
                    Controlador_demanda.demanda(inventario,demanda , l,demandas_en_espera,espera,dias_entrega,entrega);
                    if(inventario.getGastos().get(l).getInventario()<=inventario.getGastos().get(l).getReorden()){
                        
                            Controlador_reorden.espera_inventario(dias_entrega);
                            Controlador_reorden.reorden(inventario,dias_entrega, l, demanda,dias_entrega,demandas_en_espera);
                        }
                    n++;
                    
                    inventario.getGastos().get(l).setGastos(inventario.getGastos().get(l).getGastos()+inventario.getGastos().get(l).getInventario()*0.2);
                    //final ciclo corrida, aqui es cuando acaba el dia
                    //System.out.println("gastos dia: "+i+", orden: "+inventario.getGastos().get(l).getOrden_inicial()+", reorden: "+inventario.getGastos().get(l).getReorden()+" = "+inventario.getGastos().get(l).getGastos());
                    }
                n=0;
                dias_entrega=0;
                demandas_en_espera=0;
                l++;
                
            }
            
        }
        
    }
}
