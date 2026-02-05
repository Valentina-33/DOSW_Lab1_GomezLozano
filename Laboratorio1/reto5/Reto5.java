package Laboratorio1.reto5;

import java.util.HashSet;
import java.util.Set;

public class Reto5 {

    public static Set<Integer> generarHashSetSinMultiplosDe3(Set<Integer> entrada) {
        // requisito: stream().filter()
        return entrada.stream()
                .filter(n -> n % 3 != 0)
                .collect(java.util.stream.Collectors.toCollection(HashSet::new));
    }

    public static void main(String[] args) {
        // Ejemplo Entrada del PDF
        Set<Integer> hashSetEntrada = Set.of(4, 9, 15, 7, 18, 21, 10, 5);

        Set<Integer> a = generarHashSetSinMultiplosDe3(hashSetEntrada);

        System.out.println(a);
    }
}