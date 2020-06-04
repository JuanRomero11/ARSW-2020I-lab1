package edu.escuelaing.arsw.intro.linecounter;

public class LineasFisicasPHY implements ContadorPorLinea{
    
    private Integer ContadorLinea=0;
    /**
	 * Metodo utilizado para contar lineas de un archivo
	 * 
	 * @param line donde corresponde a una linea del archivo.
	 */
    @Override
    public void contador(String line) {
    	System.out.println(line);
    	ContadorLinea++;
    }
    /**
	 * Metodo utilizado para retornar el numero de lineas
	 * 
	 * @return Integer donde corresponde al numero de lineas contadas del archivo
	 */
    @Override
    public Integer getNumLineas() {
        return ContadorLinea;
    }
    /*
	 * Metodo utilizado para cambiar el contador a 0 
	 * 
	 */
    @Override
    public void setContador() {
    	ContadorLinea=0;
    }
    
}
