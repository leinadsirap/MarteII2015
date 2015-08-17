/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alejandro
 */
public class ManejadorArchivo {
    
    public File reglas = null;
    FileReader fr = null;
    BufferedReader br = null;
    String lineaUno;
    String lineDos;
    String lineaTres;
    char [] caracteres= null;
    int contador;
    CoordenadaRobot  rob;
    
    public void setRutaArchivo(String ruta) throws FileNotFoundException {
        reglas=new File(ruta);
        if((!reglas.exists()))
          throw new FileNotFoundException("El Archivo de Reglas No Existe");
    }

    public String getPrimeraLinea() throws IOException {
        FileReader fr=new FileReader(reglas);
        BufferedReader br=new BufferedReader(fr);
        lineaUno = br.readLine();
        return  lineaUno;
    }
    
     public Coordenada getObtenerCoordenada() throws IOException {
        if(lineaUno == null)
            getPrimeraLinea();
        String coordenada[] = lineaUno.split(" ");
        int x = Integer.parseInt(coordenada[0]);
        int y = Integer.parseInt(coordenada[1]);
        return new Coordenada(x, y);       
    }

    public String getSegundaLinea() throws IOException {
         FileReader fr=new FileReader(reglas);
        BufferedReader br=new BufferedReader(fr);
            contador =0;
          
             while ((lineDos = br.readLine()) != null)   {

                    if(contador ==1){
                   return  lineDos;
                }
                contador++;
            }
        return null;
    }
    
        public CoordenadaRobot getObtenerCoordenadaRobot() throws IOException {
        if(lineDos == null)
            getSegundaLinea();
        String coordenadaR[] = lineDos.split(" ");
        int x = Integer.parseInt(coordenadaR[0]);
        int y = Integer.parseInt(coordenadaR[1]);
        String sentido = coordenadaR[2];
        return new CoordenadaRobot(x, y, sentido);       
    }

    public String getTerceraLinea() throws IOException {
        FileReader fr=new FileReader(reglas);
        BufferedReader br=new BufferedReader(fr);
        contador =0;
         
             while ((lineaTres = br.readLine()) != null)   {

                    if(contador ==2){
                   return lineaTres;
                }
                contador++;
            }
        return null;
       
    }

    public CoordenadaRobot getMovimiento() throws IOException {
        String linea = getTerceraLinea(); 
        char[] caracteres = linea.toCharArray();
        for (int x=0;x<caracteres.length;x++){
             if(caracteres[x] == 'A'){
                
               switch(rob.sentido) {
 case "N": 
     rob.y = rob.y +1;
     break;
 case "W": 
     rob.x = rob.x - 1;
     break;
 case "S": 
    rob.y = rob.y - 1;
     break;
 case "E": 
     rob.x= rob.x + 1;
     break;
 default: 
    
     break;
 }   
            }else if (caracteres[x] == 'I'){
                  switch(rob.sentido) {
 case "N": 
     rob.sentido = "W";
     break;
 case "W": 
     rob.sentido = "S";
     break;
 case "S": 
     rob.sentido = "E";
     break;
 case "E": 
     rob.sentido = "N";
     break;
 default: 
   
     break;
 }
             
        }else{
            
               switch(rob.sentido) {
 case "N": 
     rob.sentido = "E";
     break;
 case "W": 
    rob.sentido = "N";
     break;
 case "S": 
     rob.sentido = "W";
     break;
 case "E": 
     rob.sentido = "S";
     break;
 default: 
    
     break;
 }
            }
        }
            
        return new CoordenadaRobot(rob.y , rob.x, rob.sentido);
      }
}
