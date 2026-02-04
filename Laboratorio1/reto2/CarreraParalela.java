package Laboratorio1.reto2;

import java.util.List;

public class CarreraParalela {

    public static int calcularMaximo(List<Integer> numeros) {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
    }

    private static int calcularMinimo(List<Integer> numeros) {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElseThrow();
    }

    private static int cantidadNumeros(List<Integer> numeros) {return numeros.size();}

    public static class Resultado {
        public int minimo;
        public int cantidad; 

        public Resultado (int minimo, int cantidad) {
            this.minimo = minimo;
            this.cantidad = cantidad;

        }
    }

    public static Resultado calcularMinResultado (List<Integer> numeros) {
        int minimo = calcularMinimo(numeros);
        int cantidad = cantidadNumeros(numeros);
        return new Resultado (minimo, cantidad);
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 7, 2, 9, 5);
        int maximo = calcularMaximo(numeros);
        System.out.println("El número máximo es: " + maximo);
        Resultado resultado = calcularMinResultado(numeros);

        System.out.println(String.format(
            "El número mínimo es: %d, y la cantidad de datos es %d", resultado.minimo, resultado.cantidad));
        
    }
}
    
