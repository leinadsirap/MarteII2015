/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author Usuario
 */
public class PruebaGraficador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cox = 2;
        int coy = 1;
        String punto = "*";
        String robot = "^";
        
                 for (int x=6; x > 0; x--) {
            System.out.print(" " + "|");
  for (int y=0; y < 7; y++) {
      if(x == cox && y == coy){
          System.out.print (robot);
      }else{
          System.out.print (punto);
      }
    if (y!=7) System.out.print("\t");
  }
  System.out.println("|");
}
        
        
    }
}
