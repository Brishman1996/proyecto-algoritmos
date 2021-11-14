/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Comprobante;
import Vista.HistorialVenta;
import Vista.Inventario;
import Vista.PanelControl;
import Vista.PanelRegistro;

/**
 *
 * @author canow
 */
public class Controller {

    private Comprobante comprobante;
    private HistorialVenta historialVenta;
    private Inventario inventario;
    private PanelControl panelControl;
    private PanelRegistro panelRegistro;
    
    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public void setHistorialVenta(HistorialVenta historialVenta) {
        this.historialVenta = historialVenta;
    }

    public void setPanelControl(PanelControl panelControl) {
        this.panelControl = panelControl;
    }

    public void setInventario(Inventario inventario) {
       this.inventario = inventario;
    }

    public void setPanelRegistro(PanelRegistro panelRegistro) {
        this.panelRegistro = panelRegistro;
    }
    
}
