package edu.escuelaing.arsw.intro.app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import edu.escuelaing.arsw.intro.App;
import edu.escuelaing.arsw.intro.linecounter.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    /**
     * En esta prueba, se confirmo que sirviera con la opcion loc y con un directorio en especifico del mismo proyecto
     *  desde la aplicacion, se puede considerar esta prueba como unitaria
     */
    public void testAppLOC()
    {
         String[] args = {"loc","src/main/java/edu/escuelaing/arsw/intro/linecounter"};
         App.main(args);
        
    }
    
    /**
     * En esta prueba, se confirmo que sirviera con la opcion phy y con un directorio en especifico del mismo proyecto
     *  desde la aplicacion, se puede considerar esta prueba como unitaria
     */
    public void testAppPHY()
    {
         String[] args = {"phy","src/main/java/edu/escuelaing/arsw/intro"};
         App.main(args);
    }
    /**
     * En esta prueba, se confirmo que fallara si ingresa otra opcion a parte de phy o loc, se puede considerar esta prueba como unitaria
     */
     public void testTineQueFallarApp() {
     	 String[] args = {"otro","src/main/java/edu/escuelaing/arsw/intro/linecounter"};
          App.main(args);
     }
    /**
     * En esta prueba, se confirmo que sirviera con la opcion phy, pero de forma en la que 
     * se observara que no botara ningun error a la hora de manejar las otras clases, esta se puede decir que es una Prueba de integración 
     * 
     */
    public void testFuncionaPHY() 
    {   
    	File dir = new File("src/test/resources");
        lectorArchivo fr= new lectorArchivo();
        ContadorPorLinea lc = new LineasFisicasPHY();  
        ArrayList<File> f=new ArrayList<File>();
		fr.addFiles(f , dir, lc, "src/test/resources");  
    }
    /**
     * En esta prueba, se confirmo no sirviera con un directorio que no existiera, pero de forma en la que 
     * se observara que no botara ningun error a la hora de manejar las otras clases, esta se puede decir que es una Prueba de integración 
     * 
     */
    public void testTieneQueFallarAddFiles() {
    	File dir = new File("src/test/resources");
        lectorArchivo fr= new lectorArchivo();
        ArrayList<File> f=new ArrayList<File>();
		fr.addFiles(f , dir, null, "src/test/resources");	
    }
    /**
     * En esta prueba, se confirmo que sirviera con la opcion loc, pero de forma en la que 
     * se observara que no botara ningun error a la hora de manejar las otras clases, esta se puede decir que es una Prueba de integración 
     * 
     */
    public void testFuncionaLOC() 
    {   
    	File dir = new File("src/test/resources");
        lectorArchivo fr= new lectorArchivo();
        ContadorPorLinea lc = new LineasEncontradasLOC();        
		fr.addFiles(null , dir, lc, "src/test/resources"); 
    }
    
}
