import java.util.Scanner;

public class ArregloLetras {
    private final char[] arreglo = new char[20];
    private int nElementos = 0;

    public void IniciarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = '\0';
        }
        nElementos = 0;
        System.out.println("Arreglo inicializado.");
    }

    public void MostrarArreglo() {
        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public void Buscar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la letra a buscar: ");
        char letra = leerLetra(scanner);

        int indice = -1;
        for (int i = 0; i < nElementos; i++) {
            if (Character.toLowerCase(arreglo[i]) == Character.toLowerCase(letra)) {
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

    public void Insertar() {
        Scanner scanner = new Scanner(System.in);
        if (nElementos == arreglo.length) {
            System.out.println("El arreglo está lleno.");
            return;
        }

        System.out.print("Ingrese la letra a insertar: ");
        char letra = leerLetra(scanner);

        int indice = 0;
        while (indice < nElementos && Character.toLowerCase(arreglo[indice]) < Character.toLowerCase(letra)) {
            indice++;
        }

        for (int i = nElementos; i > indice; i--) {
            arreglo[i] = arreglo[i - 1];
        }

        arreglo[indice] = letra;
        nElementos++;
        System.out.println("'" + letra + "' insertado en la posición " + indice + ".");
    }

    public void Eliminar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la letra a eliminar: ");
        char letra = leerLetra(scanner);

        int indice = -1;
        for (int i = 0; i < nElementos; i++) {
            if (Character.toLowerCase(arreglo[i]) == Character.toLowerCase(letra)) {
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

    public void Modificar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la letra a modificar: ");
        char letra = leerLetra(scanner);

        int indice = -1;
        for (int i = 0; i < nElementos; i++) {
            if (Character.toLowerCase(arreglo[i]) == Character.toLowerCase(letra)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.print("Ingrese la nueva letra: ");
            char nuevaLetra = leerLetra(scanner);
            arreglo[indice] = nuevaLetra;
            System.out.println("'" + letra + "' modificado a '" + nuevaLetra + "' en la posición " + indice + ".");

            for (int i = 0; i < nElementos - 1; i++) {
                for (int j = 0; j < nElementos - i - 1; j++) {
                    if (Character.toLowerCase(arreglo[j]) > Character.toLowerCase(arreglo[j + 1])) {
                        char temp = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = temp;
                    }
                }
            }
        } else {
            System.out.println("'" + letra + "' no encontrado en el arreglo.");
        }
    }

    private char leerLetra(Scanner scanner) {
        String input;
        char letra;
        do {
            input = scanner.nextLine();
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Por favor, ingrese una letra válida.");
                System.out.print("Ingrese la letra: ");
            }
        } while (input.length() != 1 || !Character.isLetter(input.charAt(0)));
        letra = input.charAt(0);
        return letra;
    }

    public void MostrarCreditos(){
        System.out.println("Creditos: ");
        System.out.println("Materia: Estructura de datos");
        System.out.println("Nombre: Marco Antonio Chavez Baltierrez || 4C || 22170149");
        System.out.println("Nombre: Jesus Alberto Ramirez Gonzalez  || 4C || 22170147");
    }
}
