/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scannerexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laboratorio
 */
public class LecturaNotas {
    
    public int TotalNotas (ArrayList<Integer> notas)
    {
        int total = 0;
        for (int i = 0;i < notas.size(); i++)
            total += notas.get(i);
        return (total);
    }
    
    public double PromedioNotas (ArrayList<Integer> notas)
    {
       double total = TotalNotas (notas);
       double promedio = total / notas.size(); 
       return promedio;
    }
    
    public void ConvertirLineaEnArrayList (String linea, 
            ArrayList<Integer> listaNotas, StringBuffer nombreClase )
    {
        String[] st = linea.split("[:]+");
        nombreClase.append(st[0]);
        for (int n=1; n<st.length; n++)
            listaNotas.add(Integer.parseInt(st[n]));
    }
    
    public void CargarNotas (String NombreArchivo)
    {
        File gradeFile = new File(NombreArchivo);
       if(gradeFile.exists()) {
            try {
                Scanner inFile = new Scanner(gradeFile);
                while( inFile.hasNextLine() ) {
                    String line = inFile.nextLine();                    
                    ArrayList <Integer> notas = new ArrayList();
                    StringBuffer  nombreClase = new StringBuffer();
                    ConvertirLineaEnArrayList (line, notas, nombreClase);
                    double promedioNotas = PromedioNotas(notas);
                    System.out.println(nombreClase + "'s average is " + promedioNotas);
                }
                inFile.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ScannerExample.class.getName()).log(Level.SEVERE, null, ex);
     }
}        
    }
    
}
