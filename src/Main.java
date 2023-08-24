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
        llamarMetodos(ans,dimensiones);
        menu(dimensiones);
    }
    public static void llamarMetodos(int ans, int[] dimensiones){
        Scanner teclado = new Scanner(System.in);
        int filas = dimensiones[0];
        int cols = dimensiones[1];
        switch (ans){
            case 1 -> {
                System.out.println("Validacion: "+validarDimensiones(filas,cols));
                System.out.println();
            }
            case 2->{
                crearMatriz(filas,cols);
                System.out.println("Matriz creada");
                System.out.println();
            }
            case 3->{
                rellenarMatriz(crearMatriz(filas,cols));
                System.out.println("Matriz rellenada");
                System.out.println();
            }
            case 4->{
                System.out.println("Fila que desea mostrar");
                int fila = teclado.nextInt();
                mostrarFilaMatriz(rellenarMatriz(crearMatriz(filas,cols)),fila);
                System.out.println();
            }
            case 5 ->{
                System.out.println("La matriz es una matriz cero: "+matrizCero(rellenarMatriz(crearMatriz(filas,cols))));
                System.out.println();
            }
            case 6->{
                System.out.println("Saliendo");
                System.exit(0);
            }
        }
    }
    public static int[] dimensiones(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Filas");
        int filas = teclado.nextInt();
        System.out.println("Columnas");
        int cols = teclado.nextInt();
        int dimensiones[] = new int[2];
        dimensiones[0]= filas;
        dimensiones[1]=cols;
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
            }
        }
        return matriz;
    }
    public static void mostrarFilaMatriz(int[][] matriz, int fila){
        for (int i = 0; i < matriz[fila-1].length; i++) {
            System.out.print("["+matriz[fila-1][i]+"]");
        }
        System.out.println();

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