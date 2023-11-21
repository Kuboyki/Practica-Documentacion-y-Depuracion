import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * MatrizEntera es una clase que encapsula una matriz de
 * numero enteros, con funcionalidades para inicializar
 * aleatoriamente la matriz,imprimir por pantalla o
 * en fichero y transponerlo.
 *
 * @author JINGHONG DONG
 * @version 1.0
 */
public class MatrizEntera {
    /**
     * Numero de filas de la matriz
     */
    private final int FILAS;
    /**
     * Numero de columnas de la matriz
     */
    private final int COLUMNAS;
    /**
     * Matriz de numero enteros
     */
    private int [][] matriz;

    /**
     * Instancia una nueva matriz entera de tamaño
     * filas por columnas.
     *
     * @param filas numeros de fila que tendra la matriz
     * @param columnas numeros de columnas que tendra la matriz
     */
    public MatrizEntera(int filas,int columnas){
        this.COLUMNAS=columnas;
        this.FILAS=filas;
        matriz = new int[filas][columnas];
    }

    /**
     * Devuelve el valor de una celda de la matriz.
     *
     * @param fila  el numero de fila de la matriz
     * @param columna el numero de columna de la celda de la matriz
     * @return the valor
     */
    public int getValor (int fila,int columna){
        return matriz [fila][columna];
    }

    /**
     * Inicializa la matriz con valorares aleatorios.
     *
     * @param rand el generador de numeros aleatorios
     */
    public void iniciarAleatorio(Random rand){
        for(int f=0;f<FILAS;f++){
            for(int c=0; c<COLUMNAS;c++){
            matriz [f][c] = rand.nextInt();
            }
        }
    }

    /**
     * Imprime la matriz por salida de teclado.
     */
    public void imprimir(){
        for(int f=0; f<FILAS;f++){
            for (int c=0;c<COLUMNAS;c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
    /**
     * Imprime la matriz en un fichero de texto.
     *
     * @param fichero nombre del fichero de texto
     * @throws IOException error de escritura en el fichero
     */
    public void imprimirEnFichero(String fichero) throws IOException{
        PrintWriter pw = new PrintWriter(fichero);
        for (int f=0; f<FILAS;f++){
            for (int c=0;c<COLUMNAS;c++){
                pw.print(matriz[f][c]+" ");
            }
            pw.println();
        }
        pw.close();
    }

    /**
     * Trasnspone la matriz de enteros.
     * Para ello se lleva cabo un recorrido por la matriz
     * y se intercambian los valores de la diagonal
     * superior con los de la diagonal inferior.
     */
    public void transponer(){
        for(int f=0;f<FILAS;f++){
            for(int c=0;c<COLUMNAS;c++){
                int aux = matriz[f][c];
                matriz[f][c]=matriz[c][f];
                matriz[c][f]=aux;
                System.out.println("Estado tras camibiar "+f+","+c);
                imprimir();
                System.out.println();
            }
        }
    }
}
