package Laboratorio1.reto3;

import java.util.stream.IntStream;

public class Reto3 {
    public static String repetirTresVeces(String mensaje) {
        String resultado = IntStream.range(0,3)
                .mapToObj(i -> mensaje)
                .collect(() -> new StringBuilder(), (r,s) -> {
                    if (!r.isEmpty()) r.append(" ");
                    r.append(s);
                },
                (sb1, sb2) -> sb1.append(sb2))
                .toString();

        return resultado.trim();
    }
    

    public static String invertir(String mensaje) {
        StringBuffer resultado = new StringBuffer(mensaje);
        return resultado.reverse().toString();

    }

    public static String particularEco(String mensaje) {
        return invertir(repetirTresVeces(mensaje));
    }

    public static void main(String[] args) {
        System.out.println(particularEco("Repetir"));
    }
}


