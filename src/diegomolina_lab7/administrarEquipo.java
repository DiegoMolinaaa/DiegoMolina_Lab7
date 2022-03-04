/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegomolina_lab7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class administrarEquipo {
    private File archivo = null;

    public administrarEquipo() {
    }
    public administrarEquipo(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void escribirArchivo(ArrayList<Equipo> equipos) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Equipo e : equipos) {
                bw.write(e.getNombre() + ";");
                bw.write(e.getpJugados()+ ";");
                bw.write(e.getpGanados()+ ";");
                bw.write(e.getpEmpatados()+ ";");
                bw.write(e.getpPerdidos()+ ";");
                bw.write(e.getGolFavor()+ ";");
                bw.write(e.getGolContra()+ ";");
                bw.write(e.getPuntos()+ ";"+"\n");
            }
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo(ArrayList<Equipo> equipos) {
        Scanner sc = null;
        equipos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    equipos.add(new Equipo(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }
}
