package com.company;

import java.util.ArrayList;

public class Main {
    static  ArrayList<char[][]> salas = new ArrayList<char[][]>();


    public static void main(String[] args) {

        crearSalas(5);

        mostrarSala(salas.get(0));
        venderEntrada(salas.get(0));
        mostrarSala(salas.get(0));

    }

    public static void crearSalas(int n) {
        int filas;
        int cols;
        for (int i=0; i<n; i++) {
            filas = randomFilas();
            cols = randomColumnas();
          //  System.out.println("Filas: "+filas +" Cols: "+cols);
            salas.add(new char[filas][cols]);
            salas.set(i,llenarSala(filas,cols));
        }
        //return salas;
    }


    private static int randomFilas() {
        return (int) (Math.random()*26+1);
    }

    public static int randomColumnas() {
        return (int) (Math.random()*29+1);
    }

    public static char[][] llenarSala(int fila, int col) {
        char [][] sala = new char[fila][col];
        for (int i=0; i<fila; i++) {
            for (int j=0; j<col; j++) {
                sala[i][j]= '0';
            }
        }
        return sala;
    }

    public static void mostrarSala(char sala[][]) {
        for(int j=0; j <sala[0].length;j++) {
            System.out.print("["+(j+1)+"]");
        }
        System.out.println("\n");
        for (int i=0;i<sala.length;i++) {
            System.out.print("["+(char)(i+97)+"]");
            for (int j=0;j<sala[0].length;j++) {
                 System.out.print(sala[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    public static void venderEntrada(char sala[][]) {
        sala[getFila()][getCol()] = 'X';

    }

    public static int getFila() {
        return 5;
    }

    public static int getCol() {
        return 5;
    }
}
