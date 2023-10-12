import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArregloLetras {
    private ArrayList<Character> letras = new ArrayList<>();

    public void inicializarArreglo() {
        letras.clear();
        System.out.println("El arreglo ha sido inicializado.");
    }

    public void mostrarArreglo() {
        if (letras.isEmpty()) {
            System.out.println("El arreglo está vacío.");
        } else {
            System.out.println("Elementos en el arreglo: " + letras);
        }
    }

    public void buscarLetra(char letra) {
        int index = letras.indexOf(letra);
        if (index != -1) {
            System.out.println("La letra '" + letra + "' se encuentra en la posición " + (index + 1) + " del arreglo.");
        } else {
            System.out.println("La letra '" + letra + "' no se encuentra en el arreglo.");
        }
    }

    public void insertarLetra(char letra) {
        if (letras.size() < 20) {
            if (Character.isLetter(letra)) {
                int index = 0;
                char letraMayuscula = Character.toUpperCase(letra);

                while (index < letras.size()) {
                    char current = letras.get(index);
                    char currentMayuscula = Character.toUpperCase(current);

                    if (letraMayuscula < currentMayuscula || (letraMayuscula == currentMayuscula && letra < current)) {
                        break;
                    }
                    index++;
                }

                letras.add(index, letra);
                System.out.println("La letra '" + letra + "' ha sido insertada en la posición " + index + ".");
            } else {
                System.out.println("No se puede insertar caracteres especiales en el arreglo.");
            }
        } else {
            System.out.println("El arreglo está lleno, no se puede insertar más elementos.");
        }
    }



    public void eliminarLetra(char letra) {
        int index = letras.indexOf(letra);
        if (index != -1) {
            letras.remove(index);
            System.out.println("La letra '" + letra + "' ha sido eliminada de la posición " + (index + 1) + ".");
        } else {
            System.out.println("La letra '" + letra + "' no se encuentra en el arreglo.");
        }
    }

    public void modificarLetra(char letra, char nuevaLetra) {
        if (Character.isLetter(letra) && Character.isLetter(nuevaLetra)) {
            int index = letras.indexOf(letra);
            if (index != -1) {
                letras.remove(index);

                insertarLetra(nuevaLetra);

                System.out.println("La letra '" + letra + "' ha sido reemplazada por '" + nuevaLetra + "' y el arreglo ha sido reordenado.");
            } else {
                System.out.println("La letra '" + letra + "' no se encuentra en el arreglo.");
            }
        } else {
            System.out.println("No se pueden utilizar caracteres especiales en la modificación.");
        }
    }

    public void MostrarCreditos(){
        System.out.println("Creditos: ");
        System.out.println("Materia: Estructura de datos");
        System.out.println("Nombre: Marco Antonio Chavez Baltierrez || 4C || 22170149");
        System.out.println("Nombre: Jesus Alberto Ramirez Gonzalez  || 4C || 22170147");
    }
}
