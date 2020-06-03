package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.intro.linecounter.lectorArchivo;
import edu.escuelaing.arsw.intro.linecounter.ContadorPorLinea;
import edu.escuelaing.arsw.intro.linecounter.LineasEncontradasLOC;
import edu.escuelaing.arsw.intro.linecounter.LineasFisicasPHY;

public class App 
{
    public static void main(String[] args)
    {
        String file = args[1];
        lectorArchivo fr= new lectorArchivo();
        ContadorPorLinea lc = null;
        if(args[0].equals("phy")) {
        	lc = new LineasFisicasPHY(); 
        }else if(args[0].equals("loc")){
        	lc = new LineasEncontradasLOC(); 
        }
        try {
        	fr.leerArchivo(file, lc);
            System.out.println("Physical Lines: " + lc.getNumLineas());
        }catch(Exception ex) {
        	throw new UnsupportedOperationException("Archivo no encontrado");
        }
        
        
    }
}
