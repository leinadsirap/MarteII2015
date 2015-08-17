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
   
  public char [] caracteres;

   

   public Movimiento(char[] caracteres) {
        this.caracteres =caracteres;
    }

    public Movimiento(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    @Override
       public boolean equals (Object obj){
        if(obj == null) return false;
        if(!(obj instanceof Movimiento)) return false;
        Movimiento tem = (Movimiento)obj;
        return (this.caracteres==tem.caracteres );
    }
}
