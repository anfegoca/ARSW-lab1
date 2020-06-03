/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.model;

import java.io.BufferedReader;

/**
 * Esta interface ofrece el servicio de contar las lineas que hay en un BufferedReader
 * @author Andres Gonzalez
 */
public interface Counter {
    
    /**
     * Cuenta las lineas del BufferedReader dado
     * @param br BufferedReader archivo leido
     * @return numero de lineas del archivo
     */
    public abstract int count(BufferedReader br );
    
}
