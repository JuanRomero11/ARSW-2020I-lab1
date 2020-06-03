package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.intro.linecounter.FileReader;
import edu.escuelaing.arsw.intro.linecounter.LineCounter;
import edu.escuelaing.arsw.intro.linecounter.PhysicalLinesCounter;
/**
 * @return the suite of tests being tested
 */
public class App {
	/**
	 * @return the suite of tests being tested
	 */
    public static void main( String[] args ){
        String file = args[0];
        FileReader fr= new FileReader();
        LineCounter lc = new PhysicalLinesCounter();        
        fr.readFile(file, lc);
        System.out.println("Physical Lines: " + lc.getLineCount());
    }
}