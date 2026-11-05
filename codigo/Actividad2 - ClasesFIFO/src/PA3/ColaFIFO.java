package PA3;

public class ColaFIFO {

    private String[] datos;
    private int frente;
    private int fin;
    private int tamano;
    private int capacidad;

    public ColaFIFO(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new String[capacidad];
        this.frente = 0;
        this.fin = 0;
        this.tamano = 0;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public boolean estaLlena() {
        return tamano == capacidad;
    }

    public void encolar(String elemento) {
        if (estaLlena()) {
            throw new IllegalStateException("Cola llena: no se puede encolar.");
        }

        datos[fin] = elemento;
        fin = (fin + 1) % capacidad;
        tamano++;
    }

    public String desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("Cola vacía: no se puede desencolar.");
        }

        String elemento = datos[frente];
        datos[frente] = null;
        frente = (frente + 1) % capacidad;
        tamano--;

        return elemento;
    }

    public String verFrente() {
        if (estaVacia()) {
            throw new IllegalStateException("Cola vacía: no hay frente.");
        }

        return datos[frente];
    }

    public int getTamano() {
        return tamano;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return;
        }

        System.out.print("Frente -> ");
        for (int i = 0; i < tamano; i++) {
            int posicion = (frente + i) % capacidad;
            System.out.print("[" + datos[posicion] + "]");
            if (i < tamano - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(" <- Final");
    }
}