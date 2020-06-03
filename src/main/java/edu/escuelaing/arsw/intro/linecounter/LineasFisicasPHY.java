package edu.escuelaing.arsw.intro.linecounter;

public class LineasFisicasPHY implements ContadorPorLinea{
    
    private Integer ContadorLinea=0;

    @Override
    public void contador(String line) {
    	System.out.println(line);
    	ContadorLinea++;
    }

    @Override
    public Integer getNumLineas() {
        return ContadorLinea;
    }
    
}
