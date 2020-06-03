package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.model.Counter;
import edu.escuelaing.arsw.model.CounterLOC;
import edu.escuelaing.arsw.model.CounterPHY;
import edu.escuelaing.arsw.model.Reader;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class CountlinesTest 
   
{
    private final String file1 = "src/main/java/edu/escuelaing/arsw/intro/Countlines.java";
    private final String file2 = "src/main/java/edu/escuelaing/arsw/model/Reader.java";

    @Test
    public void PHYFile1(){
        Reader reader = new Reader();
        Counter counter = new CounterPHY();
        assertEquals(counter.count(reader.read(file1)),37);
    }
    @Test
    public void PHYFile2(){
        Reader reader = new Reader();
        Counter counter = new CounterPHY();
        assertEquals(counter.count(reader.read(file2)),34);
    }
    @Test
    public void LOCFile1(){
        Reader reader = new Reader();
        Counter counter = new CounterLOC();
        assertEquals(counter.count(reader.read(file1)),25);
    }
    @Test
    public void LOCFile2(){
        Reader reader = new Reader();
        Counter counter = new CounterLOC();
        assertEquals(counter.count(reader.read(file2)),20);
    }
    @Test
    public void AppphyFile1(){
        try{
            String[] a = {"phy",file1};
            Countlines.main(a);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    @Test
    public void AppphyFile2(){
        try{
            String[] a = {"phy",file2};
            Countlines.main(a);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    @Test
    public void ApplocFile1(){
        try{
            String[] a = {"loc",file1};
            Countlines.main(a);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    @Test
    public void ApplocFile2(){
        try{
            String[] a = {"loc",file2};
            Countlines.main(a);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    
    
}
