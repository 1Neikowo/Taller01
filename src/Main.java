import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu(dimensiones());
    }


    public static void menu(int[] dimensiones){
        Scanner teclado = new Scanner(System.in);
        System.out.println("1.- Verificar fila(M) y columnas(N)");
        System.out.println("2.- Crear matriz MxN");
        System.out.println("3.- Llenar matriz");
        System.out.println("4.- Mostrar fila M");
        System.out.println("5.- Matriz Cero");
        System.out.println("6.- Salir");
        System.out.println();
        int ans = teclado.nextInt();
        llamarMetodos(ans);
    }
    public static void llamarMetodos(int ans){
        switch (ans){
            case 1 -> {
                System.out.println("Validacion: "+validarDimensiones(dimensiones()[0],dimensiones()[1] ));
            }
        }
    }
    public static int[] dimensiones(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Filas");
        int filas = teclado.nextInt();
        System.out.println("Columnas");
        int cols = teclado.nextInt();
        int dimensiones[] = {filas,cols};
        return dimensiones;
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
                System.out.println(matriz[i][j]);
            }
        }
        return matriz;
    }
    public static void mostrarFilaMatriz(int[][] matriz, int fila){
        for (int i = 0; i < matriz[fila-1].length; i++) {
            System.out.print("["+matriz[fila-1][i]+"]");
        }
    }
    public static boolean matrizCero(int[][] matriz){
        int contador = 0;
        double calculoCero = 0;
        for (int i = 0; i < matriz.length; i++) {
            calculoCero = (double) ((matriz.length) + (matriz[i].length)) /2;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==0){
                    contador++;
                }
            }
        }
        if (contador > calculoCero){
            return true;
        }
        return false;
    }

}