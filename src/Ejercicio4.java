
// Clase genérica Caja
public class Ejercicio4<T> {

    // Variable para almacenar el contenido de la caja
    private T contenido;

    // Metodo para poner contenido en la caja
    public void poner(T contenido) {
        this.contenido = contenido;
    }

    // Metodo para sacar el contenido de la caja
    public T sacar() {
        return contenido;
    }

    // Metodo para verificar si la caja está vacía
    public boolean estaVacia() {
        return contenido == null;
    }

    public static void main(String[] args) {
        // Ejemplo con una caja de Integer
        Ejercicio4<Integer> cajaDeEnteros = new Ejercicio4<>();
        cajaDeEnteros.poner(123);
        System.out.println("Contenido de la caja de enteros: " + cajaDeEnteros.sacar());

        // Ejemplo con una caja de String
        Ejercicio4<String> cajaDeCadenas = new Ejercicio4<>();
        cajaDeCadenas.poner("Hola Mundo");
        System.out.println("Contenido de la caja de cadenas: " + cajaDeCadenas.sacar());

        // Verificar si la caja está vacía
        cajaDeCadenas.sacar();
        System.out.println("¿Está vacía la caja de cadenas?: " + cajaDeCadenas.estaVacia());
    }
}
