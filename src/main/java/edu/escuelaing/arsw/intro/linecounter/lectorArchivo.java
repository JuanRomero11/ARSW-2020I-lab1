package edu.escuelaing.arsw.intro.linecounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class lectorArchivo{

    public lectorArchivo() {
    }

    public void leerArchivo(String filePath, ContadorPorLinea lc) {
        Charset charset = Charset.forName("UTF-8");
        Path file= Paths.get(filePath);
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                lc.contador(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
