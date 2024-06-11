//Desafio 16 - Agrupe os números em pares e ímpares:
//Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares
//e outra contendo os números ímpares da lista original, e exiba os resultados no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //encontrar numeros pares
        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0).toList();

        //encontrar numero impares
        List<Integer> numerosImpares = numeros.stream()
                .filter(numero -> numero % 2 != 0).toList();

        //imprimir o resultado
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números ímpares: " + numerosImpares);
    }
}
