import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarFilaMatriz(rellenarMatriz(crearMatriz(4,4)),1);
    }


    public static boolean validarDimensiones(int filas, int cols){

        if (filas > 0 && cols>0){
            return true;


        }return false;
    }
    public static int[][] crearMatriz(int filas, int cols){
        int[][] matriz = new int[filas][cols];
        return matriz;
    }
    public static int[][] rellenarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                matriz[i][j] = (int) (Math.random()*9);
            }
        }
        return matriz;
    }
    public static void mostrarFilaMatriz(int[][] matriz, int fila){
        for (int i = 0; i < matriz[fila-1].length; i++) {
            System.out.print("["+matriz[fila-1][i]+"]");
        }
    }

}