import java.util.Random;

/**
 * Principal es una clase encargada de realizar pruebas con
 * la clase MatrizEntera.
 *
 * @see MatrizEntera
 */
public class Principal {
    /**
     * Método main que crea una matriz de valores aleatorios de dimensión
     * especificada mediante argumentos de entrada (1 argumento entero para
     * tamaño de la matriz cuadrada, 2 para número de filas y columnas).
     * Se encarga de probar el método transponer de la clase MatrizEntera.
     *
     * @param args argumentos de entrada conteniendo la dimensión de la matriz
     * @see MatrizEntera#transponer()
     */
    public static void main(String[] args) {
        int filas, columnas;
        filas = Integer.parseInt(args[0]);
        if (args.length > 1)
            columnas = Integer.parseInt(args[1]);
        else
            columnas = filas;
        MatrizEntera matriz = new MatrizEntera(filas, columnas);
        Random rand = new Random();
        matriz.iniciarAleatorio(rand);
        matriz.imprimir();
        System.out.println();
        matriz.transponer();
        matriz.imprimir();
    }
}
