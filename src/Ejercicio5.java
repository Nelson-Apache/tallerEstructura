import java.util.ArrayList;
import java.util.EmptyStackException;

// Clase genérica para la Pila
public class Ejercicio5<T> {

    //Creamos el conjunto de tipo ArrayList
    private ArrayList<T> elementos;

    // Constructor para inicializar la pila
    public Ejercicio5() {
        this.elementos = new ArrayList<>();
    }

    // Metodo para insertar un elemento en la pila (push)
    public void push(T elemento) {
        elementos.add(elemento);
    }

    // Metodo para extraer el elemento superior de la pila (pop)
    public T pop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }

    // Metodo para ver el elemento superior de la pila sin extraerlo (peek)
    public T peek() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }

    // Metodo para verificar si la pila está vacía
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public static void main(String[] args) {
        // Ejemplo con una pila de enteros
        Ejercicio5<Integer> pilaDeEnteros = new Ejercicio5<>();
        pilaDeEnteros.push(12);
        pilaDeEnteros.push(25);
        pilaDeEnteros.push(36);
        System.out.println("Elemento superior (peek): " + pilaDeEnteros.peek());
        System.out.println("Elemento extraído (pop): " + pilaDeEnteros.pop());
        System.out.println("Elemento extraído (pop): " + pilaDeEnteros.pop());
        System.out.println("¿Está vacía la pila de enteros?: " + pilaDeEnteros.estaVacia());

        // Ejemplo con una pila de cadenas
        Ejercicio5<String> pilaDeCadenas = new Ejercicio5<>();
        pilaDeCadenas.push("Doce");
        pilaDeCadenas.push("Venticinco");
        pilaDeCadenas.push("Treinta y seis");
        System.out.println("Elemento superior (peek): " + pilaDeCadenas.peek());
        System.out.println("Elemento extraído (pop): " + pilaDeCadenas.pop());
        System.out.println("Elemento extraído (pop): " + pilaDeCadenas.pop());
        System.out.println("¿Está vacía la pila de cadenas?: " + pilaDeCadenas.estaVacia());
    }
}
