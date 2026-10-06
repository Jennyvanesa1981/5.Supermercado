import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<ObjCliente> clientes = new LinkedList<>();

        Metodos m = new Metodos();

        int opcion = 0;

        while (opcion != 6) {

            System.out.println("\n--- SUPERMERCADO ---");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Atender cliente");
            System.out.println("4. Abandonar fila");
            System.out.println("5. Cambiar de caja");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opcion:");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    m.RegistrarCliente(clientes, sc);
                    break;

                case 2:
                    m.MostrarClientes(clientes);
                    break;

                case 3:
                    m.AtenderCliente(clientes);
                    break;

                case 4:
                    m.AbandonarFila(clientes, sc);
                    break;

                case 5:
                    m.CambiarCaja(clientes, sc);
                    break;

                case 6:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }

        sc.close();
    }
}