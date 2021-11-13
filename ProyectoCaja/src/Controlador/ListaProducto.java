
package Controlador;


public class ListaProducto {
    private String nombreproducto,codigo;
    private int stock;
    private double precio;
    public ListaProducto(String nombreproducto, String codigo, int stock, double precio) {
        this.nombreproducto = nombreproducto;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
