package edu.escuelaing.arsw.intro.app;

import edu.escuelaing.arsw.intro.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
         String[] args = {"loc","src/main/java/edu/escuelaing/arsw/intro/linecounter"};
         App.main(args);
        
    }
}
