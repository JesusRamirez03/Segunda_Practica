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
                    arregloLetras.inicializarArreglo();
                    break;
                case 2:
                    arregloLetras.mostrarArreglo();
                    break;
                case 3:
                    System.out.print("Ingrese la letra a buscar: ");
                    char letraBusqueda = scanner.next().charAt(0);
                    arregloLetras.buscarLetra(letraBusqueda);
                    break;
                case 4:
                    System.out.print("Ingrese la letra a insertar: ");
                    char letraInsercion = scanner.next().charAt(0);
                    arregloLetras.insertarLetra(letraInsercion);
                    break;
                case 5:
                    System.out.print("Ingrese la letra a eliminar: ");
                    char letraEliminar = scanner.next().charAt(0);
                    arregloLetras.eliminarLetra(letraEliminar);
                    break;
                case 6:
                    System.out.print("Ingrese la letra a modificar: ");
                    char letraModificar = scanner.next().charAt(0);
                    System.out.print("Ingrese la nueva letra: ");
                    char nuevaLetra = scanner.next().charAt(0);
                    arregloLetras.modificarLetra(letraModificar, nuevaLetra);
                    break;
                case 7:
                    arregloLetras.MostrarCreditos();
                    break;
                case 8:
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (true);
    }
}