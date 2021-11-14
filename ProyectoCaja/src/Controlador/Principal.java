/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Comprobante;
import Vista.HistorialVenta;
import Vista.PanelControl;
import Vista.PanelRegistro;
import Vista.Inventario;

import Modelo.Producto;
/**
 *
 * @author canow
 */
public class Principal {
    
    public static void main(String[] args) {
        //Declaramos clases
        Controller controller;
        
        /*Vistas*/
        Comprobante comprobante;
        HistorialVenta historialVenta;
        PanelControl panelControl;
        PanelRegistro panelRegistro;
        Inventario inventario;
        
        /*Modelo*/
        Producto producto;
        
        //Instanciamos las clases (Crear los objetos de las clases)
        controller = new Controller();
        
        comprobante = new Comprobante();
        historialVenta = new HistorialVenta();
        panelControl = new PanelControl();
        panelRegistro = new PanelRegistro();
        inventario = new Inventario();
        
        producto = new Producto();
                
        //Establecemos las relaciones entre clases
        comprobante.setController(controller);
        historialVenta.setController(controller);
        panelControl.setController(controller);
        panelRegistro.setController(controller);
        inventario.setController(controller);
        
        producto.setController(controller);
        
        //Enviarle una instancia de cada clase al cordinador
        controller.setComprobante(comprobante);
        controller.setHistorialVenta(historialVenta);
        controller.setPanelControl(panelControl);
        controller.setPanelRegistro(panelRegistro);
        controller.setInventario(inventario);
        
        ///
        panelControl.setVisible(true);
            
    }
}
