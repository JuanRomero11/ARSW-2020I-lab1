package edu.escuelaing.arsw.intro.linecounter;

public class LineasEncontradasLOC implements ContadorPorLinea{
	private Integer ContadorLinea=0;
	/**
	 * Metodo utilizado para contar que lineas son validas o no, en este caso las lineas que son validas
	 * son aquellas que no son comentarios ni espacios
	 * 
	 * @param line donde corresponde a una linea del archivo.
	 */
	@Override
	public void contador(String line) {
		if(!line.trim().equals("") && line.trim().charAt(0)!='*' && line.trim().charAt(0)!='/') {
			ContadorLinea++;
			System.out.println(line);
		}
	}
	/**
	 * Metodo utilizado para retornar el numero de lineas validas
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
