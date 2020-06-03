package edu.escuelaing.arsw.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase lee un archivo dado su url
 * @author Andres Gonzalez
 */
public class Reader {
    
    /**
     * Lee el archivo y retorna el BufferedReader correspondiente
     * @param url dirección del archivo
     * @return  BufferedReader del archivo
     */
    public BufferedReader read(String url){
        BufferedReader br = null;
        try {
            File file = new File (url);
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return br;
    }
    
}
