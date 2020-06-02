/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres Gonzalez
 */
public class Reader {
    
    /**
     * 
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
