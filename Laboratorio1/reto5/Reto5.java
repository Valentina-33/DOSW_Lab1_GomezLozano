package Laboratorio1.reto5;

import java.util.HashSet;
import java.util.Set;
<<<<<<< HEAD
import java.util.TreeSet;
=======
>>>>>>> e84fdbf7f754a876c8fe69742c39fd341dda0ce4

public class Reto5 {

    public static Set<Integer> generarHashSetSinMultiplosDe3(Set<Integer> entrada) {
        // requisito: stream().filter()
        return entrada.stream()
                .filter(n -> n % 3 != 0)
                .collect(java.util.stream.Collectors.toCollection(HashSet::new));
    }

<<<<<<< HEAD
    public static Set<Integer> generarTreeSetSinMultiplosDe5(Set<Integer> entrada) {
        // requisito: stream().filter()
        return entrada.stream()
                .filter(n -> n % 5 != 0)
                .collect(java.util.stream.Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        // Ejemplo Entrada del PDF
        Set<Integer> hashSetEntrada = Set.of(4, 9, 15, 7, 18, 21, 10, 5);
        Set<Integer> treeSetEntrada = Set.of(12, 3, 25, 10, 7, 30, 18, 4);

        Set<Integer> a = generarHashSetSinMultiplosDe3(hashSetEntrada);
        Set<Integer> b = generarTreeSetSinMultiplosDe5(treeSetEntrada);

        System.out.println(a);
        System.out.println(b);
=======
    public static void main(String[] args) {
        // Ejemplo Entrada del PDF
        Set<Integer> hashSetEntrada = Set.of(4, 9, 15, 7, 18, 21, 10, 5);

        Set<Integer> a = generarHashSetSinMultiplosDe3(hashSetEntrada);

        System.out.println(a);
>>>>>>> e84fdbf7f754a876c8fe69742c39fd341dda0ce4
    }
}