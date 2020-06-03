package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.model.Counter;
import edu.escuelaing.arsw.model.CounterLOC;
import edu.escuelaing.arsw.model.CounterPHY;
import edu.escuelaing.arsw.model.Reader;

/**
 * Esta clase permite contar las lineas de un archivo, para contar las lineas fisicas se usa "py"
 * para contar las líneas de código se usa "loc"
 * @author Andres Gonzalez
 */
public class Countlines 
{
    /**
     * Primero va la opcion, si se quieren contar las lineas fisicas o las de codigo 
     * @param args array con la opción y la ruta del archivo
     */
    public static void main(String[] args) {
           if (args.length == 0 || args.length ==1) {
               System.out.println("incorrect arguments.");
           }
           else if("phy".equals(args[0])){
               Reader reader = new Reader();
               Counter counter = new CounterPHY();
               System.out.println("phy: "+counter.count(reader.read(args[1])));
           }else if(("loc".equals(args[0]))){
               Reader reader = new Reader();
               Counter counter = new CounterLOC();
               System.out.println("loc: "+counter.count(reader.read(args[1])));
           }
           else{
               System.out.println("incorrect arguments.");
           }
           
       }
}