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
public class ScannerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lea del archivo de notas
        //LecturaNotas notas = new LecturaNotas();
        //notas.CargarNotas("scores.txt");
        // cargue el archivo binario con datos
        final String nombreArchivoSalida = "datosbinarios.dat";
        LecturaEscrituraBinaria lecturaEscritura = new LecturaEscrituraBinaria();
        lecturaEscritura.GrabarDatosBinarios(nombreArchivoSalida);
        ArrayList<RegistroVario> listaLeida = null;
        listaLeida = lecturaEscritura.LeerDatosBinarios(nombreArchivoSalida);
    }
    
}
