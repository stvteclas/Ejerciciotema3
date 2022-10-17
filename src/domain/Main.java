package domain;

public class Main {
    public static void main(String[] args) {
        String[] textos = {"Arde en tus ojos un misterio, virgen", " esquiva y compañera.", " No sé si es odio o es amor la lumbre", " inagotable de tu aliaba negra."};
        String resultado="";
        for (String texto: textos) {
            resultado += texto;
        }
        System.out.println("Autor 'Antonio Machado' = " + resultado);


    }
}