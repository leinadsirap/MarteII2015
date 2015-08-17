/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author Usuario
 */
public class CoordenadaRobot {
    int x;
    int y;
    String sentido;
    
     public CoordenadaRobot(int x, int y, String sentido) {
       this.x = x;
       this.y = y;
       this.sentido = sentido;
    }

    @Override
    public boolean equals(Object o) {
       if(o == null) return false;
        if(!(o instanceof CoordenadaRobot)) return false;
        CoordenadaRobot tem = (CoordenadaRobot)o;
        return (this.x == tem.x && this.y == tem.y && (this.sentido == null ? tem.sentido == null : this.sentido.equals(tem.sentido)));
    }
    
     
}
