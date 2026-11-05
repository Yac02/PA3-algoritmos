package PA3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la capacidad de la cola: ");
        int capacidad = Integer.parseInt(sc.nextLine());

        if (capacidad <= 0) {
            System.out.println("La capacidad debe ser mayor que cero.");
            return;
        }

        ColaFIFO cola = new ColaFIFO(capacidad);
        int opcion;

        do {
            System.out.println("\n--- COLA FIFO: SOLICITUDES ACADÉMICAS ---");
            System.out.println("1. Encolar solicitud");
            System.out.println("2. Desencolar / atender solicitud");
            System.out.println("3. Ver frente de la cola");
            System.out.println("4. Verificar si la cola está vacía");
            System.out.println("5. Mostrar cola");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre de la solicitud: ");
                        String solicitud = sc.nextLine();
                        cola.encolar(solicitud);
                        System.out.println("Solicitud encolada correctamente.");
                        break;

                    case 2:
                        System.out.println("Solicitud atendida: " + cola.desencolar());
                        break;

                    case 3:
                        System.out.println("Frente de la cola: " + cola.verFrente());
                        break;

                    case 4:
                        if (cola.estaVacia()) {
                            System.out.println("La cola está vacía.");
                        } else {
                            System.out.println("La cola NO está vacía.");
                        }
                        break;

                    case 5:
                        cola.mostrar();
                        break;

                    case 6:
                        System.out.println("Fin del programa.");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número válido.");
                opcion = 0;
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
                opcion = 0;
            }

        } while (opcion != 6);

        sc.close();
    }
}
