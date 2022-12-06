package test;

import java.util.Scanner;

public class TestCRUD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("------------ Control de Usuarios --------------");

            System.out.println("\n Elija una opcion para continuar: \n");

            System.out.println("1. Agregar Usuario");
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Actualizar informacion usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("0. Salir");
            
            System.out.print("opcion: ");

            opcion = Integer.parseInt(sc.nextLine());
        } while (opcion < 0 || opcion > 4);

        switch (opcion) {
            case 0:
                mostrarMenu(opcion);
                break;
            case 1:
                mostrarMenu(opcion);
                break;
            case 2:
                mostrarMenu(opcion);
                break;
            case 3:
                mostrarMenu(opcion);
                break;
            case 4:
                mostrarMenu(opcion);
                break;
        }

    }

    public static void mostrarMenu(int opcion) {
        System.out.println(String.format("opcion: %s", opcion));
    }

}
