package edu.escuelaing.arsw.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Cuenta las líneas de código del archivo
 * @author Andres Gonzalez
 */
public class CounterLOC implements Counter{

    /**
     * Cuenta las lineas del BufferedReader dado
     * @param br BufferedReader archivo leido
     * @return numero de lineas del archivo
     */
    public int count(BufferedReader br) {
        int res=0;
        
        try {
            String line;
            boolean flag=false;
            while((line=br.readLine())!=null){
                line=line.trim();
                if(line.contains("/*")){
                    flag=true;
                }
                else if(!flag && !"".equals(line)){
                    res++;
                }
                else if(flag && line.contains("*/")){
                    flag=false;
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(CounterPHY.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
}
