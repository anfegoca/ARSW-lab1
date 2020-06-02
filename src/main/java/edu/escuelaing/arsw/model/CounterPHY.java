/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres Gonzalez
 */
public class CounterPHY implements Counter {

    /**
     * 
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
