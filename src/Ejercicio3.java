import java.util.HashMap;
import java.util.Map;

//Creamos la clase generica
public class Ejercicio3<T> {
    private Map<T, Integer> mapaFrecuencia;

    // Constructor de la clase generica
    public Ejercicio3() {
        this.mapaFrecuencia = new HashMap<>();
    }

    // Metodo para contar la frecuencia de los elementos
    public void contar(T[] elementos) {
        for (T elemento : elementos) {
            if (mapaFrecuencia.containsKey(elemento)) {
                mapaFrecuencia.put(elemento, mapaFrecuencia.get(elemento) + 1);
            } else {
                mapaFrecuencia.put(elemento, 1);
            }
        }
    }

    // Metodo para obtener la frecuencia de un elemento
    public int obtenerFrecuencia(T elemento) {
        return mapaFrecuencia.getOrDefault(elemento, 0);
    }

    // Metodo para imprimir las frecuencias de todos los elementos
    public void imprimirFrecuencias() {
        for (Map.Entry<T, Integer> entrada : mapaFrecuencia.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso con palabras
        String texto = "Hola somos Estudiante des la universidad, Salome, Daniela, Nelson";

        // Convertir el texto en un array de palabras
        String[] palabras = texto.toLowerCase().split("\\s+");

        // Crear una instancia de ContadorDeFrecuencia para String
        Ejercicio3<String> contador = new Ejercicio3<>();

        // Contar las frecuencias de las palabras
        contador.contar(palabras);

        // Imprimir las frecuencias
        System.out.println("Frecuencia de palabras:");
        contador.imprimirFrecuencias();
    }
}
