package Laboratorio1.reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Reto4 {
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


    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> datos1 = List.of(
                Map.entry("A", 10),
                Map.entry("B", 20),
                Map.entry("A", 30),
                Map.entry("C", 40)
        );

        HashMap<String, Integer> resultadoHashMap = convertirAHashMap(datos1);
        System.out.println(resultadoHashMap);
        Hashtable<String, Integer> resultado = convertirAHashtable(datos1);
        System.out.println(resultado);
    }
}

