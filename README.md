# README — Evaluación PA2

> **Curso:** ALGORITMO Y ESTRUCTURA DE DATOS BASADOS EN INTELIGENCIA ARTIFICIAL  
> **Código:** 4134.202620  
> **Evaluación:** PA3  
> **Equipo:** G4

## 1. Integrantes

| Integrante | Rol / Aporte principal |
| :--- | :--- |
| **Johann Condor Vargas** | Desarrollo de la Actividad 1 (Pila LIFO: representación gráfica, algoritmos de apilar/desapilar y aplicación concreta)[cite: 2]. |
| **Jean Luc Mellet** | Desarrollo de la Actividad 2 (Cola FIFO: representación gráfica, algoritmos de encolar/desencolar y aplicación concreta)[cite: 2]. |
| **Jack Stefano Tello Caballero** | Desarrollo de la Actividad 3 (Selección de estructura para situaciones reales y justificación técnica)[cite: 2]. |
| **Marcelo Gabriel García Campoblanco** | Desarrollo de la Actividad 4 (Comparación académica entre pila y cola, y redacción de conclusión grupal)[cite: 2]. |
| **Carlos Josue Flores Pareja** | Apoyo técnico, coordinación del equipo y edición/subida del video de exposición a YouTube con cámaras prendidas. |

## 2. Descripción y objetivo

**Problema:**  
Una unidad de servicios académicos necesita dos mecanismos distintos: uno para gestionar acciones que deben deshacerse en orden inverso al que fueron registradas y otro para atender solicitudes en el mismo orden en que llegan[cite: 2].

**Objetivo:**  
Modelar ambos procesos y proponer soluciones mediante estructuras LIFO (pilas) y FIFO (colas)[cite: 2]. Diseñar algoritmos para apilar, desapilar, encolar y desencolar, seleccionando la estructura más adecuada según el flujo del problema y sustentando la decisión técnica del equipo con argumentos claros[cite: 1].

## 3. Estructura del repositorio

* 📄 `Informe_PA3_Grupo4.pdf`: Documento principal (Entrega 1) con el desarrollo completo del caso, argumentación técnica, análisis de flujo y representaciones gráficas de LIFO y FIFO[cite: 2].
* 📁 `/codigo`: Carpeta que contiene los scripts y pseudocódigos de los algoritmos diseñados (apilar, desapilar, encolar, desencolar, etc.)[cite: 1, 2].
  * `Actividad1_Pila.java` 
  * `Actividad2_Cola.java`
* 📁 `/diagramas`: Carpeta con las imágenes de las representaciones gráficas de las pilas y colas para el caso propuesto[cite: 2].
* 📄 `README.md`: Documentación principal del repositorio (Entrega 3)[cite: 2].

## 4. Instrucciones de uso

```bash
# 1. Clonar el repositorio
git clone [https://github.com/Yac02/PA3-algoritmos.git](https://github.com/Yac02/PA3-algoritmos.git)

# 2. Navegar a la carpeta del proyecto
cd PA3-algoritmos

# 3. Compilar y ejecutar los algoritmos (Ejemplo para Java)
javac codigo/Actividad1_Pila.java
java codigo/Actividad1_Pila