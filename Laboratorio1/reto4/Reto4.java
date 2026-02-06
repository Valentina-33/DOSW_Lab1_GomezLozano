package Laboratorio1.reto4;

import java.util.Hashtable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reto4 {
    public static Hashtable<String,Integer> convertirAHashtable(List<Map.Entry<String,Integer>> pares) {
        Hashtable<String,Integer> resultado = new Hashtable<>();
        for (Map.Entry<String,Integer> p : pares) {
            String key = p.getKey();
            int valor = p.getValue();
            if(!resultado.containsKey(key)){
                resultado.put(key,valor);
            }
        }
        return resultado;
    }

    public static HashMap<String,Integer> convertirAHashMap(List<Map.Entry<String,Integer>> tuplas) {
        HashMap<String,Integer> resultado = new HashMap<>();
        for (Map.Entry<String,Integer> t : tuplas) {
            String key = t.getKey();
            int valor = t.getValue();
            if(!resultado.containsKey(key)){
                resultado.put(key,valor);
            }
        }
        return resultado;
    }

    public static Map<String, Integer> combinarMapas(Hashtable<String, Integer> mapa1, HashMap<String, Integer> mapa2) {
        Map<String, Integer> combinado = new Hashtable<>();

        combinado.putAll(mapa1);

        for (Map.Entry<String, Integer> e : mapa2.entrySet()) {
            combinado.putIfAbsent(e.getKey(), e.getValue());
        }

        return combinado;
    }

    public static void imprimirOrdenadoYMayusculas(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(e -> "Clave: " + e.getKey().toUpperCase() + " | "
                        + "Valor: " + e.getValue())
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> datos1 = List.of(
                Map.entry("A", 10),
                Map.entry("B", 20),
                Map.entry("A", 30),
                Map.entry("C", 40)
        );

        List<Map.Entry<String, Integer>> datos2 = List.of(
                Map.entry("A", 10),
                Map.entry("B", 20),
                Map.entry("A", 30),
                Map.entry("C", 40),
                Map.entry("D", 50)
        );

        HashMap<String, Integer> resultadoHashMap = convertirAHashMap(datos1);
        Hashtable<String, Integer> resultadoHashtable = convertirAHashtable(datos2);
        imprimirOrdenadoYMayusculas(combinarMapas(resultadoHashtable,resultadoHashMap));
    }
}