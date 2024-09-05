import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//Se crea la clase generica
public class Ejercicio1<T> {

    //Se crean las listas ArrayList y LinkedList
    private List<T> arrayList;
    private List<T> linkedList;

    //Creamos Constructor
    public Ejercicio1() {
        this.arrayList = new ArrayList<>();
        this.linkedList = new LinkedList<>();
    }


    //Metodo de mostrar tiempos de insercion
    public void measureInsertionTime(T element, int numeroIteraciones) {
        System.out.println("Medición del tiempo de inserción...");

        // Medición del tiempo de inserción de ArrayList
        long tiempoInicial = System.nanoTime();
        for (int i = 0; i < numeroIteraciones; i++) {
            arrayList.add(element);
        }
        long tiempoFinal = System.nanoTime();
        long arrayListInsertionTime = tiempoFinal - tiempoInicial;
        System.out.println("ArrayList insertado en el tiempo: " + arrayListInsertionTime + " ns");

        // Medicion del tiempo de Insercion de LinkedList
        tiempoInicial = System.nanoTime();
        for (int i = 0; i < numeroIteraciones; i++) {
            linkedList.add(element);
        }
        tiempoFinal = System.nanoTime();
        long linkedListInsertionTime = tiempoFinal - tiempoInicial;
        System.out.println("LinkedList insertado en el tiempo: " + linkedListInsertionTime + " ns");
    }

    //Medicion del tiempo de Eliminacion
    public void measureRemovalTime() {
        System.out.println("Medicion del tiempo de eliminacion...");

        // Medicion del tiempo de Eliminacion en ArrayList
        long tiempoInicial = System.nanoTime();
        arrayList.clear();
        long tiempoFinal = System.nanoTime();
        long arrayListRemovalTime = tiempoFinal - tiempoInicial;
        System.out.println("ArrayList removido en el tiempo: " + arrayListRemovalTime + " ns");

        // Medicion de tiempo al eliminar el LinkedList
        tiempoInicial = System.nanoTime();
        linkedList.clear();
        tiempoFinal = System.nanoTime();
        long linkedListRemovalTime = tiempoFinal - tiempoInicial;
        System.out.println("LinkedList removido el tiempo: " + linkedListRemovalTime + " ns");
    }


    //Medicion del tiempo de Acceso
    public void measureAccessTime(int index) {
        System.out.println("Medicion del tiempo de acceso...");

        // Medicion de tiempo de acceso para ArrayList
        long tiempoInicial = System.nanoTime();
        arrayList.get(index);
        long tiempoFinal = System.nanoTime();
        long arrayListAccessTime = tiempoFinal - tiempoInicial;
        System.out.println("ArrayList accedido en el tiempo: " + arrayListAccessTime + " ns");

        // Medicion del tiempo de LinkedList
        tiempoInicial = System.nanoTime();
        linkedList.get(index);
        tiempoFinal = System.nanoTime();
        long linkedListAccessTime = tiempoFinal - tiempoInicial;
        System.out.println("LinkedList accedido en el tiempo: " + linkedListAccessTime + " ns");
    }

    //Main
    public static void main(String[] args) {
        int numeroIteraciones = 200000;

        //Llamamos la a la clase generica
        Ejercicio1<Integer> performanceTest = new Ejercicio1<>();

        // Medicion de tiempo de insercion
        performanceTest.measureInsertionTime(1, numeroIteraciones);

        // Medicion de tiempo de acceso
        performanceTest.measureAccessTime(numeroIteraciones / 2);

        // Medicion de tiempo de eliminacion
        performanceTest.measureRemovalTime();
    }
}
