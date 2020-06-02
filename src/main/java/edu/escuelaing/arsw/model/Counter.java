/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.model;

import java.io.BufferedReader;

/**
 *
 * @author Andres Gonzalez
 */
public interface Counter {
    
    /**
     * 
     * @param br BufferedReader archivo leido
     * @return numero de lineas del archivo
     */
    public abstract int count(BufferedReader br );
    
}
