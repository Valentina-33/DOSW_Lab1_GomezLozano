package Laboratorio1.reto2;

import java.util.List;
import java.util.stream.Collectors;

public class CarreraParalela {

    public static int calcularMaximo(List<Integer> numeros) {
        int maximo = numeros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();

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
        return cantidad;
    }

    static class Resultado {
        int maximo;
        int minimo;
        int cantidad;
        boolean maximoPar;
        boolean maximoDivisorDeDos;
        boolean cantidadPar;

        Resultado(int maximo, int minimo, int cantidad, boolean maximoPar, boolean maximoDivisorDeDos, boolean cantidadPar) {
            this.maximo = maximo;
            this.minimo = minimo;
            this.cantidad = cantidad;
            this.maximoPar = maximoPar;
            this.maximoDivisorDeDos = maximoDivisorDeDos;
            this.cantidadPar = cantidadPar;
        }
    }

    public static Resultado granMetaAuxiliar(List<Integer> numeros) {
        int maximo = calcularMaximo(numeros);
        int minimo = calcularMinimo(numeros);
        int cantidad = cantidadNumeros(numeros);

        boolean maximoPar = (maximo % 2 == 0) ? true : false;
        boolean maximoDivisor = (2 % maximo == 0) ? true : false;

        boolean cantidadPar = (cantidad % 2 == 0) ? true : false;

        return new Resultado(maximo, minimo, cantidad, maximoPar, maximoDivisor, cantidadPar);
    }

    public static class GranMeta {
        private final String mensaje;
        
        public GranMeta (List<List<Integer>> listas) {

            String cuerpo = listas.stream()
            .map(lista -> granMetaAuxiliar(lista))
            .map (r -> String.format(
                "Min: %d | Max: %d | Cantidad: %d | MaxPar: %b | Divisor2: %b | CantPar: %b", 
                r.minimo, r.maximo, r.cantidad,
                r.maximoPar, r.maximoDivisorDeDos, r.cantidadPar
            )).collect(Collectors.joining(" y la segunda lista tiene: "));
            
            this.mensaje = "La primera lista tiene: " + cuerpo;
        }

        public String getMensaje () { return this.mensaje; }

    }

    public static void main(String[] args) {
        List<List<Integer>> listas = List.of(List.of(3, 7, 2, 9, 5),List.of(1, 45, 67, 21, 12,11,100));

        GranMeta mensajeFinal = new GranMeta(listas);

        System.out.println(mensajeFinal.getMensaje());

    }
}