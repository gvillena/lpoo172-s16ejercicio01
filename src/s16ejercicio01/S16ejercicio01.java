/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s16ejercicio01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class S16ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--------------------");
        System.out.println("-- TIENDA VIRTUAL --");
        System.out.println("--------------------\n");       
        
        ArrayList<TelefonoMovil> listaTlfMvl = new ArrayList<TelefonoMovil>();
        
        try 
        {
            Scanner sc = 
                    new Scanner(new FileReader("D:\\equipos.txt"));
            
            sc.nextLine();
            while (sc.hasNextLine()) 
            {
                String line = sc.nextLine();
                String[] fields = line.split("\t");
                
                String pantalla = fields[0];
                String camara = fields[1];
                String procesador = fields[2];                
                
                listaTlfMvl.add(new TelefonoMovil(camara, pantalla, procesador));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(S16ejercicio01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String header = String.format("%-20s %-10s %-10s", "PANTALLA", "CAMARA", "PROCESADOR");
        
        StringBuilder sb = new StringBuilder();        
        sb.append(header + "\n");
        
        for (TelefonoMovil tm : listaTlfMvl) {
            String line = String.format("%-20s %-10s %-10s", tm.getPantalla(), tm.getCamara(), tm.getProcesador());            
            sb.append(line);
            sb.append("\n");
        }
        
        System.out.println(sb.toString());

            
            // TODO code application logic here
    }
    
}
