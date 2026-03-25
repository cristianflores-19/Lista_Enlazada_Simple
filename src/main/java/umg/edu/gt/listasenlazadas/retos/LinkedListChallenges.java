package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

/**
 * Laboratorio de retos para obligar a extender el codigo base de las estructuras.
 *
 * Cada reto depende de un metodo nuevo que debe implementarse directamente
 * en la clase de estructura correspondiente.
 */
public final class LinkedListChallenges {

    private LinkedListChallenges() {
    }

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        challenge1CountOccurrences();
        System.out.println();
    }

    private static void challenge1CountOccurrences() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("LOGIN");

        System.out.println("Reto 1 - Analitica de eventos (lista simple)");
        System.out.println("Eventos: " + eventos);
        try {
            int totalLogins = eventos.countOccurrences("LOGIN");
            System.out.println("Resultado esperado para LOGIN: 3");
            System.out.println("Resultado obtenido: " + totalLogins);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
        
        eventos.clean();
        System.out.println("Eventos: " + eventos + " size: " + eventos.size());
        
        System.out.println();
        
     // --- PRUEBA RETO 3: Invertir Lista ---
        System.out.println("\nReto 3 - Invertir lista (in-place)");
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(2);
        numeros.addLast(4);
        numeros.addLast(5);
        numeros.addLast(6);
        System.out.println("Antes: " + numeros.toString());
        numeros.reverseInPlace();
        System.out.println("Despues: " + numeros.toString());

        // --- PRUEBA RETO 4: Eliminar Duplicados ---
        System.out.println("\nReto 4 - Eliminar duplicados");
        SinglyLinkedList<String> letras = new SinglyLinkedList<>();
        letras.addLast("A");
        letras.addLast("B");
        letras.addLast("A");
        letras.addLast("C");
        letras.addLast("B");
        letras.addLast("D");
        System.out.println("Antes: " + letras.toString());
        int borrados = letras.removeDuplicates();
        System.out.println("Despues: " + letras.toString());
        System.out.println("Nodos duplicados eliminados: " + borrados);
    }

}
