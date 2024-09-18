/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Lourdes
 */
public class Inventario {
  private TreeSet<Producto> inv = new TreeSet<>(); 
  
  public void agregarProducto(Producto p){
      inv.add(p);
  }

    public TreeSet<Producto> getInv() {
        return inv;
    }
    public Producto buscarProducto(int codigo) {
        Producto p = null;
        Iterator<Producto> it = inv.iterator();
        while (it.hasNext()) {
            Producto temp = it.next(); // Almacena el producto actual
            if (temp.getCodigo() == codigo) {
                p = temp;
                break; // Detén la búsqueda cuando se encuentra el producto
            }
        }
        return p;
    }
  
  public void modificarProd(Producto p,int codigo, String descripción, double precio, int stock, Categoria categoria){
      p.setCodigo(codigo);
      p.setDescripción(descripción);
      p.setPrecio(precio);
      p.setStock(stock);
      p.setCategoria(categoria);
  }
  
  public boolean vacio(){
      return inv.isEmpty();
  }
  
  public void remover(){
      inv.removeAll(inv);
  }
  
  public void borrarProducto(int codigo){
      Iterator<Producto> it = inv.iterator();
      while(it.hasNext()){
          if(it.next().getCodigo()==codigo){
              it.remove();
              return;
          }
      }
  }
}
