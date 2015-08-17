/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;

import co.edu.uelbosque.sistemas.swii.c1.marte.Movimiento;
import co.edu.uelbosque.sistemas.swii.c1.marte.CoordenadaRobot;
import co.edu.uelbosque.sistemas.swii.c1.marte.Coordenada;
import co.edu.uelbosque.sistemas.swii.c1.marte.ManejadorArchivo;
import co.edu.uelbosque.sistemas.swii.c1.marte.Tablero;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Alejandro
 */
public class ProbarManejadorDeArchivo {
    
    @Test(expectedExceptions = FileNotFoundException.class)
    public void elArchivoNoExiste() throws FileNotFoundException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("reglas.txt");
    }
    
    @Test
    public void elArchivoExiste() throws FileNotFoundException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
    }
    
    @Test
    public void laPrimerLineaDelArchivoEsCorrecta() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        String primeraL = manejador.getPrimeraLinea();
        String primeraLEsp = "7 6";
        Assert.assertEquals(primeraL, primeraLEsp);

    }
    @Test
    public void laPrimeraCoordenadaDeLaPrimeraLinea() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        Coordenada coordenada = new Coordenada (7,6);
        Coordenada incial = manejador.getObtenerCoordenada();
        Assert.assertEquals(coordenada, incial);
    }
    @Test
    public void laSegundaLineaDelArchivoEscorrecta() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        String segundaL = manejador.getSegundaLinea();
        String segundaLEsp = "1 2 N";
        Assert.assertEquals(segundaL, segundaLEsp);
    }
    @Test
    public void laSegundaCoordenadaDeLaSegundaLinea() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        CoordenadaRobot corrobot = new CoordenadaRobot (1,2,"N");
        CoordenadaRobot inicial = manejador.getObtenerCoordenadaRobot();
        Assert.assertEquals(corrobot, inicial);
    }
    
    @Test
    public void laTerceraLineaDelArchivoEscorrecta() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        String terceraL = manejador.getTerceraLinea();
        String terceraLEsp = "IAIAIAIAA";
        Assert.assertEquals(terceraL, terceraLEsp);
    }
    
    @Test
    public void elMovimientoDeLaTerceraLinea() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        String terceraL = manejador.getTerceraLinea();
        Movimiento  movim = new Movimiento(terceraL);
        CoordenadaRobot iniciMovimiento = manejador.getMovimiento();       
    }
    
}
