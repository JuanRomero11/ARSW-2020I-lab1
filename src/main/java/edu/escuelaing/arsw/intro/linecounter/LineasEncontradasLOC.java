package edu.escuelaing.arsw.intro.linecounter;

public class LineasEncontradasLOC implements ContadorPorLinea{
	private Integer ContadorLinea=0;
	@Override
	/*
	 * (non-Javadoc)
	 * @see edu.escuelaing.arsw.intro.linecounter.LineCounter#count(java.lang.String)
	 */
	public void contador(String line) {
	
		if(!line.trim().equals("") && line.trim().charAt(0)!='*' && line.trim().charAt(0)!='/') {
			ContadorLinea++;
			System.out.println(line);
		}
	}
	@Override
	public Integer getNumLineas() {
		
		return ContadorLinea;
	}
	@Override
	public void setContador() {
    	ContadorLinea=0;
    }
}
