import java.util.Arrays;
import java.util.Scanner;

public class ArregloLetras {
    private final char[] arreglo = new char[20];
    private int nElementos = 0;

    public void IniciarArreglo(){
        Arrays.fill(arreglo, '\0');
        nElementos = 0;
        System.out.println("Arreglo inicializado.");
    }
    public void MostrarArreglo(){
        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
    public void Buscar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la letra a buscar: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);

        int indice = -1;
        for (int i = 0; i < nElementos; i++) {
            if (arreglo[i] == letra) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.println("'" + letra + "' encontrado en la posición " + indice + ".");
        } else {
            System.out.println("'" + letra + "' no encontrado en el arreglo.");
        }

    }
    public void Insertar(){
        Scanner scanner = new Scanner(System.in);
        if (nElementos == arreglo.length) {
            System.out.println("El arreglo está lleno.");
            return;
        }

        System.out.print("Ingrese la letra a insertar: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);

        int indice = 0;
        while (indice < nElementos && arreglo[indice] < letra) {
            indice++;
        }

        for (int i = nElementos; i > indice; i--) {
            arreglo[i] = arreglo[i - 1];
        }

        arreglo[indice] = letra;
        nElementos++;
        System.out.println("'" + letra + "' insertado en la posición " + indice + ".");
    }
    public void Eliminar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la letra a eliminar: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);

        int indice = -1;
        for (int i = 0; i < nElementos; i++) {
            if (arreglo[i] == letra) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            for (int i = indice; i < nElementos - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
            arreglo[nElementos - 1] = '\0';
            nElementos--;
            System.out.println("'" + letra + "' eliminado de la posición " + indice + ".");
        } else {
            System.out.println("'" + letra + "' no encontrado en el arreglo.");
        }
    }
    public void Modificar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la letra a modificar: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);

        int indice = -1;
        for (int i = 0; i < nElementos; i++) {
            if (arreglo[i] == letra) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.print("Ingrese la nueva letra: ");
            char nuevaLetra = scanner.nextLine().toLowerCase().charAt(0);
            arreglo[indice] = nuevaLetra;
            System.out.println("'" + letra + "' modificado a '" + nuevaLetra + "' en la posición " + indice + ".");
        } else {
            System.out.println("'" + letra + "' no encontrado en el arreglo.");
        }
    }
    public void MostrarCreditos(){
        System.out.println("Creditos: ");
        System.out.println("Materia: Estructura de datos");
        System.out.println("Nombre: Marco Antonio Chavez Baltierrez || 4C || 22170149");
        System.out.println("Nombre: Jesus Alberto Ramirez Gonzalez  || 4C || 22170147");
    }
}
