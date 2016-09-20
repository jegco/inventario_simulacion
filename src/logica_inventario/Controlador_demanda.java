/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_inventario;

import java.util.ArrayList;
import logica_proyecto.Inventario;

/**
 *
 * @author j
 */
public class Controlador_demanda {
    public static void demanda(Inventario inventario,int cantidad,int l,int demandas_en_espera,int espera,int dias_entrega,int entrega){
        if(inventario.getGastos().get(l).getInventario()>=cantidad){
            inventario.getGastos().get(l).setInventario(inventario.getGastos().get(l).getInventario()-cantidad);
            
        }else{
            if(dias_entrega==0) dias_entrega=entrega;
            if(espera>=dias_entrega){
            inventario.getGastos().get(l).setGastos(inventario.getGastos().get(l).getGastos()+cantidad*20);
            inventario.getGastos().get(l).setFaltante(inventario.getGastos().get(l).getFaltante()+1);
            demandas_en_espera+=cantidad;
            }
            else{
                inventario.getGastos().get(l).setGastos(inventario.getGastos().get(l).getGastos()+cantidad*50);
            inventario.getGastos().get(l).setFaltante(inventario.getGastos().get(l).getFaltante()+1);
            }
        }
    }
}
