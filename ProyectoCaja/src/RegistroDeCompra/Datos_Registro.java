
package RegistroDeCompra;



public class Datos_Registro {
    private String numero_cajero;
    private int vuelto_de_pago;
    private double sumar_product;
 
    
    public Datos_Registro(double sumar_product) {
        this.sumar_product = sumar_product;
    }

    
    // recopilar gasto

    public double getSumar_product() {
        return sumar_product;
    }

    public void setSumar_product(double sumar_product) {
        this.sumar_product = sumar_product;
    }
    
   // metodos 
    public double sumar_producto(){
    return this.sumar_product;
    }
    public double total() {
    return (15/100)*(0.1/100)*this.sumar_product;
    }
}
