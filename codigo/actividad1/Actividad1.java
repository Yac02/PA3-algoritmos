/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1;

/**
 *
 * @author lychi
 */

public class Actividad1{
    static class Nodo{
        int dato;
        Nodo siguiente;

        public Nodo(int dato){
            this.dato = dato;
            this.siguiente = null;
        }
    }
    static class PilaLista{
        private Nodo tope;
        public PilaLista(){
            tope = null;
        }
        public void push(int dato){
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = tope;
            tope = nuevo;

            System.out.println("Solicitud " + dato + " apilado correctamente");
        }
        public int pop(){
            if (tope == null){
                System.out.println("La pila esta vacia");
                return -1;
            }
            int dato = tope.dato;
            tope = tope.siguiente;
            return dato;
        }
        public int verTope(){
            if (tope == null){
                return -1;
            }
            return tope.dato;
        }
        public boolean estaVacia(){
            return tope == null;
        }
        public void mostrar(){
            Nodo actual = tope;
            if (actual == null){
                System.out.println("La pila esta vacia");
                return;
            }
            while (actual != null){
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }
    public static void main(String[] args){

        PilaLista pila = new PilaLista();

        System.out.println("=== PILA DE SOLICITUDES ===");

        pila.push(101);
        pila.push(102);
        pila.push(103);

        System.out.println("Solicitudes registradas:");
        pila.mostrar();
        System.out.println("Solicitud en el tope: " + pila.verTope());
        System.out.println("Desapilar solicitud: " + pila.pop());
        System.out.println("Solicitudes despues de desapilar:");
        pila.mostrar();
        System.out.println("¿La pila esta vacia?: " + pila.estaVacia());
    }
}

