package edu.escuelaing.arsw.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Cuenta las líneas fisicas del archivo
 * @author Andres Gonzalez
 */
public class CounterPHY implements Counter {

    /**
     * Cuenta las lineas del BufferedReader dado
     * @param br BufferedReader archivo leido
     * @return numero de lineas del archivo
     */
    public int count(BufferedReader br) {
        int res=0;
        
        try {
            String line;
            while((line=br.readLine())!=null){
                res++;
            }
        } catch (IOException ex) {
            Logger.getLogger(CounterPHY.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
}
