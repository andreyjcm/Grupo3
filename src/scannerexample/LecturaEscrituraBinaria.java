/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laboratorio
 */
public class LecturaEscrituraBinaria {
    public void GrabarDatosBinarios (String nombreArchivo)
    {
        try (FileOutputStream outfile1 = new FileOutputStream(nombreArchivo, false)) {
            ObjectOutputStream oos = new ObjectOutputStream(outfile1);
            for (int i = 0; i < 20; i++)
            {
                RegistroVario datosParaGrabar = new RegistroVario();
                datosParaGrabar.campo1 = "Hello world";
                datosParaGrabar.campo2 = Math.random();
                datosParaGrabar.campo3 = new Date();
                datosParaGrabar.campo4 = 50;
                oos.writeObject(datosParaGrabar);
            }
        } catch (IOException ex) {
            Logger.getLogger(LecturaEscrituraBinaria.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<RegistroVario> LeerDatosBinarios (String nombreArchivo)
    {
        ArrayList<RegistroVario> resultado = null;
        try (FileInputStream infile1 = new FileInputStream(nombreArchivo)) {
            resultado = new ArrayList<>();
            ObjectInputStream ois = new ObjectInputStream(infile1);
            for (int i = 0; i < 20; i++)
            {
                RegistroVario registroLeido = new RegistroVario();
                try {
                    registroLeido = (RegistroVario)ois.readObject();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LecturaEscrituraBinaria.class.getName()).log(Level.SEVERE, null, ex);
                }
                resultado.add(registroLeido);
            }
        } catch (IOException ex) {
            Logger.getLogger(LecturaEscrituraBinaria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;

    }

}
