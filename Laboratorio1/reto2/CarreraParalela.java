package Laboratorio1.reto2;

import java.util.List;

public class CarreraParalela {

    public static int calcularMaximo(List<Integer> numeros) {
        int maximo = numeros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
        Boolean par = (maximo % 2 == 0) ? true : false;

        Boolean divisor = (2 % maximo == 0)? true : false;

        System.out.println(par ? "El número máximo es par" : "El número máximo es impar");
        System.out.println(divisor ? "El número máximo es divisor de dos" : "El número máximo no es divisor de dos");
        return maximo;
              
    }

    private static int calcularMinimo(List<Integer> numeros) {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElseThrow();
    }

    private static int cantidadNumeros(List<Integer> numeros) {
        int cantidad = numeros.size();
        Boolean impar = (cantidad % 2 == 0) ? false : true;
        System.out.println(impar ? "La cantidad de números en la lista es impar" : "La cantidad de números en la lista es par");
        return numeros.size();}


    public static class Resultado {
        public int maximo;
        public int minimo;
        public int cantidad; 

        public Resultado (int maximo, int minimo, int cantidad) {
            this.maximo = maximo;
            this.minimo = minimo;
            this.cantidad = cantidad;

        }
    }

    public static Resultado calcularMinResultado (List<Integer> numeros) {
        int maximo = calcularMaximo(numeros);
        int minimo = calcularMinimo(numeros);
        int cantidad = cantidadNumeros(numeros);
        return new Resultado (maximo, minimo, cantidad);
    }


    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 7, 2, 9, 5);

    
        Resultado resultado = calcularMinResultado(numeros);

        System.out.println(String.format(
            "El número mínimo es: %d, el máximo es: %d, y la cantidad de datos es %d", resultado.minimo, resultado.maximo, resultado.cantidad));
    }
}
    
