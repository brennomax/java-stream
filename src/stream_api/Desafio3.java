//Desafio 3 - Verifique se todos os números da lista são positivos:
//Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

package stream_api;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //verificar se todos são números positivos
        boolean todosPositivos = numeros.stream()
                .allMatch(numero -> numero > 0);

        //imprimir o resultado
        if(todosPositivos) {
            System.out.println("Todos os números são positivos!");
        } else {
            System.out.println("Nem todos os números são positivos!");
        }
    }
}
