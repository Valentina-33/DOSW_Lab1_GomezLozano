package Laboratorio1.reto2;

import java.util.List;

public class CarreraParalela {

    public static int calcularMaximo(List<Integer> numeros) {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 7, 2, 9, 5);
        int maximo = calcularMaximo(numeros);
        System.out.println("El número máximo es: " + maximo);
    }
    
}
