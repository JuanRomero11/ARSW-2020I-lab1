package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.intro.linecounter.lectorArchivo;

import java.io.File;

import edu.escuelaing.arsw.intro.linecounter.ContadorPorLinea;
import edu.escuelaing.arsw.intro.linecounter.LineasEncontradasLOC;
import edu.escuelaing.arsw.intro.linecounter.LineasFisicasPHY;

public class App 
{
	/**
	 * La funcion del main es identificar si quiere leer las lineas fisicas o lineas de codigo 
	 * de un directorio en especifico
	 * 
	 * @param args donde la primera posicion es el tipo de conteo que se quiere realizar ya sea lineas fisicas o
	 * lineas de codigo y la segunda posicion de la lista es la direccion de un directorio o un archivo 
	 */
    public static void main(String[] args)
    {
        lectorArchivo fr= new lectorArchivo();
        ContadorPorLinea lc = null;
        File dir = new File(args[1]);
        if(args[0].equals("phy")) {
        	lc = new LineasFisicasPHY(); 
        }else if(args[0].equals("loc")){
        	lc = new LineasEncontradasLOC(); 
        }
        try {
        	fr.addFiles(null , dir, lc, args[1]); 
        }catch(Exception ex) {
        	throw new UnsupportedOperationException("Archivo no encontrado");
        }
        
        
    }
}
