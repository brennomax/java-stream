//Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Desafio14 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //encontrar os números primos
        List<Integer> numerosPrimos = numeros.stream()
                .filter(numero -> numero > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                        .allMatch(n -> numero % n != 0)).sorted().toList();

        Integer maiorPrimo = numerosPrimos.stream()
                .reduce((primeiro, segundo) -> segundo)
                .orElse(null);

        //imprimir o resultado
        System.out.println("Maior número primo: " + maiorPrimo);
    }
}
