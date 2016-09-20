/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_inventario;

import java.util.ArrayList;
import logica_generadores.Auxiliares;
import logica_generadores.Generador_aleatorio;

/**
 *
 * @author j
 */
public class Controlador_aleatorios {
    public static ArrayList<Double> congruensial_mixto(int m,int c,int a,int inicio){
        ArrayList<Double> aleatorios=new ArrayList<>();
        aleatorios.add(-0.1);
                  aleatorios=Generador_aleatorio.congruencialMixto(m, c, a, inicio);
              aleatorios=Generador_aleatorio.congruencialMixto(m, c, a, inicio);
        return aleatorios;
    }
    public static ArrayList<Double> congruencial_multiplicativo(int m, int a, int inicio){
        ArrayList<Double> aleatorios=new ArrayList<>();
        aleatorios=Generador_aleatorio.congruencialMultiplicativo(m, a, inicio);
        return aleatorios;
    }
    public static ArrayList<Double> congruencialCuadratico( int m,int d,int a, int c,int inicio){
        ArrayList<Double> aleatorios=new ArrayList<>();
        aleatorios=Generador_aleatorio.congruencialCuadratico(m, d, a, c, inicio);
        return aleatorios;
    }
    public static ArrayList<Double> metodoAditivoFibonacci(int m,int x, int x0){
        ArrayList<Double> aleatorios=new ArrayList<>();
        aleatorios=Generador_aleatorio.metodoAditivoFibonacci(m, x, x0);
        return aleatorios;
    }
    public static ArrayList<Double> metodoAditivoGreen(int m,int k){
        ArrayList<Double> aleatorios=new ArrayList<>();
        aleatorios=Generador_aleatorio.metodoAditivoGreen(m, k);
        return aleatorios;
    }
    public static ArrayList<Double> MetodoAditivoMichellMoore(int m, int n){
        ArrayList<Double> aleatorios=new ArrayList<>();
        aleatorios=Generador_aleatorio.MetodoAditivoMichellMoore(m, n);
        return aleatorios;
    }
    public static ArrayList<Double> metodoMixto(int m, int k,int n){
        ArrayList<Double> aleatorios=new ArrayList<>();
        aleatorios=Generador_aleatorio.metodoMixto(m, k, n);
        return aleatorios;
    }
    public static ArrayList<Double> metodoMezcla1(int m,int k){
        ArrayList<Double> aleatorios=new ArrayList<>();
        aleatorios=Generador_aleatorio.metodoMezcla1(m, k);
        return aleatorios;
    }
    public static ArrayList<Double> metodoMezcla2(int m,int k){
        ArrayList<Double> aleatorios=new ArrayList<>();
        aleatorios=Generador_aleatorio.metodoMezcla2(m, k);
        return aleatorios;
    }
}
