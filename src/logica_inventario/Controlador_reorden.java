/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_inventario;

import logica_proyecto.Inventario;

/**
 *
 * @author j
 */
public class Controlador_reorden {
    public static void reorden(Inventario inventario,int entrega,int n,int demanda,int dias_entrega,int demandas_en_espera){
        if(inventario.getGastos().get(n).getInventario()<=demanda||inventario.getGastos().get(n).getInventario()<=inventario.getGastos().get(n).getReorden()){
        if(dias_entrega==0){
            inventario.getGastos().get(n).setGastos(inventario.getGastos().get(n).getGastos()+100);
            inventario.getGastos().get(n).setInventario(inventario.getGastos().get(n).getInventario()+inventario.getGastos().get(n).getOrden_inicial()-demandas_en_espera);
            demandas_en_espera=0;
        }
        }
    }
    public static void espera_inventario(int dias_entrega){
        if(0<dias_entrega){
            dias_entrega--;
        }
    }
}
