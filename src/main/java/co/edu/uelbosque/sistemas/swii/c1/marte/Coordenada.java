/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author Usuario
 */
public class Coordenada {
    
    int x;
    int y;

    public Coordenada(int x, int y) {
       this.x = x;
       this.y = y;
    }

 
    
    public boolean equals (Object obj){
        if(obj == null) return false;
        if(!(obj instanceof Coordenada)) return false;
        Coordenada tem = (Coordenada)obj;
        return (this.x==tem.x && this.y==tem.y);
    }
}
