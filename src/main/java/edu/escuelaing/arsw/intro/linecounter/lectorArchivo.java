package edu.escuelaing.arsw.intro.linecounter;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;

public class lectorArchivo{

    public lectorArchivo() {
    }
    
   
    
    public ArrayList<File> addFiles(ArrayList<File> files2, File dir, ContadorPorLinea lc, String direccion) throws IOException
    {
           if (files2 == null)
               files2 = new ArrayList<File>();
           
           if (!dir.isDirectory())
           {
        	  System.out.println(direccion+'/'+dir.getName());
         	  leerArchivo(direccion+'/'+dir.getName() ,lc);
               files2.add(dir);
               return files2;
           }
           
           for (File file : dir.listFiles())
               addFiles(files2, file, lc, direccion);
           return files2;
    }
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
            System.err.format("IOException: %s%n", x);
        }
    }
}
