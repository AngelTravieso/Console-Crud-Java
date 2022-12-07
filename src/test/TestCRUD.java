package test;

import java.util.Scanner;

public class TestCRUD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("------------ Control de Usuarios --------------");

            System.out.println("\n Elija una opcion para continuar: \n");

            System.out.println("\t 1. Agregar Usuario");
            System.out.println("\t 2. Listar Usuarios");
            System.out.println("\t 3. Actualizar informacion usuario");
            System.out.println("\t 4. Eliminar usuario");
            System.out.println("\t 0. Salir");

            System.out.print("\n opcion: ");

            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 4);

        switch (opcion) {
            // cerrar programa
            case 0:
                System.out.println("Programa finalizado...");
                sc.close();
                break;
            case 1:
                System.out.println("Agregando usuario...");
                break;
            case 2:
                System.out.println("Listando usuarios");
                break;
            case 3:
                System.out.println("Actualizando info");
                break;
            case 4:
                System.out.println("eliminando usuario");
                break;
        }

    }

    public static void mostrarMenu(int opcion) {
        System.out.println(String.format("opcion: %s", opcion));
    }

}
