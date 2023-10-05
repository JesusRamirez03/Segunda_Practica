using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Segunda_practica_estructura_datos
{
    internal class ArregloLetras
    {
        private char[] arreglo = new char[20];
        private int nElementos = 0;

        public void InicializarArreglo()
        {
            for (int i = 0; i < arreglo.Length; i++)
            {
                arreglo[i] = '\0';
            }
            nElementos = 0;
            Console.WriteLine("Arreglo inicializado.");
        }

        public void MostrarArreglo()
        {
            Console.WriteLine("Elementos del arreglo:");
            for (int i = 0; i < nElementos; i++)
            {
                Console.Write(arreglo[i] + " ");
            }
            Console.WriteLine();
        }

        public void Buscar()
        {
            Console.Write("Ingrese la letra a buscar: ");
            char letra = char.Parse(Console.ReadLine().ToLower());
            int indice = Array.IndexOf(arreglo, letra);
            if (indice != -1)
            {
                Console.WriteLine($"'{letra}' encontrado en la posición {indice}.");
            }
            else
            {
                Console.WriteLine($"'{letra}' no encontrado en el arreglo.");
            }
        }

        public void Insertar()
        {
            if (nElementos == arreglo.Length)
            {
                Console.WriteLine("El arreglo está lleno.");
                return;
            }

            Console.Write("Ingrese la letra a insertar: ");
            char letra = char.Parse(Console.ReadLine().ToLower());

            int indice = 0;
            while (indice < nElementos && arreglo[indice] < letra)
            {
                indice++;
            }

            for (int i = nElementos; i > indice; i--)
            {
                arreglo[i] = arreglo[i - 1];
            }

            arreglo[indice] = letra;
            nElementos++;
            Console.WriteLine($"'{letra}' insertado en la posición {indice}.");
        }

        public void Eliminar()
        {
            Console.Write("Ingrese la letra a eliminar: ");
            char letra = char.Parse(Console.ReadLine().ToLower());

            int indice = Array.IndexOf(arreglo, letra);
            if (indice != -1)
            {
                for (int i = indice; i < nElementos - 1; i++)
                {
                    arreglo[i] = arreglo[i + 1];
                }
                arreglo[nElementos - 1] = '\0';
                nElementos--;
                Console.WriteLine($"'{letra}' eliminado de la posición {indice}.");
            }
            else
            {
                Console.WriteLine($"'{letra}' no encontrado en el arreglo.");
            }
        }

        public void Modificar()
        {
            Console.Write("Ingrese la letra a modificar: ");
            char letra = char.Parse(Console.ReadLine().ToLower());

            int indice = Array.IndexOf(arreglo, letra);
            if (indice != -1)
            {
                Console.Write("Ingrese la nueva letra: ");
                char nuevaLetra = char.Parse(Console.ReadLine().ToLower());
                arreglo[indice] = nuevaLetra;
                Console.WriteLine($"'{letra}' modificado a '{nuevaLetra}' en la posición {indice}.");
            }
            else
            {
                Console.WriteLine($"'{letra}' no encontrado en el arreglo.");
            }
        }

        public void MostrarCreditos()
        {
            Console.WriteLine("Créditos:");
            Console.WriteLine("Materia: Estructura de datos");
            Console.WriteLine("Integrantes del equipo:");
            Console.WriteLine("Nombre: Marco Antonio Chavez Baltierrez || 2C || 22170149");
            Console.WriteLine("Nombre: Jesus Alberto Ramirez Gonzalez  || 2C || 22170147");
        }
    }
}
