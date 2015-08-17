/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author Usuario
 */
public class Movimiento {
   
  public String terceraL;

  public Movimiento(String terceraL) {
        this.terceraL = terceraL;
    }

   @Override
       public boolean equals (Object obj){
        if(obj == null) return false;
        if(!(obj instanceof Movimiento)) return false;
        Movimiento tem = (Movimiento)obj;
        return (this.terceraL==tem.terceraL );
    }
}
