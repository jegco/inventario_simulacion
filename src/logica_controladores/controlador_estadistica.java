/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica_controladores;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import logica_proyecto.Gasto;
import logica_proyecto.Inventario;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author j
 */
public class controlador_estadistica {
    public static void grafica_orden(JPanel panel_grafica_orden,Inventario inventario,JLabel lbLinea){
        XYSeries serie=null;
        XYSeries serie_2=null;

        JFreeChart linea;
        
        serie= new XYSeries("graficas relacion gastos-orden");
        Gasto gasto_minimo=valor_minimo(inventario);
        Gasto gasto_max=valor_maximo(inventario);
        for(int i=0;i<inventario.getGastos().size();i=i+inventario.getReorden_max()){
            serie.add(inventario.getGastos().get(i).getOrden_inicial(),inventario.getGastos().get(i).getGastos());
        }
        serie_2= new XYSeries("graficas relacion gastos-reorden");
        
        for(int i=0;i<inventario.getGastos().size();i=i+inventario.getOrden_max()){
            serie_2.add(inventario.getGastos().get(i).getReorden(),inventario.getGastos().get(i).getGastos());
        }
         		final XYSeriesCollection datos = new XYSeriesCollection();
		datos.addSeries(serie);
		datos.addSeries(serie_2);
                
         linea = ChartFactory.createXYLineChart("grafica representativa de ordenes por corrida, gasto_minimo(orden: "+gasto_minimo.getOrden_inicial()+"reorden: "+gasto_minimo.getReorden()+")= "+gasto_minimo.getGastos(),"rango","gastos",datos,PlotOrientation.VERTICAL,true,true,true);
         final XYPlot plot = (XYPlot) linea.getPlot();
         final NumberAxis domainAxis = (NumberAxis)plot.getDomainAxis();
         final NumberAxis rangeAxis = (NumberAxis)plot.getRangeAxis();
         configurarDomainAxis(domainAxis, inventario);
         configurarRangeAxis(rangeAxis,gasto_minimo.getGastos(),gasto_max.getGastos());
         BufferedImage graficoLinea=linea.createBufferedImage(600, 280);
         lbLinea.setSize(panel_grafica_orden.getSize());
         lbLinea.setIcon(new ImageIcon(graficoLinea));  
         panel_grafica_orden.updateUI();
    }
    public static Gasto valor_minimo(Inventario inventario){
        Gasto gasto_minimo=new Gasto(0, 0);
        gasto_minimo=inventario.getGastos().get(0);
        for(int i=0;i<inventario.getGastos().size();i++){
         if(gasto_minimo.getGastos()>inventario.getGastos().get(i).getGastos()) gasto_minimo=inventario.getGastos().get(i);   
        }
        System.out.println("gasto_minimo(orden: "+gasto_minimo.getOrden_inicial()+"/reorden: "+gasto_minimo.getReorden()+")= "+gasto_minimo.getGastos());
        return gasto_minimo;
    }
    public static Gasto valor_maximo(Inventario inventario){
        Gasto gasto_max=new Gasto(0, 0);
        gasto_max=inventario.getGastos().get(0);
        for(int i=0;i<inventario.getGastos().size();i++){
         if(gasto_max.getGastos()<inventario.getGastos().get(i).getGastos()) gasto_max=inventario.getGastos().get(i);   
        }
        System.out.println("gasto_maximo(orden: "+gasto_max.getOrden_inicial()+"/reorden: "+gasto_max.getReorden()+")= "+gasto_max.getGastos());
        return gasto_max;
    }
    private static void configurarRangeAxis (NumberAxis rangeAxis,double min,double max) {
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		rangeAxis.setTickUnit(new NumberTickUnit(500));
		rangeAxis.setRange(min, max);
	}
    
	private static void configurarDomainAxis (NumberAxis domainAxis,Inventario inventario) {
		domainAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		domainAxis.setTickUnit(new NumberTickUnit(20));
                domainAxis.setRange(inventario.getOrden_min(), inventario.getOrden_max());
	}
    public static void grafica_reorden(JPanel panel_grafica_orden,Inventario inventario,JLabel lbLinea){
        XYSeries serie_2=null;
        XYDataset datos;
        JFreeChart linea;
        
        serie_2= new XYSeries("graficas relacion gastos-reorden");
        
        for(int i=0;i<inventario.getGastos().size();i++){
            serie_2.add(inventario.getGastos().get(i).getReorden(),inventario.getGastos().get(i).getGastos());
        }
         datos = new XYSeriesCollection(serie_2);
         linea = ChartFactory.createXYLineChart("grafica representativa de reordenes por corrida","punto de orden","gastos",datos,PlotOrientation.VERTICAL,true,true,true);
         BufferedImage graficoLinea=linea.createBufferedImage(panel_grafica_orden.getWidth(), panel_grafica_orden.getHeight());
         lbLinea.setSize(panel_grafica_orden.getSize());
         lbLinea.setIcon(new ImageIcon(graficoLinea));  
         panel_grafica_orden.updateUI();
    }
}
