import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArregloLetras arregloLetras = new ArregloLetras();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("------------ Menu ------------");
            System.out.println("1. Inicializar / Borrar arreglo");
            System.out.println("2. Mostrar arreglo");
            System.out.println("3. Buscar");
            System.out.println("4. Insertar");
            System.out.println("5. Eliminar");
            System.out.println("6. Modificar");
            System.out.println("7. Creditos");
            System.out.println("8. Salir");
            System.out.println("Seleccione una opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    arregloLetras.IniciarArreglo();
                    break;
                case 2:
                    arregloLetras.MostrarArreglo();
                    break;
                case 3:
                    arregloLetras.Buscar();
                    break;
                case 4:
                    arregloLetras.Insertar();
                    break;
                case 5:
                    arregloLetras.Eliminar();
                    break;
                case 6:
                    arregloLetras.Modificar();
                    break;
                case 7:
                    arregloLetras.MostrarCreditos();
                    break;
                case 8:
                    System.out.println("Saliendo del programa");
                    return;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (true);
    }
}