package Laboratorio1.reto3;

public class Reto3 {
    public static String invertir(String mensaje) {
        StringBuffer resultado = new StringBuffer(mensaje);
        return resultado.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(invertir("ana banana"));
        System.out.println(repetirTresVeces("Hola"));

    }

    public static String repetirTresVeces(String mensaje) {
        StringBuilder resultado = new StringBuilder();
        Runnable repetir = () -> resultado.append(mensaje).append(" ");

        repetir.run();
        repetir.run();
        repetir.run();

        return resultado.toString().trim();
    }
}


