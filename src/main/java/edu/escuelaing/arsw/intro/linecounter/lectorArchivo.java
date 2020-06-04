package edu.escuelaing.arsw.intro.linecounter;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class lectorArchivo{

    public lectorArchivo() {
    }
    /**
	 * La funcion del metodo es encontrar archivos en un directorio asi este se encuentre
	 * dentro de otro directorio de forma recursiva, y ademas al encontrar un archivo se enviara al metodo leerArchivo
	 * para que este lea las lineas
	 * 
	 * @param files2 donde corresponde a una lista de archivos ya este creada o no
	 * @param dir donde corresponde  a un archivo o directorio 
	 * @param lc donde corresponde al contador ya sea el contador de lineas fisicas o el contador de lineas de codigo
	 * @param direccion donde corresponde a la direccion del directorio principal donde empezo a buscarla
	 * 
	 * @return files2 donde corresponde la lista de todos los archivos encontrados en un directorio
	 */
    public ArrayList<File> addFiles(ArrayList<File> files2, File dir, ContadorPorLinea lc, String direccion) 
    {
    		
           if (files2 == null)
               files2 = new ArrayList<File>();
           
           if (!dir.isDirectory())
           {
        	  System.out.println(direccion+'/'+dir.getName());
         	  leerArchivo(direccion ,lc);
              files2.add(dir);
              return files2;
           }
           
	       for (File file : dir.listFiles()) {
		        if(dir.isDirectory()) {
		        	addFiles(files2, file, lc, direccion+'/'+file.getName());
		        }
	               
	       }
	          
           
           return files2;
    }
    /**
	 * La funcion del metodo es leer archivo linea por linea, cada una de estas lineas sera 
	 * validad ya sea por el contador de lineas fisicas o el contador de lineas de codigo
	 * 
	 * @param filePath donde corresponde a la direccion de un archivo
	 * @param lc donde corresponde al contador ya sea el contador de lineas fisicas o el contador de lineas de codigo
	 */
    public void leerArchivo(String filePath, ContadorPorLinea lc) {
        Charset charset = Charset.forName("UTF-8");
        Path file= Paths.get(filePath);
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                lc.contador(line);
            }
            System.out.println(" ");
            System.out.println("Num Lines: "+ lc.getNumLineas());
            System.out.println(" ");
            lc.setContador();
            
        } catch (IOException x) {
        	throw new UnsupportedOperationException("Fallo la lectura de lineas del archivo");
        }
    }
}
