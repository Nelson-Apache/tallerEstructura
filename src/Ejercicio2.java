import java.util.HashSet;

//Creamos la clase generica
public class Ejercicio2<T> {
    private HashSet<T> conjunto;

    // Constructor de la Generica
    public Ejercicio2() {
        this.conjunto = new HashSet<>();
    }

    // Metodo para añadir un elemento al conjunto
    public void agregar(T elemento) {
        conjunto.add(elemento);
    }

    // Metodo para eliminar un elemento del conjunto
    public void eliminar(T elemento) {
        conjunto.remove(elemento);
    }

    // Metodo para comprobar si un elemento existe en el conjunto
    public boolean contiene(T elemento) {
        return conjunto.contains(elemento);
    }

    // Metodo para obtener el tamaño del conjunto
    public int tamano() {
        return conjunto.size();
    }

    // Metodo para vaciar el conjunto
    public void vaciar() {
        conjunto.clear();
    }

    // Metodo para mostrar los elementos del conjunto
    public void mostrarElementos() {
        for (T elemento : conjunto) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Ejercicio2<String> miConjunto = new Ejercicio2<>();

        //Agregamos elementos al conjunto
        miConjunto.agregar("Salome");
        miConjunto.agregar("Daniela");
        miConjunto.agregar("Nelson");

        //Mostrar el tamaño del conjunto
        System.out.println("Tamaño del conjunto: " + miConjunto.tamano());

        //Ver si el conjunto contiene 'Caceres'
        System.out.println("¿Contiene 'Caceres'?: " + miConjunto.contiene("Caceres"));

        //Eliminar del conjunto la palabra "Nelson"
        miConjunto.eliminar("Nelson");


        //Mostrar los elementos del conjutno
        System.out.println("Elementos en el conjunto:");
        miConjunto.mostrarElementos();

        //Vaciamos los elementos del conjunto
        miConjunto.vaciar();
        System.out.println("Tamaño después de vaciar: " + miConjunto.tamano());
    }
}
