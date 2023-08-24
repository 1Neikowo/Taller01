import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

}