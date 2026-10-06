import java.util.Queue;
import java.util.Scanner;

public class Metodos {

    public boolean RegistrarCliente(Queue<ObjCliente> caja, Scanner sc ) {

        ObjCliente cliente = new ObjCliente();

        System.out.println("Ingrese el ID del cliente: ");   
        cliente.setIdCliente(sc.next());

        System.out.println("Ingrese el nombre del cliente: ");
        cliente.setNombre(sc.next());

        sc.nextLine();   

        System.out.println("Ingrese tipo de atención: ");
        cliente.setClaseAtencion(sc.nextLine());

        System.out.println("Ingrese el número de caja: ");
        cliente.setNumeroCaja(sc.nextInt());
        
        System.out.println("Ingrese el turno: ");
        cliente.setTurno(sc.next());

        caja.offer(cliente);

        System.out.println("Cliente registrado correctamente.");

        return true;
    }

    public void MostrarClientes(Queue<ObjCliente> caja) {

    if (caja.isEmpty()) {

        System.out.println("No hay clientes en la caja.");

    } else {

        for (ObjCliente cliente : caja) {

            System.out.println("----------------------");
            System.out.println("ID: " + cliente.getIdCliente());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Clase de atención: " + cliente.getClaseAtencion());
            System.out.println("Número de caja: " + cliente.getNumeroCaja());
            System.out.println("Turno: " + cliente.getTurno());
        }
    }
}

public ObjCliente AtenderCliente(Queue<ObjCliente> caja) {

    if (caja.isEmpty()) {

        System.out.println("No hay clientes para atender.");

        return null;

    } else {

        ObjCliente cliente = caja.poll();

        System.out.println("Cliente atendido.");
        System.out.println("ID: " + cliente.getIdCliente());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Turno: " + cliente.getTurno());

        return cliente;
    }
}

public boolean AbandonarFila(Queue<ObjCliente> caja, Scanner sc) {

    System.out.println("Ingrese el ID del cliente:");
    String id = sc.next();

    ObjCliente cliente = null;

    for (ObjCliente o : caja) {

        if (o.getIdCliente().equals(id)) {

            cliente = o;
            break;
        }
    }

    if (cliente != null) {

        caja.remove(cliente);

        System.out.println("El cliente abandono la fila.");

        return true;

    } else {

        System.out.println("No se encontro el cliente.");

        return false;
    }
}

public ObjCliente CambiarCaja(Queue<ObjCliente> clientes, Scanner sc) {

    System.out.println("Ingrese el ID del cliente:");
    String id = sc.next();

    for (ObjCliente cliente : clientes) {

        if (cliente.getIdCliente().equals(id)) {

            System.out.println("Ingrese el nuevo numero de caja:");
            int numeroCaja = sc.nextInt();

            cliente.setNumeroCaja(numeroCaja);

            System.out.println("El cliente cambio de caja.");
            System.out.println("Nueva caja: " + cliente.getNumeroCaja());

            return cliente;
        }
    }

    System.out.println("No se encontro el cliente.");

    return null;
}
    
}
