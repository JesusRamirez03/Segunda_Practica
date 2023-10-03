using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Segunda_practica_estructura_datos
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ArregloLetras arregloLetras = new ArregloLetras();
            bool salir = false;

            while (!salir)
            {
                Console.WriteLine("Menú:");
                Console.WriteLine("1. Inicializar / Borrar arreglo");
                Console.WriteLine("2. Mostrar Arreglo");
                Console.WriteLine("3. Buscar");
                Console.WriteLine("4. Insertar");
                Console.WriteLine("5. Eliminar");
                Console.WriteLine("6. Modificar");
                Console.WriteLine("7. Créditos");
                Console.WriteLine("8. Salir");
                Console.Write("Seleccione una opción: ");

                int opcion = int.Parse(Console.ReadLine());

                switch (opcion)
                {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        Console.WriteLine("Opción no válida.");
                        break;
                }
            }
        }
    }
}
