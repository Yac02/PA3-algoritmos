import java.util.ArrayDeque;
import java.util.Deque;


public class Actividad4 {

    public static void main(String[] args) {
        System.out.println("=== ACTIVIDAD 4: COMPARACION ENTRE PILA Y COLA ===\n");

        // PILA (LIFO): la ultima accion registrada es la primera en deshacerse.
        Deque<String> pila = new ArrayDeque<>();
        pila.push("Registrar matricula");
        pila.push("Modificar horario");
        pila.push("Actualizar datos del estudiante");

        System.out.println("PILA - LIFO (ultimo en entrar, primero en salir)");
        System.out.println("Acciones registradas (tope primero): " + pila);
        System.out.println("Ultima accion registrada: " + pila.peek());
        System.out.println("Accion que se deshace primero: " + pila.pop());
        System.out.println("Acciones restantes: " + pila);
        System.out.println("¿Pila vacia?: " + pila.isEmpty());

        System.out.println();

        // COLA (FIFO): la primera solicitud recibida es la primera en atenderse.
        Deque<String> cola = new ArrayDeque<>();
        cola.offer("Solicitud de constancia");
        cola.offer("Solicitud de certificado");
        cola.offer("Consulta de matricula");

        System.out.println("COLA - FIFO (primero en entrar, primero en salir)");
        System.out.println("Solicitudes pendientes (frente primero): " + cola);
        System.out.println("Primera solicitud en espera: " + cola.peek());
        System.out.println("Solicitud que se atiende primero: " + cola.poll());
        System.out.println("Solicitudes restantes: " + cola);
        System.out.println("¿Cola vacia?: " + cola.isEmpty());

        System.out.println("\nCONCLUSION:");
        System.out.println("La pila sirve para revertir acciones desde la mas reciente.");
        System.out.println("La cola sirve para atender solicitudes en orden de llegada.");
        System.out.println("Elegir la estructura correcta mejora el orden y la coherencia del proceso.");
    }
}
