/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripción;
    private double precio;
    private int stock;
    private Categoria categoria;

    public Producto(int codigo, String descripción, double precio, int stock, Categoria categoria) {
        this.codigo = codigo;
        this.descripción = descripción;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.codigo,o.getCodigo() );

    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripción + ", precio=" + precio + ", stock=" + stock + ", categoria=" + categoria + '}';
    }
    
    
}
