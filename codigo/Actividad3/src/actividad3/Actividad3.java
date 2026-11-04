package actividad3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/*
 * ============================================================================
 * PSEUDOCÓDIGO — ACTIVIDAD 3
 * ============================================================================
 * Algoritmo SeleccionEstructuras_Actividad3
 * Inicio
 *     // Situaciones 1 y 3: Mecanismo LIFO (Pila)
 *     Crear Pila acciones_y_urgencias (tope = -1)
 *     
 *     // Registrar acciones recientes (Push / Apilar)
 *     Apilar(acciones_y_urgencias, "Cambio 1: Ingreso de sílabo")
 *     Apilar(acciones_y_urgencias, "Cambio 2: Actualización de aula")
 *     Apilar(acciones_y_urgencias, "Cambio 3: Borrado accidental de alumno")
 *     
 *     // Revertir último cambio o atender último ingresado primero (Pop / Desapilar)
 *     Si NO EstaVacia(acciones_y_urgencias) Entonces
 *         ultimo <- Desapilar(acciones_y_urgencias)
 *         Imprimir "Revirtiendo/Atendiendo primero el último ingresado: ", ultimo
 *     FinSi
 * 
 *     // Situaciones 2 y 4: Mecanismo FIFO (Cola)
 *     Crear Cola tramites_pendientes (front = 0, rear = -1)
 *     
 *     // Llegada de solicitudes y flujo de espera (Enqueue / Encolar por el final)
 *     Encolar(tramites_pendientes, "Trámite 1: Emisión de certificado")
 *     Encolar(tramites_pendientes, "Trámite 2: Convalidación de curso")
 *     
 *     // Atención en orden de llegada (Dequeue / Desencolar por el frente)
 *     Si NO EstaVacia(tramites_pendientes) Entonces
 *         primero <- Desencolar(tramites_pendientes)
 *         Imprimir "Atendiendo por orden de llegada: ", primero
 *     FinSi
 * Fin
 * ============================================================================
 */

/**
 * @author Jack
 */
public class Actividad3 {

    // Estructura Pila (LIFO)
    static class PilaLIFO {
        private String[] datos;
        private int tope;

        public PilaLIFO(int capacidad) {
            datos = new String[capacidad];
            tope = -1;
        }

        public void apilar(String elemento) { // Push O(1)
            if (tope < datos.length - 1) {
                datos[++tope] = elemento;
                System.out.println("  [PUSH - Apilado en tope]: " + elemento);
            }
        }

        public String desapilar() { // Pop O(1)
            if (tope >= 0) {
                return datos[tope--];
            }
            return "Pila vacía (Underflow)";
        }
    }

    // Estructura Cola (FIFO) 
    static class ColaFIFO {
        private String[] datos;
        private int front;
        private int rear;
        private int cantidad;

        public ColaFIFO(int capacidad) {
            datos = new String[capacidad];
            front = 0;
            rear = -1;
            cantidad = 0;
        }

        public void encolar(String elemento) { // Enqueue O(1)
            if (cantidad < datos.length) {
                rear++;
                datos[rear] = elemento;
                cantidad++;
                System.out.println("  [ENQUEUE - Encolado en rear]: " + elemento);
            }
        }

        public String desencolar() { // Dequeue O(1)
            if (cantidad > 0) {
                String valor = datos[front];
                front++;
                cantidad--;
                return valor;
            }
            return "Cola vacía (Underflow)";
        }
    }

    public static void main(String[] args) {
        // Forzar UTF-8 
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("=== DEMOSTRACIÓN ACTIVIDAD 3: SITUACIONES REALES ===\n");

        // SITUACIÓN 1: PILA
        System.out.println("1. Revertir cambios recientes (Estructura elegida: PILA LIFO)");
        PilaLIFO historialCambios = new PilaLIFO(5);
        historialCambios.apilar("Cambio 1: Ingreso de sílabo");
        historialCambios.apilar("Cambio 2: Actualización de aula");
        historialCambios.apilar("Cambio 3: Borrado accidental de alumno");
        System.out.println("  -> [POP - Revirtiendo última acción]: " + historialCambios.desapilar() + "\n");

        // SITUACIÓN 2: COLA
        System.out.println("2. Atención en orden de llegada (Estructura elegida: COLA FIFO)");
        ColaFIFO atencionSolicitudes = new ColaFIFO(5);
        atencionSolicitudes.encolar("Solicitud #101 - Juan Pérez");
        atencionSolicitudes.encolar("Solicitud #102 - María Gómez");
        System.out.println("  -> [DEQUEUE - Atendiendo en frente]: " + atencionSolicitudes.desencolar() + "\n");

        // SITUACIÓN 3: PILA
        System.out.println("3. Último ingresado se atiende primero (Estructura elegida: PILA LIFO)");
        PilaLIFO procesamientoPrioritario = new PilaLIFO(5);
        procesamientoPrioritario.apilar("Proceso A (Ingresó 08:00 AM)");
        procesamientoPrioritario.apilar("Proceso B (Ingresó 09:30 AM - Último)");
        System.out.println("  -> [POP - Atendiendo el más reciente]: " + procesamientoPrioritario.desapilar() + "\n");

        // SITUACIÓN 4: COLA
        System.out.println("4. Flujo de espera de trámites pendientes (Estructura elegida: COLA FIFO)");
        ColaFIFO flujoTramites = new ColaFIFO(5);
        flujoTramites.encolar("Trámite 1: Emisión de certificado");
        flujoTramites.encolar("Trámite 2: Convalidación de curso");
        System.out.println("  -> [DEQUEUE - Despachando primer trámite]: " + flujoTramites.desencolar());
        System.out.println("  -> [DEQUEUE - Despachando siguiente trámite]: " + flujoTramites.desencolar());
    }
}